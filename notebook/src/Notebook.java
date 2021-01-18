import java.util.ArrayList;
import java.util.HashSet;

class Value
{
    private int i;

    public void set(int i)
    {
        this.i = i;
    }

    public int get()
    {
        return i;
    }

    public String toString()
    {
//        Java的任一类，只要实现该函数，即可直接输出对象
        return "" + i;
    }
}

public class Notebook
{
    private ArrayList<String> notes = new ArrayList<String>();

    //  泛型类：容器类型Arraylist；元素类型：String       可以用for-each
    public void add(String s)
    {
        notes.add(s);
    }

    public void add(String s, int location)
    {
        notes.add(location, s);
    }

    public int getSize()
    {
        return notes.size();
    }

    public String getNote(int index)
    {
        return notes.get(index);
    }

    public void removeNote(int index)
    {
        notes.remove(index);
    }

    public String[] list()
    {
        String[] a = new String[notes.size()];
        // String数组元素默认初始化为null（管理者）
//        for (int i = 0; i < notes.size(); i++)
//        {
//            a[i] = notes.get(i);
//        }
        notes.toArray(a);
        return a;
    }

    public static void main(String[] args)
    {
        Notebook mynote = new Notebook();
        mynote.add("first");
        mynote.add("second");
        mynote.add("third", 1);
        System.out.println(mynote.getSize());
        System.out.println(mynote.getNote(1));
        mynote.removeNote(2);
        System.out.println("全部内容为：");
        String[] a = mynote.list();
        for (String s : a)
        {
            System.out.println(s);
        }
        
        System.out.println("-------------------对象for-each-------------------------");
        Value[] a1 = new Value[10];
        for (int i = 0; i < a1.length; i++)
        {
            a1[i] = new Value();
            a1[i].set(i);
            System.out.println(a1[i].get());
        }
        System.out.println("a[0]="+a1[0]);   //用toString实现的直接输出功能
        System.out.println("for-each");
        for (Value v : a1)
        {
            v.set(0);//v也管理a[]元素管理对象（共同管理），故可更改对象成员变量
            System.out.println(v.get());
        }
        
        System.out.println("-------------------Hashset-------------------------");
        HashSet<String> s = new HashSet<String>();
        s.add("first");
        s.add("second");
        s.add("first");//set中无重复元素,不排序
//        for (String k:s){
//            System.out.println(k);
//        }
        System.out.println(s);
    }
}
