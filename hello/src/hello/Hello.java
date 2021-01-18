package hello;//package hello;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 变量、赋值
        System.out.println("hello.Hello World");
        Scanner in = new Scanner(System.in);
        System.out.println("echo:" + in.nextLine());

        int price;
        price = in.nextInt();
        System.out.println("2+"+price+"="+(2+price));
//		System.out.println("2+3="+(2+3));

        final int amount = 0;   //final指常量
        System.out.println(amount);


        // 浮点数 nextInt 读入赋给double可自动转换
        System.out.println(10/3.0);
        System.out.println((int)(2.3));

        // 关系运算
        System.out.println(5==5.0);
        System.out.println(5==4.0+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1);
        System.out.println(Math.abs(5-(4.0+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1))<1e-6);


        // 判断
        if(price>10)
        {
            System.out.println("price>10");
        }
        else if(price<10)
        {
            System.out.println("price<10");
        }
        else
        {
            System.out.println("price=10");
        }
        // switch-case与c相同


        // 循环 while(){}

    }

}
