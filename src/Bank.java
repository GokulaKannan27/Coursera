import java.io.*;
import java.util.*;
class Bank1 extends Exception{
    String s;
    public Bank1(String s)
    {
        super(s);
    }
}
public class Bank extends Bank1{
    public Bank(String str) {
        super(str);
    }

    public static void main(String[] args) {
        double Balance=45000.00;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the Withdrawal amount:");
        double amt=n.nextDouble();
        try {
            if (amt > Balance) {
                throw new Bank1("Insufficient Balance");
            } else {
                Balance = Balance - amt;
                System.out.println("After withdrawal balance is " + Balance);
            }
        } catch(Bank1 e){
            System.out.println(e);
        }
    }
}
