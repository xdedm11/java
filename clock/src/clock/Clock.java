package clock;

import display.led.Display; //不同包下需要import，如果不import，则在使用Display时需要前加display.
//import display.*;   //通配符，全部import

public class Clock
{
    private Display hour = new Display(24);
    private Display minute = new Display(60);

    public void start()
    {
        while (true)
        {
            minute.increase();
            if (minute.getValue() == 0)
            {
                hour.increase();
            }
            System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
        }
    }

    public static void main(String[] args)
    {
        Clock clock = new Clock();
        clock.start();
    }
}
