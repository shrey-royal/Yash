import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DBMetaData {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yashjdbc", "root", "root");

        DatabaseMetaData dbmd = conn.getMetaData();

        System.out.println("Driver Name: " + dbmd.getDriverName());
        System.out.println("Driver Version: " + dbmd.getDriverVersion());
        System.out.println("User Name: " + dbmd.getUserName());
        System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
        System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());

        String table[] = {"TABLE"};

        System.out.println("Tables in the database: ");
        ResultSet rs = dbmd.getTables(null, null, null, table);
        while(rs.next()) {
            System.out.println(rs.getString(3));
        }
        conn.close();
    }
}
