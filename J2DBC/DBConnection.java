import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static void main(String[] args) {
        try {
            //register the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create the connection object
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yashjdbc", "root", "root");

            //print the connection object
            System.out.println(conn);

            //close the connection object
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}