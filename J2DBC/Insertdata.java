import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertdata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yashjdbc", "root", "root");

            
            System.out.println("Enter employee details: ");
            // System.out.println("Enter employee id: ");
            // int id = sc.nextInt();
            System.out.println("Enter employee first name: ");
            String fname = sc.next();
            System.out.println("Enter employee last name: ");
            String lname = sc.next();
            System.out.println("Enter employee email: ");
            String email = sc.next();
            System.out.println("Enter employee Hire Date (format: yyyy-MM-dd): ");
            String hiredate = sc.next();
            sc.close();

            String insertQuery = "INSERT INTO employees VALUES(0, '" + fname + "', '" + lname + "', '" + email + "', STR_TO_DATE('" + hiredate + "', '%Y-%m-%d'))";

            Statement stmt = conn.createStatement();

            if (stmt.executeUpdate(insertQuery) > 0) {
                System.out.println("Record inserted successfully");
            } else {
                System.out.println("Record not inserted");
            }

            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
