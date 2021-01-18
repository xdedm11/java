package animal;

import cell.Cell;

import java.awt.*;
import java.util.ArrayList;

public class Fox extends Animal implements Cell
{
    //实现接口implements
    public Fox()
    {
        super(20, 4);
    }

    @Override // 实现接口Cell中的draw()
    public void draw(Graphics g, int x, int y, int size)
    {
        int alpha = (int) ((1 - getAgePercent()) * 255);
        g.setColor(new Color(0, 0, 0, alpha));
        g.fillRect(x, y, size, size);
    }

    @Override
    public Animal breed()
    {
        //造小孩
        Animal ret = null;
        if (isBreedable() && Math.random() < 0.05)
        {
            ret = new Fox();
        }
        return ret;
    }

    @Override
    public String toString()
    {
        return ("Fox:" + super.toString());
    }

    @Override
    public Animal feed(ArrayList<Animal> neighbor)
    {
        Animal ret = null;
        if (Math.random() < 0.2)
        {
            ret = neighbor.get((int) (Math.random() * neighbor.size()));    //邻居中随机选一个返回
            longerLife(2);
        }
        return ret;
    }
}
