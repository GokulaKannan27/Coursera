import java.util.Scanner;

public class While_loop
{
    public static void main(String[] args) {
       /* System.out.print("Enter the Limit : ");
        Scanner n=new Scanner(System.in);
        int b=n.nextInt();
        int i=1;
        while(i<=b) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
            i++;
        }*/

        //Do while Loop
       /* System.out.println("Enter the Limit : ");
        Scanner n=new Scanner(System.in);
        int b=n.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=b);*/

        //For Loop
       /* System.out.println("Enter the Matrix : ");
        Scanner b=new Scanner(System.in);
        int a=b.nextInt();
        for (int i=0;i<a;i++)
        {
            System.out.println(i);
        }*/

        //Enhanced for Loop
       /* int numbers[]={10,20,30,40,50,60,70};
        for (int n:numbers)
        {
            System.out.println(n);
        }*/

        //Pattern printing
       /* int i;
        for (i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
               System.out.print("*");
            }
            System.out.println(" ");
        }*/

        //Break And Continue
        int i;
        for(i=1;i<=10;i++) {
            if(i==4)
                continue;
                System.out.println(i);
                if(i==8)
                {
                    break;
                }
        }
    }
}
