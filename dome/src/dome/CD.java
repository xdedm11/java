package dome;

public class CD extends Item
{
    private String artist;
    private int numofTracks;

    @Override   //覆盖了父类的函数
    public String toString()
    {
        return "CD{" +
                "artist='" + artist + '\'' +
                ", numofTracks=" + numofTracks +
                '}';
    }

    @Override
    public boolean equals(Object obj)
    {
        CD cc=(CD) obj; //向下造型 之前传入的obj内部是没有artist成员的
        return artist.equals(cc.artist);
    }

    public CD(String title, String artist, int numofTracks, int playingTime, String comment)
    {
        super(title, playingTime, comment);
        this.artist = artist;
        this.numofTracks = numofTracks;
    }

    public static void main(String[] args)
    {
        CD cd1 = new CD("Title", "Aritst", 3, 60, "...");
        //构造顺序：父类定义初始化、父类构造、自身定义初始化、自身构造
        cd1.print();    //若自身函数与父类不同名，则直接调用即可
        System.out.println();
        System.out.println(cd1.toString());

        CD cd2 = new CD("Titlecd2", "Aritst", 3, 60, "...");
        System.out.println(cd1.equals(cd2));
    }

    public void print()
    {
        System.out.print("CD:");
        super.print();
        System.out.print(" "+artist);
    }
}
