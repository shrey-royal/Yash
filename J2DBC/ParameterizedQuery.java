import java.sql.*;
import java.util.Scanner;

public class ParameterizedQuery {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yashjdbc", "root", "root");

            String sql = "SELECT * FROM employees WHERE employee_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the employee id: ");
            pstmt.setInt(1, sc.nextInt());
            sc.close();

            ResultSet rs = pstmt.executeQuery();

            System.out.println("Employee ID\tFirst Name\tLast Name\tEmail\t\t\tPhone Number");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t"
                        + rs.getString(4) + "\t\t" + rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
