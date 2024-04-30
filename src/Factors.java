import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        /*System.out.println("Enter the Number : ");
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+"\t");
            }
        }*/

        //Prime no or not
        /*System.out.println("Enter the number : ");
        Scanner v=new Scanner(System.in);;
        int n=v.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println(n+" is prime number");
        }
        else {
            System.out.println(n+" is not prime number");
        }*/

        //Prime number between 1-100
       /* int c=0;
        for(int i=1;i<=100;i++)
        {
           for(int j=1;j<=i;j++)
           {
               if(i%j==0)
               {
                   c=c+1;
               }
           }
           if(c==2)
           {
               System.out.print(i+"\t");
           }
           c=0;
        }*/

        //perfect Number or not
      /*  System.out.println("Enter the number : ");
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
              sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.println(n+" is Perfect number");
        }
        else {
            System.out.println(n+" is not Perfect number");
        }*/

        //Perfect number between 1-100
       /* int sum=0;
        for(int i=1;i<=100;i++)
        {
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum=sum+j;
                }
            }
            if(sum==i)
            {
                System.out.print(i+"\t");
            }
            sum=0;
        }*/

        //To find Given number is Strong or not
        System.out.println("Enter the number : ");
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int rem,f=1;
        int sum=0;
        int number=n;
        while(n!=0)
        {
            rem=n%10;
            for(int i=1;i<=rem;i++)
            {
                f=f*i;
            }
            sum=sum+f;
            n/=10;
        }
        if(number==sum)
        {
            System.out.println(number+" is Strong number");
        }
        else {
            System.out.println(number+" is not Strong number");
        }
    }
}
