public class DriveManager {
    public static void main(String[] args) {
        //
    }
}

/*
DriverManager Methods:

1. public static void registerDriver(Driver driver) throws SQLException
2. public static void deregisterDriver(Driver driver) throws SQLException
3. public static Connection getConnection(String url) throws SQLException
4.  public static Connection getConnection(String url,String userName,String password) throws SQLException
5. public static Driver getDriver(String url)
6. pubic static int getLoginTimeout()
7. pubic static void setLoginTimeout(int sec)
8. public static Connection getConnection(String URL, Properties prop) throws SQLException


Example Code:

1) `public static synchronized void registerDriver(Driver driver)`
   
   This method is used to register a JDBC driver with the DriverManager.

   
   // Example usage: Registering a MySQL JDBC driver
   try {
       Class.forName("com.mysql.jdbc.Driver"); // Load the driver class
       Driver driver = new com.mysql.jdbc.Driver();
       DriverManager.registerDriver(driver);
       System.out.println("MySQL JDBC driver registered successfully.");
   } catch (ClassNotFoundException | SQLException e) {
       e.printStackTrace();
   }
   

   Real-world scenario: When you want to connect to a specific database, you need to register the JDBC driver for that database type.

2) `public static synchronized void deregisterDriver(Driver driver)`

   This method is used to deregister a JDBC driver from the DriverManager.

   
   // Example usage: Deregistering a previously registered driver
   try {
       Driver driver = DriverManager.getDriver("jdbc:mysql://localhost:3306/mydb");
       DriverManager.deregisterDriver(driver);
       System.out.println("MySQL JDBC driver deregistered successfully.");
   } catch (SQLException e) {
       e.printStackTrace();
   }
   

   Real-world scenario: When you want to release resources associated with a JDBC driver that you no longer need.

3) `public static Connection getConnection(String url) throws SQLException`

   This method is used to establish a connection to a database using a URL.

   
   // Example usage: Establishing a connection to a MySQL database
   try {
       String url = "jdbc:mysql://localhost:3306/mydb";
       Connection connection = DriverManager.getConnection(url);
       System.out.println("Connected to the MySQL database.");
   } catch (SQLException e) {
       e.printStackTrace();
   }
   

   Real-world scenario: When you need to connect to a database using its URL.

4) `public static Connection getConnection(String url, String userName, String password) throws SQLException`

   This method is used to establish a connection to a database with a username and password.

   
   // Example usage: Establishing a connection to a MySQL database with username and password
   try {
       String url = "jdbc:mysql://localhost:3306/mydb";
       String userName = "myuser";
       String password = "mypassword";
       Connection connection = DriverManager.getConnection(url, userName, password);
       System.out.println("Connected to the MySQL database as " + userName);
   } catch (SQLException e) {
       e.printStackTrace();
   }
   

   Real-world scenario: When you need to connect to a database with authentication credentials.

5) `public static Driver getDriver(String url)`

   This method retrieves the driver that understands the given URL.

   
   // Example usage: Getting the JDBC driver for a specific database URL
   String url = "jdbc:mysql://localhost:3306/mydb";
   Driver driver = DriverManager.getDriver(url);
   System.out.println("Driver class: " + driver.getClass().getName());
   

   Real-world scenario: When you want to know which JDBC driver is associated with a specific database URL.

6) `public static int getLoginTimeout()`

   This method returns the login timeout in seconds for establishing a database connection.

   
   // Example usage: Getting the login timeout
   int timeout = DriverManager.getLoginTimeout();
   System.out.println("Login timeout: " + timeout + " seconds");
   

   Real-world scenario: When you want to know the maximum time a driver can wait to establish a connection.

7) `public static void setLoginTimeout(int sec)`

   This method sets the login timeout in seconds for establishing a database connection.

   
   // Example usage: Setting the login timeout to 30 seconds
   int timeout = 30;
   DriverManager.setLoginTimeout(timeout);
   System.out.println("Login timeout set to " + timeout + " seconds");
   

   Real-world scenario: When you want to configure the maximum time a driver should wait to establish a connection.

8) `public static Connection getConnection(String url, Properties prop) throws SQLException`

   This method is used to establish a connection to a database using a URL and properties (e.g., for specifying username and password).

   
   // Example usage: Establishing a connection to a database with properties
   try {
       String url = "jdbc:mysql://localhost:3306/mydb";
       Properties properties = new Properties();
       properties.setProperty("user", "myuser");
       properties.setProperty("password", "mypassword");
       Connection connection = DriverManager.getConnection(url, properties);
       System.out.println("Connected to the MySQL database with properties.");
   } catch (SQLException e) {
       e.printStackTrace();
   }
   

   Real-world scenario: When you need to pass additional properties along with the URL to establish a connection, such as authentication details.

*/