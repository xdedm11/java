package hello;

public class Function_java
{
    public static boolean isPrime(int i)
    {
//        类型转换：char->int->double
        boolean isPrime = true;
        for (int k = 2; k < i; k++)
        {
            if (i % k == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args)
    {
        int cnt = 0;
        int n = 100;
        for (int i = 2; i < n; i++)
        {
            if (isPrime(i))
            {
                cnt++;
            }
        }
        System.out.print("n以下有" + cnt + "个素数");
    }
}
