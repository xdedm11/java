package hello;

import java.util.Scanner;

public class Factor {

    public static void main(String[] args) {
        // boolean ={true,false}
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int i = 1;
        int factor = 1;
        OUT://标号
        for (int i = 1; i <= n; i = i + 1)
        {
            // break;
            factor = factor * i;
            if(i>10)
            {
                break OUT;
            }
        }
        System.out.println(factor);

    }

}
