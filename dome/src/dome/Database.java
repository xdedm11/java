package dome;

import java.util.ArrayList;

public class Database
{
//    private ArrayList<CD> listCD = new ArrayList<CD>();
//    private ArrayList<DVD> listDVD = new ArrayList<DVD>();
    private ArrayList<Item> listItem =new ArrayList<Item>();

//    public void add(CD cd)
//    {
//        listCD.add(cd);
//    }
//    public void add(DVD dvd)
//    {
//        listDVD.add(dvd);
//    }
    public void add(Item item)
    {
        listItem.add(item);
    }

    public void list()
    {
//        for (CD cd : listCD)
//        {
//            cd.print();
//        }
//        for (DVD dvd:listDVD){
//            dvd.print();
//        }
        for (Item item:listItem){
            item.print();
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        /*
        * Java的对象变量是多态的，能保存多种类型的对象
        *   静态类型：声明的时候的类型
        *   动态类型：运行时的实际类型（静态类型或静态类型的子类）
        *   子类和父类中名称、参数完全相同的函数构成覆盖关系，调用成员函数时优先调用动态类型对应成员函数（即动态绑定）
        * 向上造型：把子类对象赋给父类变量（动态类型实际上没变）
        *   注：不能反过来，即使父类对象的动态类型为该子类类型
        *       （不过强制类型转换后可以）（强制类型转换只有在动态类型符合时才可转换成功）
        *   注：Java中不存在对象对 对象的赋值（只是管理对象的改变）
        * */
        Database db = new Database();
        CD cd1 = new CD("Title", "Aritst", 3, 60, "...");
        Item cd2 = new CD("Title2", "Aritst2", 4, 70, "...");
        //子类的对象可以赋值给父类变量(upcast),调用函数时动态绑定
        DVD dvd = new DVD("TitleDvd", "Director",  150, "...");

        db.add(cd1);
        //子类的对象可以放在父类容器中
        db.add(cd2);
        db.add(dvd);

        db.add(new VideoGame("videotitle",233,"...",234));
        db.list();

        System.out.println("---------------------------Object类-----------------------------");
//        Object o =new Object();
//        o.equals();
//        o.toString();
    }
}
