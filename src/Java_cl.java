import java.util.Scanner;

public class Java_cl {
    public static void main(String[] args) {
        /*
        System.out.println("Welcome To GK Enterprises");*/

        //1.Variables in Java
        /*
        char Gender='M';
        String n="Gokula Kannan";
        int age=19;
        float Percent=25.25f;
        System.out.println(n+"\n"+age+"\n"+Percent+"\n"+Gender);*/

        //2.Type Casting
       /* int a=10;
        double b=a,d=25.345;
        int c=(int)d;
        char M='B';
        int f=(int)M;
        System.out.println(a);
        System.out.println(b);
        System.out.println(d+"\n"+c+"\n"+M+"\n"+f);*/

        //Arithmetic Operations In Java
        int a=10,b=24;
        Scanner scanner=new Scanner(System.in);
        int c=scanner.nextInt();
        switch(c)
        {
            case 1:
                System.out.println("Addition of two numbers"+(a+b));
                break;
            case 2:
                System.out.println("Subtraction of two numbers"+(a-b));
                break;
            case 3:
                System.out.println("Multiplication of two numbers"+(a*b));
                break;
            case 4:
                double d=(b/a);
                System.out.println("Division of two numbers"+(d));
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

}
