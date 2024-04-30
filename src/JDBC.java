import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) throws Exception {
        String sql="select * from product";
        String url="jdbc:oraclesql://localhost/gokul";
        String username="system";
        String password="1978";

        Connection con= DriverManager.getConnection(url);
        Statement st=con.createStatement();
        /*st.executeQuery(sql);*/
        ResultSet rs=st.executeQuery(sql);

        String name=rs.getString(1);
        System.out.println(name);
        con.close();
    }
}
