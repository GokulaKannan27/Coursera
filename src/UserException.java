import java.io.*;
import java.util.*;

public class UserException extends Exception {
    String username,password;
    public UserException(String username,String password){
        this.username=username;
        this.password=password;
    }
    public String getusername()
    {
        return username;
    }

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        String username=n.next();
        String password=n.next();
        try{
            if(username != "GK" || !password.equals("@123"))
                throw new UserException("Incorrect Username/Password","");
            else
                System.out.println("Login Successfully");
        }catch(UserException e)
        {
            System.out.println(e.getusername());
        }
    }
}
