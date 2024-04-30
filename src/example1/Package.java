package example1;
import java.io.*;
import java.util.*;
public class Package {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int age=n.nextInt();
        try {
            if (age < 18)
                throw new Exception("Not Eligible for voting");
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
