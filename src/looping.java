import java.util.Scanner;

public class looping {
    public static <b> void main(String[] args) {
        /*for(int i = 1; i<=2; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 0; k <= 2; k++)
                    System.out.print("$");
                System.out.print(" ");
            }
            System.out.println();
        }*/
       /* System.out.println((double)1/4);
        Scanner n=new Scanner(System.in);
        int m=n.nextInt();
        double sum=0;
        double sign=1;
        int choice=n.nextInt();
        switch(choice)
        {
            case 1:
                for(double i=1;i<=m;i++)
                {
                    sum+=(double)(1/(4*i));
                }
                System.out.println((double)sum);
                break;
            case 2:
                double fact;
                for(int i=1;i<=m;i++)
                {
                    fact=1;
                    for(int j=1;j<=i;j++)
                    {
                        fact=fact*j;
                    }
                    sum+=(i/fact)*sign;
                    sign*=-1;
                }
                System.out.println(sum);
                break;
            default:
                System.out.println("Error");
                break;
        }*/

        /*double x;
        double n;
        Scanner sc=new Scanner(System.in);
        x=sc.nextDouble();
        n=sc.nextDouble();
        double fact;
        double sign=1;
        for (int i=1;i<=n;i+=2)
        {
            fact=1;
            for(int j=1;j<=1;j++)
            {
                for(int k=1;k<=i;k++)
                {
                    fact=fact*k;
                }
            }
            x+=(double)Math.pow(x,i)/fact*sign;
            sign=sign*-1;
        }
        System.out.println(x);
        System.out.println(sign);
        System.out.println(Math.sin(x));*/

       /* Scanner n=new Scanner(System.in);
        int m=n.nextInt();
        double sum=0;
        double sign=1;
        double j=1;
        for(int i=1;i<=m;i++)
        {
            //for(int j=1;j<=i;j++) {
                sum += j/i * sign;
                sign = sign * -1;
            //}
        }
        System.out.println(sum);*/

       /* Scanner n=new Scanner(System.in);
        int m=n.nextInt();
        int count=0;
        for(int i=1;i<=m;i++)
        {
            if(m%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not Prime");
        }
        double x;
        x=Math.pow(m,2);
        System.out.println(x);*/

        /*Scanner n=new Scanner(System.in);
        String c=n.nextLine();
        StringBuffer m=new StringBuffer(c);

        System.out.println(m.reverse());
        char[] a=new char[5];
        for(int j=0;j<5;j++) {
            a[j] = n.next().charAt(j);
        }
        char[] b=new char[100];
        int d=0;
        for(int i=0;i<=m.length();i++) {

            String x = String.valueOf(m.charAt(i));
            for (int j = 0; j < 5; j++) {
                if (x.equals(a[j])) {
                    b[i] = a[j];
                    d++;
                }
            }
        }

            for (int i=0;i<d;i++)
            {
                System.out.print(b[i]+" ");
            }*/
/*int c=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5+1-i;j++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
            c--;
        }*/
        /*System.out.println(Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE+" "+Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE+" "+Long.MAX_VALUE);
        System.out.println(Double.MIN_VALUE+" "+Double.MAX_VALUE);
        System.out.println(Character.MIN_VALUE+" "+Character.MAX_VALUE);
        System.out.println(Float.MIN_VALUE+" "+Float.MAX_VALUE);*/

        System.out.println();

        int k=0,j,i;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(k=5;k>=i;k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
