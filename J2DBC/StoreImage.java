import java.util.*;
import java.io.*;
import java.sql.*;


public class StoreImage {
    public static void main(String[] args) {
        Connection conn = getConnection();
        // insertImage(conn);
        retrieveImage(conn);
    }

    static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yashjdbc", "root", "root");
        } catch (Exception e) {
            System.out.println(e);
        }

        if (conn == null) {
            System.out.println("Connection not established");
            System.exit(0);
        } else {
            System.out.println("Connection established");
        }

        return conn;
    }

    //insert an image
    static void insertImage(Connection conn) {
        Scanner sc = new Scanner(System.in);
        try {
            String query = "INSERT INTO images VALUES (?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            System.out.println("Enter image id(press 0 for default): ");
            int id = sc.nextInt();
            pstmt.setInt(1, id);
            
            System.out.println("Enter image name: ");
            String name = sc.next();
            pstmt.setString(2, name);

            //to clear the buffer
            sc.nextLine();

            System.out.println("Enter image path(1 to 10): ");
            String path = sc.nextLine();
            FileInputStream fin = new FileInputStream("C:\\Users\\Shrey Kadia\\Documents\\Work\\Shrey@Royal\\Java\\Yash_Core_Java\\J2DBC\\inputImages\\" + path + ".webp");
            pstmt.setBinaryStream(3, fin, fin.available());
            int i = pstmt.executeUpdate();
            sc.close();

            System.out.println(i + " records affected");
            System.out.println("Image inserted successfully");

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //retrieve an image
    static void retrieveImage(Connection conn) {
        try {
            String query = "SELECT * FROM images";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()) {
                Blob b = rs.getBlob(3);
                byte barr[] = b.getBytes(1, (int)b.length());

                FileOutputStream fout = new FileOutputStream("C:\\Users\\Shrey Kadia\\Documents\\Work\\Shrey@Royal\\Java\\Yash_Core_Java\\J2DBC\\outputImages\\" + rs.getString(2) + ".webp");
                fout.write(barr);
                fout.close();
            } else {
                System.out.println("No image found");
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
