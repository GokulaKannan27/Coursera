import java.util.Scanner;
import com.sun.jdi.Method;
import jdk.jshell.MethodSnippet;
public class Lesson1 //main class
         {
    public static void main(String args[]) {
      /*  System.out.printf("Hello world!");
        Scanner n=new Scanner(System.in);
        String name=n.nextLine();
        int age=n.nextInt();
        float value1=n.nextFloat();
        double value2=n.nextDouble();
        long value3=n.nextLong();
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Value1 : "+value1);
        System.out.println("Value2 : "+value2);
        System.out.println("Value3 : "+value3);*/

        //Employee Payroll

        String name=args[0];
        double Bpay = Double.parseDouble(args[1]);
        int Da = Integer.parseInt(args[2]);
        int hra = Integer.parseInt(args[3]);
        double pf= Double.parseDouble(args[4]);
        double salary;
        double da=(Bpay*Da)/100;
        double Hra =(Bpay*hra)/100;

        double Salary = Bpay + da +Hra - pf;
        System.out.println(Salary);
    }
}
