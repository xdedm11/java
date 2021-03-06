package dome;

public class DVD extends Item
{
    private String director;

    public DVD(String title, String director, int playingTime, String comment)
    {
        super(title,playingTime,comment);
        this.director = director;
    }

    public void print()
    {
        System.out.print("DVD:");
        super.print();         //调用同名父类成员函数
        System.out.print(" "+director);
    }

    public static void main(String[] args)
    {
        DVD dvd = new DVD("TitleDvd", "Director",  150, "...");
        dvd.print();
    }
}
