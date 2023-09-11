import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yashjdbc", "root", "root");

            String query = "CREATE TABLE employees (\r\n" + //
                    "    employee_id INT AUTO_INCREMENT PRIMARY KEY,\r\n" + //
                    "    first_name VARCHAR(50),\r\n" + //
                    "    last_name VARCHAR(50),\r\n" + //
                    "    email VARCHAR(100),\r\n" + //
                    "    hire_date DATE\r\n" + //
                    ");\r\n" + //
                    "";

            Statement stmt = conn.createStatement();
            
            stmt.executeUpdate(query);
            System.out.println("Table created successfully");

            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
