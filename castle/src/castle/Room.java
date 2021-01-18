package castle;

import java.util.HashMap;

public class Room
{
    private String description;
    private HashMap<String, Room> exits = new HashMap<String, Room>();

    public String getExitDesc()
    {
        StringBuffer sb = new StringBuffer();
        //String无法被修改，所以＋时会产生新的对象
        for (String dir : exits.keySet())
        {
            sb.append(dir);
            sb.append(' ');
        }
        return sb.toString();
    }

    public Room getExit(String direction)
    {
        Room ret = exits.get(direction);
        return ret;
    }

    public Room(String description)
    {
        this.description = description;
    }

    public void setExit(String dir, Room room)
    {
        exits.put(dir, room);
    }

    @Override
    public String toString()
    {
        return description;
    }
}
