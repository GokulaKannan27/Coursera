import java.util.*;
public class Pattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int top=-1,n;
        System.out.println("Enter the Size:");
        n=sc.nextInt();
        int stk=0;
        while(c!=4)
        {
            System.out.println("1.Push"+"\n"+"2.Pop"+"\n"+"3.Display"+"\n"+"4.Exit");
            System.out.println("Enter your choice:");
            c=sc.nextInt();
            switch(c)
            {
                case 1:
                    int x;
                    if(top==n-1){
                     System.out.println("Overflow");
                    }
                    else {
                        x=sc.nextInt();
                        stk=stk*10+x;
                    }
                    break;
                case 2:
                    int pop=stk%10;
                    stk=stk/10;
                    System.out.println("Popped element :"+pop);
                    break;
                case 3:
                    System.out.println("Displaying the element :"+stk);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Enter again!..");
                    break;
            }
        }
    }
}
