package io;

import java.io.*;

public class Hello
{
    public static void main(String[] args)
    {
//        System.out.println("hello world");
//        byte[] buffer = new byte[1024];
//        try
//        {
//            //一个汉字三个字节(utf-8)，一个长度/字符
//            int len = System.in.read(buffer);
//            String s = new String(buffer, 0, len);
//            System.out.println("读到了" + len + "字节");
//            System.out.println(s);
//            System.out.println("s的长度" + s.length());
//        } catch (IOException e)
//        {
//            e.printStackTrace();
//        }

        System.out.println("-------------------file---------------");
        byte[] buf = new byte[10];
        for (int i = 0; i < buf.length; i++)
        {
            buf[i] = (byte) i;
        }
        try
        {
            FileOutputStream out = new FileOutputStream("a.dat");
            out.write(buf);
            out.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("-------------------stream filter----------------");
        try
        {
            DataOutputStream out = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("a.dat")
                    )
            );
            int i = 0xcafebabe;
            out.writeInt(i);
            out.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("------------------file-stream----------------");
        try
        {
            PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("a.txt")
                    )
            );
            int i = 123456;
            out.println(i);
            out.close();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/io/Hello.java")
                    )
            );
            String line;
            while ((line = in.readLine()) != null)
            {
                System.out.println(line);
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("------------------utf-8----------------");
        try
        {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("utf8.txt"), "utf8"
                    )
            );
            String line;
            while ((line = in.readLine()) != null)
            {
                System.out.println(line);
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
//        if (数据是二进制的)
//        {
//            InputStream
//        } else
//        {
//            if (表达的是文本)
//            {
//                Reader
//            } else
//            {
//                Scanner
//            }
//        }
    }
}
