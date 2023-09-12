import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PrepareStatement {
    public static void main(String[] args) throws Exception {
        //Parameterized query
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yashjdbc", "root", "root");
        
        String insertQuery = "INSERT INTO employees VALUES(?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(insertQuery);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee details: ");
        
        System.out.println("Enter the employee id: ");
        int id = sc.nextInt();
        pstmt.setInt(1, (id>0)?id:0);

        System.out.println("Enter the employee first name: ");
        String fn = sc.next();
        pstmt.setString(2, fn);

        System.out.println("Enter the employee last name: ");
        String ln = sc.next();
        pstmt.setString(3, ln);

        System.out.println("Enter the employee email: ");
        String email = sc.next();
        pstmt.setString(4, email);

        System.out.println("Enter the employee hire date (format: yyyy-MM-DD): ");
        String hireDate = sc.next();
        pstmt.setString(5, hireDate);
        sc.close();

        int rowsAffected = pstmt.executeUpdate();
        System.out.println("Rows affected: " + rowsAffected);


        //Displaying the data
        String selectQuery = "SELECT * FROM employees";
        PreparedStatement pstmt2 = conn.prepareStatement(selectQuery);
        ResultSet rs = pstmt2.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
        }

        conn.close();
    }
}
