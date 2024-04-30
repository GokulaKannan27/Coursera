import java.util.Scanner;

public class Programs {
    public static void main(String[] args) {
        //Armstrong Number or not
       /* System.out.println("Enter the Number : ");
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int number=n;
        int result=0;
        int Remainder;
        for(int i=1;n!=0;i++)
        {

            Remainder=n%10;
            result=result+(Remainder*Remainder*Remainder);
            n=n/10;
        }
        if(number==result)
        {
            System.out.println("The Given number is Armstrong");
        }
        else {
            System.out.println("The Number is not Armstrong");
        }*/

        //Armstrong number from 100-999
       /* int Rem,rev=0;
        int num,d1,d2,d3;
        for(int i=100;i<=999;i++)
        {
           num=i;
           d3=num%10;
           num=num/10;
           d2=num%10;
           num=num/10;
           d1=num%10;
           num=num/10;
           rev=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
            if(rev==i)
            {
                System.out.println("Armstrong"+i);
            }
        }*/

        //Multiplication table
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        Scanner b=new Scanner(System.in);
        int t=b.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(t+"x"+i+"="+(t*i));
        }
    }
}
