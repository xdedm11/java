package io;

import java.io.*;

class Student implements Serializable
{  //对象串行化
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    public static void main(String[] args)
    {
        try
        {
            Student s1 = new Student("Nick", 22, 88);
            System.out.println(s1);
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("obj.dat")
            );
            out.writeObject(s1);
            out.close();

            ObjectInputStream in =new ObjectInputStream(
                    new FileInputStream("obj.dat")
            );
            Student s2 =(Student) in.readObject();
            System.out.println(s2);
            in.close();
            System.out.println(s1==s2); //值相同，但s2是新构造的，不是同一个对象
        } catch (IOException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
