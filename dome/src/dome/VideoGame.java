package dome;

public class VideoGame extends Item //可扩展性
{
    private int numbersofplayers;

    public VideoGame(String title, int playingTime, String comment, int numbersofplayers)
    {
        super(title, playingTime, comment);
        this.numbersofplayers = numbersofplayers;
    }

    @Override
    public void print()
    {
        System.out.print("VideoGame:");
        super.print();
    }
}
