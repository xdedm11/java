package foxnrabbit;

import field.Field;
import field.View;
import field.Location;
import animal.Animal;
import animal.Fox;
import animal.Rabbit;
import cell.Cell;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;


public class FoxAndRabbit
{
    private Field theField;
    private View theView;
    private JFrame frame;

    //内部类(成员)能访问全部外部资源
    //内部内包括类内部、函数内部两种。外部是函数时只能访问函数内final变量
//    private class StepListener implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e)
//        {
//            step();
//            frame.repaint();
//        }
//    }

    public FoxAndRabbit(int size)
    {
        theField = new Field(size, size);
        for (int row = 0; row < theField.getHeight(); row++)
        {
            for (int col = 0; col < theField.getWidth(); col++)
            {
                double probability = Math.random();
                if (probability < 0.05)
                {
                    theField.place(row, col, new Fox());
                } else if (probability < 0.15)
                {
                    theField.place(row, col, new Rabbit());
                }
            }
        }
        theView = new View(theField);
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Cells");
        frame.add(theView); //默认BorderLayout.CENTER
        JButton btnStep=new JButton("单步");
        frame.add(btnStep, BorderLayout.NORTH);
//        btnStep.addActionListener(new StepListener());
        //匿名类：new对象时给出类的定义形成的类；匿名类一定是内部类
        btnStep.addActionListener(new ActionListener()
//                btnStep.removeActionListener();
        {
            //ActionListener是接口     反转控制/注入反转
            @Override
            public void actionPerformed(ActionEvent e)
            {
                step();
                frame.repaint();
            }
        });
        frame.pack();
        frame.setVisible(true);
    }

    public void start(int steps)
    {
        for (int i = 0; i < steps; i++)
        {
            step();
            theView.repaint();
            /*
            * business logic:try内依次执行任务，然后catch异常
            * */
            try
            {
                Thread.sleep(200);
            } catch (InterruptedException e)    //捕捉异常
            {
                System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();    //函数调用过程
//                throw e;                //再度抛出，如果嵌套捕捉两次，则两次都可捕捉到；如果没有throw则仅最内层捕捉
            }
        }
    }

    public void step()
    {
        for (int row = 0; row < theField.getHeight(); row++)
        {
            for (int col = 0; col < theField.getWidth(); col++)
            {
                Cell cell = (Cell) theField.get(row, col);
                if (cell != null)
                {
                    Animal animal = (Animal) cell;
                    animal.grow();
                    if (animal.isAlive())
                    {
                        // *move
                        Location loc = animal.move(theField.getFreeNeighbor(row, col));
                        if (loc != null)
                            theField.move(row, col, loc);
                        // *eat
                        Cell[] neighbor = (Cell[]) theField.getNeighbor(row, col);
                        ArrayList<Animal> listRabbit = new ArrayList<Animal>();
                        for (Cell an : neighbor)
                        {
                            if (an instanceof Rabbit)
                            {
                                listRabbit.add((Rabbit) an);
                            }
                        }
                        if (!listRabbit.isEmpty())
                        {
                            Animal fed = animal.feed(listRabbit);
                            if (fed != null)
                                theField.remove((Cell) fed);
                        }
                        // *breed
                        Animal baby = animal.breed();
                        if (baby != null)
                        {
                            theField.placeRandomAdj(row, col, (Cell) baby);
                        }
                    } else
                    {
                        theField.remove(row, col);
                    }
                }
            }
        }
    }

    public static void main(String[] args)
    {
        FoxAndRabbit fnr = new FoxAndRabbit(20);
//        fnr.start(100);
    }
}
