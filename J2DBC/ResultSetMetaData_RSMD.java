import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSetMetaData_RSMD {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yashjdbc", "root", "root");

            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
            ResultSet rs = pstmt.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            System.out.println("Number of columns: " + rsmd.getColumnCount());
            System.out.println("Name of the first column: " + rsmd.getColumnName(1));
            System.out.println("Type of the first column: " + rsmd.getColumnType(1));
            System.out.println("Database-specific type name of the first column: " + rsmd.getColumnTypeName(1));

            conn.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
/*
methods:

getColumnCount() -> returns the number of columns in the ResultSet object
getColumnName(int index) -> returns the name of the column
getColumnType(int index) -> returns the SQL type of the column
getColumnTypeName(int index) -> returns the database-specific type name of the column

*/