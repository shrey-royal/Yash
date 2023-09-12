import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yashjdbc", "root", "root");

            //Fetch data from the database
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

            System.out.println("Employee ID\tFirst Name\tLast Name\tEmail\t\t\tHire Date");
            while(rs.next()) {
                System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + 
                "\t\t" + rs.getString(4) + "\t\t" + rs.getString(5));
            }

            //Update data in the database
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the employee id to update the data for: ");
            int employee_id = sc.nextInt();

            ResultSet rs1 = stmt.executeQuery("SELECT * FROM employees WHERE employee_id='"+employee_id+"'");

            if (rs1.next()) {
                System.out.print("Enter the first name: ");
                String fn = sc.next();

                if (fn.equals("0")) {
                    fn = rs1.getString(2);
                }

                System.out.print("Enter the last name: ");
                String ln = sc.next();

                if (ln.equals("0")) {
                    ln = rs1.getString(3);
                }

                System.out.print("Enter the email: ");
                String email = sc.next();

                if (email.equals("0")) {
                    email = rs1.getString(4);
                }

                System.out.println("Enter new Hire Date (format: yyyy-MM-DD): ");
                String hire_date = sc.next();

                if (hire_date.equals("0")) {
                    hire_date = rs1.getString(5);
                }

                int rowsAffected = stmt.executeUpdate("UPDATE employees SET first_name='"+fn+"', last_name='"+ln+"', email='"+email+"', hire_date='"+hire_date+"' WHERE employee_id='"+employee_id+"'");

                if(rowsAffected > 0) {
                    System.out.println("Data updated successfully");

                    ResultSet rs2 = stmt.executeQuery("SELECT * FROM employees");

                    System.out.println("Employee ID\tFirst Name\tLast Name\tEmail\t\t\tHire Date");
                    while(rs2.next()) {
                        System.out.println(rs2.getInt(1) + "\t\t" + rs2.getString(2) + "\t\t" + rs2.getString(3) + 
                        "\t\t" + rs2.getString(4) + "\t\t" + rs2.getString(5));
                    }
                } else {
                    System.out.println("Data updation failed");
                }
            } else {
                //If the employee id is not present in the database
                System.out.println("Employee id not found");
            }
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}