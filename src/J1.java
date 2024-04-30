import java.util.Scanner;

import static java.lang.System.exit;

class booking{
    String tno,t_name,src,dest;
    public void get()
    {
        System.out.println("Enter the details1:");
        Scanner n=new Scanner(System.in);
        tno=n.next();
        t_name=n.next();
        src=n.next();
        dest=n.next();
    }
    public void display()
    {
        System.out.println(tno+"\n"+t_name+"\n"+src+"\n"+dest);
    }
}
class first extends booking
{
    double amt=867;
    public first()
    {
        amt=amt+(double)(amt*17.7)/100+(double)(amt*3)/100+(double)(amt*3)/100;
    }
}
class second extends booking
{
    double at=567;
    public second()
    {
        at=at+(double)(at*17.7)/100+(double)(at*3)/100+(double)(at*3)/100;
    }
}
public class J1 {
    String p_name;
    int c;
    public void getdata()
    {
        Scanner n=new Scanner(System.in);
        p_name=n.next();
    }
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        J1 j=new J1();
        j.c=n.nextInt();
        for(int i=0;i<3;i++)
        {
            while(j.c!=3)
            {
                switch(j.c)
                {
                    case 1:
                        j.getdata();
                        System.out.println("Passenger name:"+j.p_name);
                        first f=new first();
                        f.get();
                        System.out.println("First class ticket cost is :"+f.amt);
                        System.out.println("---Train details---");
                        f.display();
                        break;
                    case 2:
                        j.getdata();
                        System.out.println("Passenger name:"+j.p_name);
                        second s=new second();
                        s.get();
                        System.out.println("Second class ticket cost is :"+s.at);
                        System.out.println("---Train details---");
                        s.display();
                        break;
                    case 3:
                        exit(0);
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                j.c=n.nextInt();
            }
        }
        /*String n="hello";
        char[] v=n.toCharArray();
        for(char i:v)
        {
            System.out.println(i);
        }
        int[] c=new int[v.length];
        for(int i=0;i<v.length;i++)
        {
            c[i]=v[i];
            if(c[i]>64&&c[i]<90)
            {
                c[i]=c[i];
            }
            else{
                c[i]=c[i]-32;
            }
        }
        for(int i=0;i<v.length;i++)
        {
            System.out.println(c[i]);
            v[i]=(char)c[i];
        }
        String w=new String(v);
        System.out.println(w);*/

    }
}
