import java.awt.*;
import java.util.Date;

public class Hello_world {
    public static void main(String[] args) {
        int a=10,b=5;
        a=5;
        System system=null;
        system.out.println(a);
        system.out.println(b);
        Point p1=new Point(5,7);
        Point p2=p1;
        system.out.println(p2);
        p1.x=7;
        system.out.println(p1);
        system.out.println(p2);
    }
}
