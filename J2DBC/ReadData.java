// import java.io.FileInputStream;
// import java.io.IOException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.util.Properties;
import java.sql.ResultSet;

public class ReadData {

    // public static Connection getConnection() throws SQLException, IOException {
    //     Properties props = new Properties();
    //     FileInputStream fis = new FileInputStream("db.properties");
    //     props.load(fis);
        
    //     String url = props.getProperty("db.url");
    //     String username = props.getProperty("db.username");
    //     String password = props.getProperty("db.password");
        
    //     return DriverManager.getConnection(url, username, password);
    // }


    public static void main(String[] args) {
        try {
            // Connection conn = getConnection();

            // if (conn != null) {
            //     System.out.println("Connected to the database");
            //     conn.close();
            // }

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yashjdbc", "root", "root");


            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

            System.out.println("Employee ID\tFirst Name\tLast Name\tEmail\t\t\tPhone Number");
            // while (rs.next()) {
            //     // System.out.println(rs.getInt("employee_id") + " " + rs.getString("first_name") + " " + rs.getString(3) + " " + 
            //     // rs.getString(4) + " " + rs.getString(5));
            //     System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4) + "\t\t" + rs.getString(5));
            // }

            rs.absolute(2);
            System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4) + "\t\t" + rs.getString(5));

            rs.absolute(1);
            System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4) + "\t\t" + rs.getString(5));


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
