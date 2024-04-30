import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        String a=n.next();
        String b=n.next();
        String c=n.next();
        System.out.print(a+"\n"+b+"\n"+c+"\n");
        if(a.equals(b) && a.equals(c))
        {
            System.out.println("Equilateral Triangle");
        }
        else if (a.equals(b) || a.equals(c)) {
            System.out.println("Isosceles Triangle");
        }
        else if (b.equals(c))
        {
            System.out.println("Isosceles Triangle");
        }
        else if(!(a.equals(b)) && !(b.equals(c)) && !(a.equals(c)) )
        {
            System.out.println("Scalene Triangle");
        }
        else {
            System.out.println("Not a Triangle");
        }
    }
}
