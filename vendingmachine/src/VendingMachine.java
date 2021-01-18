import java.net.http.WebSocket;

public class VendingMachine
{
    int price = 80;
    int balance;        //成员变量默认为0
    int total;

    VendingMachine()
    {
        System.out.println("构造函数(无参数)");
    }

    VendingMachine(int total)   //  重载
    {
        this();     //调用另外的构造函数，仅出现在构造函数体内第一行
        System.out.println("构造函数（传入total）");
        this.total = total;
    }

    void setPrice(int price)
    {
        this.price = price;     //this指调用该成员函数/变量的对象
    }

    void showPrompt()
    {
        System.out.println("Welcome");
    }

    void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    void showBalance()
    {
        System.out.println(balance);
    }

    void getFood()
    {
        if (balance >= price)
        {
            System.out.println("Here");
            balance = balance - price;
            total = total + price;
        }
    }

    public static void main(String[] args)
    {
        // 对象变量是对象的管理者
        VendingMachine vm = new VendingMachine(100);
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(100);
        vm.getFood();
        vm.showBalance();
        VendingMachine vm1=new VendingMachine();
    }
}
