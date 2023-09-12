import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteDate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yashjdbc", "root", "root");

            Statement stmt = conn.createStatement();

            //Fetch data from the database
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
            System.out.println("Employee ID\tFirst Name\tLast Name\tEmail\t\t\tHire Date");
            while(rs.next()) {
                System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + 
                "\t\t" + rs.getString(4) + "\t\t" + rs.getString(5));
            }
            
            //Delete data from the database
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the employee id to delete the data for: ");
            int employee_id = sc.nextInt();
            sc.close();

            int rowsAffected = stmt.executeUpdate("DELETE FROM employees WHERE employee_id='"+employee_id+"'");

            if (rowsAffected > 0) {
                System.out.println("Data deleted successfully!");
            } else {
                System.out.println("Data deletion failed!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
