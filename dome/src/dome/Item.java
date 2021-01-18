package dome;

public class Item
{
    private String title;     //protected 可继承给子类
    private int playingTime;
    private boolean gotIt = false;
    private String comment;

    public Item(String title, int playingTime, String comment)
    {
        this.title = title;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public void print()
    {
        System.out.print(title);
    }
}
