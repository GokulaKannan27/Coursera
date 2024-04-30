import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Different_operators {
    /*
    Arithmetic Assignment Operators
    =      a=123  a=123
    +=     a+=10   a=a+10
    -=     a-=10   a=a-10
    *=     a*=10   a=a*10
    /=     a/=10   a=a/10
    %=     a%=10   a=a%0
     */
    public static void main(String[] args) {
       /* int a=123;
        System.out.println(a);
        a+=10;
        System.out.println(a);
        a-=10;
        System.out.println(a);
        a*=10;
        System.out.println(a);
        a/=10;
        System.out.println(a);
        a%=10;
        System.out.println(a);*/

        //Relational Operators

       /* int a=100,b=50;
        System.out.println("Equal to : "+(a==b));
        System.out.println("Not Equal to : "+(a!=b));
        System.out.println("Less than : "+(a<b));
        System.out.println("Greater than : "+(a>b));
        System.out.println("Greater than Or Equal to : "+(a>=b));
        System.out.println("Less than Or Equal to : "+(a<=b));*/

        //Logical Operator
       /* int m1=65,m2=75;
        System.out.println("And && : "+(m1>=35 && m2>=35));
        System.out.println("Or || : "+(m1>=35 || m2>=35));*/

        //Conditional Operator or Ternary operator
       /* int a=25,b=35,c;
        c=a>b?a:b;
        System.out.println(c);*/

        //Unary Operator in Java
        /*int a=10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        //Bitwise Operator
        a=2;
        int b=3;
        /*
        Bitwise Working concept
        a=2,b=3
        Binary value of 2=0010
        Binary value of 3=0011
        0=>false,1=>true
        Checking the And & Logic 0=0=>0,0=0=>0,1=1=>1,0!=1=>0
        Binary to Decimal 2
         *//*
        System.out.println("Bitwise And :"+(a&b));
        System.out.println("Bitwise or :"+(a|b));
        System.out.println("Bitwise Xor :"+(a^b));
*/

        //Getting input from User
        /*
        nextInt=integer
        nextLine=String
        nextDouble=Double
        nextFloat=float....
         */
        Scanner in=new Scanner(System.in);
        String a,b,c;
        a=in.nextLine();
        b= in.nextLine();
        c=a+b;
        System.out.println(c);
    }
}
