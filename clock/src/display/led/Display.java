package display.led;

public class Display
{
    //类是public指该类可任意使用，同时类名与文件名相同；一个文件仅有一个public类
    private int value;
    //私有，仅在类内才可以访问:成员函数内；定义初始时。
    //main 也是成员函数，故在main内也可以访问
    //private是针对类，而不是针对对象的，所以别的同类对象也可以访问
    //默认为friendly，同一个包下其他类可访问
    private int limit;
    private static int step = 1;
    //类变量：可通过类或对象访问，但类与所有对象共享该值；
    // 初始化仅在类的装载时做一次
    // TODO：（即第一次初始化一个对象）

    public Display(int limit)
    {
        this.limit = limit;
    }

    public void increase()
    {
        value++;
        if (value == limit)
        {
            value = 0;
        }
    }

    public int getValue()
    {
        return value;
    }

    public static void main(String[] args)
    {
        //类函数：使用方法同类变量，同时static函数仅可以访问static变量
//        Display d = new Display(24);
//        for (; ; )
//        {
//            d.increase();
//            System.out.println(d.getValue());
//        }
        Display d1=new Display(10);
        Display d2=new Display(20);
        d1.increase();
        System.out.println(d1.getValue());
        System.out.println(d2.getValue());
        System.out.println(d1.step);
        System.out.println(d2.step);
        d1.step=2;
        System.out.println(d1.step);
        System.out.println(d2.step);
        Display.step=3;
        System.out.println(d1.step);
        System.out.println(d2.step);
    }
}
