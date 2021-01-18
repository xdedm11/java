package castle;

public class HandlerBye extends Handler
{
    public HandlerBye(Game game)
    {
        super(game);
    }

    @Override
    public void doCmd(String word)
    {
        super.doCmd(word);
    }

    @Override
    public boolean isBye()
    {
        return true;
    }
}
