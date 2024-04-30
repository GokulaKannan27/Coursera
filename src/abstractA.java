abstract class student
{
    int n;
    abstract void getdata();
    public static void display()
    {
        System.out.println("Hello Abstract class");
    }
}
public class abstractA extends student
{

    public void getdata()
    {
        n=5;
        System.out.print(n);
    }

    public static void main(String[] args) {
        abstractA a=new abstractA();
        a.getdata();
        student.display();
    }
}
