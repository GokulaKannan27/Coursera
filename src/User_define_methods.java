import com.sun.jdi.Method;
import jdk.jshell.MethodSnippet;

class Methods{
    public void add()
    {
        int a=10,b=20;
        System.out.println("Addition : "+(a+b));
    }
}
//Types of Methods
public class User_define_methods {
    public static void main(String[] args) {
     Methods o=new Methods();
     o.add();
    }
}
