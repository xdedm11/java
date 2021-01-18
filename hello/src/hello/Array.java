package hello;

import java.util.Scanner;

public class Array
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        int cnt;
        cnt = in.nextInt();
        if (cnt > 0)
        {
            int[] numbers = new int[cnt];    //定义数组,自动初始化为全0数组;
//            int[] scores = {1, 2, 3};
//            int[] b = numbers;
//            数组变量是管理者，所以改变b也会改变numbers，数组变量间的赋值是管理权限的赋予，数组变量间的比较是判断是否共同管理一个数组，数组变量间的复制可通过逐元素赋值来实现
            for (int k : numbers)       //for-each循环
            {
                System.out.print(k + "  ");     //for-each循环不可更改数组元素
            }
            for (int i = 0; i < cnt; i++)
            {
                numbers[i] = in.nextInt();
                sum += numbers[i];
            }
            double average = sum / cnt;
            for (int i = 0; i < numbers.length; i++)    //数组长度
            {
                if (numbers[i] > average)
                {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
