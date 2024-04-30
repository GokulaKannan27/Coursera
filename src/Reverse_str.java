import java.util.Scanner;

public class Reverse_str {
    public static void main(String[] args) {
        //Reversing a String
        /*StringBuilder a=new StringBuilder("HEllO WORLD!");
        for (int i=a.length()-1;i>=0;i--)
        {
            System.out.print(a.charAt(i));
        }*/

        //String conversion from lower to upper
       /* String a;
        Scanner b=new Scanner(System.in);
        a=b.nextLine();
        StringBuilder c=new StringBuilder();
        c.append(a);
        System.out.println(c);
        for (int i=0;i<c.length();i++)
        {
            if(c.charAt(i)>=97 && c.charAt(i)<=122)//For lowercase change 97 to 65 and 122 to 90
            {
                int d=(int)c.charAt(i)-32; //change '-' to '+'
                c.setCharAt(i,(char)d);
            }
        }
        System.out.println(c);*/

        //Program to capitalize each word

        /*StringBuilder a=new StringBuilder("tuTor joes");
        System.out.println("Original String : "+a);
        if(a.charAt(0)>=97 && a.charAt(0)<=122)
        {
            int c=(int)a.charAt(0)-32;
            a.setCharAt(0,(char)c);
        }
        for (int i=1;i<a.length();i++)
        {
            if(a.charAt(i)==32)
            {
                i++;
                if(a.charAt(i)>=97 && a.charAt(i)<=122)
                {
                    int c=(int)a.charAt(i)-32;
                    a.setCharAt(i,(char)c);
                }
            }
            else {
                if(a.charAt(i)>=65 && a.charAt(i)<=90)
                {
                    int c=(int)a.charAt(i)+32;
                    a.setCharAt(i,(char)c);
                }
            }
        }
        System.out.println(a);*/

        //Program to convert string into toggle case

        StringBuilder a=new StringBuilder("Computer Education");
        for (int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>=97 && a.charAt(i)<=122)
            {
                int c=(int)a.charAt(i)-32;
                a.setCharAt(i,(char) c);
            }
            else if(a.charAt(i)>=65 && a.charAt(i)<=90)
            {
                int c=(int)a.charAt(i)+32;
                a.setCharAt(i,(char)c);
            }
        }
        System.out.println("Toggle case :"+a);
    }
}
