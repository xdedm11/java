package hello;

import java.util.Scanner;

public class String_java
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char c = '中';
        c++;    //unicode编码
        System.out.println(c);

        char u = '\u0041';    //A的unicode编码为65，是41的十六进制表示
        System.out.println(u);

        System.out.println("********************************逃逸字符***********************************************");
        System.out.println("abc\b");    //回退一格
        System.out.println("abc\bd");   //tab
        System.out.println("abc\t123");
        System.out.println("a\t123");

        System.out.println("********************************包裹类型***********************************************");
        System.out.println("boolean-Boolean");
        System.out.println("char-Character");
        System.out.println("int-Integer");
        System.out.println("double-Double");
        Integer k = 10;
        System.out.println(k.toString());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.toLowerCase('A'));

        System.out.println("********************************Math***********************************************");
        System.out.println(Math.abs(-12));
        System.out.println(Math.round(10.345));
        System.out.println(Math.random());
        System.out.println(Math.pow(2, 3));

        System.out.println("********************************字符串String***********************************************");
        //String也是对象的管理者，故==指判断是否共同管理一个字符串，可用s.equals()判断内容是否相同;不改变原字符串
        String s = new String("a string");
        s = in.nextLine();    //读一行
//        s = in.next();        //读一个单词
        System.out.println(s + " hi");
        System.out.println(s.equals("abc"));
        System.out.println(s.compareTo("abc"));
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,5));

    }

}
