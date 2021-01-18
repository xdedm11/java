import java.util.HashMap;
//import java.util.HashSet;
import java.util.Scanner;

public class Coin
{
    private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();

    public String getname(int amount)
    {
        if (coinnames.containsKey(amount))
        {
            return coinnames.get(amount);
        } else
        {
            return "NOT FOUND";
        }
    }

    public Coin()
    {
        coinnames.put(1, "penny");
        coinnames.put(10, "dime");
        coinnames.put(25, "quarter");
        coinnames.put(50, "half-dollar");
        coinnames.put(50, "五毛");    //覆盖原来键对应值
        System.out.println(coinnames);
        System.out.println(coinnames.keySet().size());  //键
        for (String s : coinnames.values())             //值
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        Coin coin = new Coin();
        String name = coin.getname(amount);
        System.out.println(name);

    }
}
