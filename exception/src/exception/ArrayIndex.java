package exception;

class OpenException extends Throwable
{
}

class closeException extends Throwable
{
}

//class newException extends Exception{}
public class ArrayIndex
{
    //static成员方法，仅可访问static成员变量
    public static int open()
    {
        return -1;
    }

    public void f() throws OpenException, closeException
    {
    }

    public static void readFile() throws OpenException, closeException
    //声明函数是会抛出异常的（系统运行异常不需要声明）
    //可以先声明抛出该异常，而实际上不抛；调用函数时必须都catch
    {
        if (open() == -1)
        {
            throw new OpenException();
            /*
             * 可以throw：继承了Throwable类的对象（包括Exception）
             * Exception有两种构造：new Exception();new Exception("HELP");
             * */
        }
    }

    public static void main(String[] args)
    {
        try
        {
            readFile();
        } catch (OpenException e)
        //父类捕捉器可以catch子类异常，但捕捉顺序是按照代码书写顺序来的。
        // 因此不能把子类异常的catch放到父类catch后面，因为永远捕捉不到。
        // 可以把Exception放在最后的catch上，即可捕捉所有异常
        {
            e.printStackTrace();
        } catch (closeException e)
        {
            e.printStackTrace();
        }
    }
}

class NewClass extends ArrayIndex
{
//    public static void readFile() throws OpenException
//    {
//    }
    public void f() throws OpenException{}

    public static void main(String[] args)
    {
        // 子类覆盖一个函数时，不能声明比父类更多的异常。（向上造型时父类对象会调用子类函数）
        // 但在子类的构造函数中，由于构造时会调用父类构造函数，所以必须声明父类构造函数抛的全部异常（可以比父类构造函数抛出的异常多）
        ArrayIndex p = new NewClass();//upcast
        try
        {
            p.f();
        } catch (OpenException e)
        {
            e.printStackTrace();
        }
        catch (closeException e)
        //编译器进行代码检查时，看到的是静态绑定，所以也需要catch向上造型时父类的异常。
        // 同时声明子类函数时，可以声明少于父类异常数的异常,见61行
        {
            e.printStackTrace();
        }
    }
}
