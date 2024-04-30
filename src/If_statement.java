import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Objects;
import java.util.Scanner;

public class If_statement {
    public static void main(String[] args) {
       /* int age;
        Scanner a=new Scanner(System.in);
        age=a.nextInt();
        if(age>=18)
        {
            System.out.println("You are Eligible for Voting");
        }
        else{
            System.out.println("Not Eligible for Voting");
        }*/

        /*int year;
        System.out.println("Enter the Year:");
        Scanner y=new Scanner(System.in);
        year=y.nextInt();
        if(year%4==0 && year%100!=0 ||year%400==0)
        {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }*/

        //else if ladder
       /* float avg;
        System.out.println("Enter the Average Mark : ");
        Scanner g=new Scanner(System.in);
        avg=g.nextFloat();
        if(avg>=90&&avg<=100)
        {
            System.out.println("Grade A");
        }
        else if(avg<90&&avg>=80)
        {
            System.out.println("Grade B");
        }
        else if(avg<80&&avg>=70)
        {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Grade D");
        }*/

        //Nested if
        String Marital;
        int age;
        String gen;
        Scanner m=new Scanner(System.in);
        Marital=m.nextLine();
        if(Objects.equals(Marital, "Married") || Objects.equals(Marital, "married"))
        {
            System.out.println("Eligible for Insurance");
        }
        else if(Objects.equals(Marital, "Unmarried") || Objects.equals(Marital, "unmarried"))
        {

            System.out.println("Enter the Age : ");
            Scanner a=new Scanner(System.in);
            age=a.nextInt();
            System.out.println("Enter the Gender : ");
            Scanner g=new Scanner(System.in);
            gen=g.nextLine();
            if((Objects.equals(gen, "Male") || Objects.equals(gen, "male")) && age>30)
            {
                System.out.println("Eligible");
            }
            else if(((Objects.equals(gen,"Famale")) || (Objects.equals(gen,"female"))) && (age > 25))
            {
                System.out.println("Eligible");
            }
            else{
                System.out.println("Not Eligible");
            }
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
