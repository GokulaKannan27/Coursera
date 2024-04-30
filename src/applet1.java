/*class app
{
    public app()
    {
        System.out.println("Hello World!....");
    }
    public void display()
    {
        System.out.println("Rest of code.....");
    }
}
public class applet1 extends app
{
    public applet1()
    {
        System.out.println("Hello");
    }
    public void display()
    {
        System.out.println("....Rest of it");
        super.display();
    }
    public static void main(String[] args) {
        applet1 a=new applet1();
        a.display();
    }
}*/

/*interface world{
    String n="Hello";
    public void show();
}
class applet implements world
{
    public applet() {
        System.out.println("We...");
    }
    public void show() {
     System.out.println("Welcome...");
    }
}
public class applet1 extends applet
{
    public static void main(String[] args) {
        applet a=new applet();
        a.show();
    }
}

public class applet1
{
    String a;

    public void string()
    {
        a="Hello";
        String c=a.substring(0,3);
        System.out.println(c);
    }

    public void convert()
    {

        char[] s=a.toCharArray();
        for(char i:s)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int a;
        /*a = Integer.parseInt(args[1]);
        applet1 v=new applet1();
        v.string();
        v.convert();
        int b=10,c=344;
        int d=(b>c)?b:c;
        System.out.println(d);
    }
}*/
import java.util.*;
/*class except extends Exception
{
    public except(String s)
    {
        super(s);
    }
}
public class applet1 extends except
{
    public applet1(String s) {
        super(s);
    }

    public static void main(String[] args) {
        int a=10;

        try{
            double b=(double)a/0;
            throw new except("/by zero");
        }
        catch (except e)
        {
            System.out.println(e);
        }
    }
}

public class applet1 extends Exception
{
    int x;
    public void greater(int y)
    {
        x=15;
        if(x>y)
            System.out.println("x is greater");
        else
            throw new ArithmeticException("y is greater");
    }

    public static void main(String[] args) {

        try{
            applet1 a=new applet1();
            a.greater(67);
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}*/

import java.io.*;
public class applet1
{
    public static void main(String[] args) throws Exception {
        FileOutputStream f1=new FileOutputStream("Java.txt");
        f1.write(1);
        FileInputStream f=new FileInputStream("Java.txt");
        String s="";
        byte b[]=s.getBytes();

        System.out.println(f.read(b));
        f.close();
    }
}