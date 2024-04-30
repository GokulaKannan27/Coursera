import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /*int f = 1;
        int j=1;

            Scanner n = new Scanner(System.in);
            int a = n.nextInt();
            for (int i = 1; i <= a; i++) {
                f = f * i;
            }
            System.out.print(f);*/

        //Sum and average of n numbers
      /*  int sum=0;
        int n;
        System.out.println("Enter the number : ");
        Scanner v=new Scanner(System.in);
        n=v.nextInt();
        int a;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the number "+i);
            Scanner b=new Scanner(System.in);
            a=b.nextInt();
            sum=sum+a;
        }
        System.out.println(sum);
        float s=sum;
        System.out.println(s/n);*/

        //Fibonacci Sequence
        /*System.out.println("Enter the Limit : ");
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int n1=0,n2=1,n3;
        for(int i=1;i<=n;i++)
        {
            System.out.print(n1+"\t");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }*/

        //Reverse of Given n digit number
        System.out.println("Enter the n number :");
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int reverse=0,Remainder;
        for(int i=1;n!=0;i++)
        {
            Remainder=n%10;
            reverse=reverse*10+Remainder;
            n=n/10;
        }
        System.out.println("Reverse of given number is : "+reverse);
    }
}
