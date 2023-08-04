package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	private static final String DB_PROPERTIES_PATH = "/resources/db.properties";

    public static Connection getConnection() {
        try {
            Properties properties = new Properties();
            properties.load(DBConnection.class.getResourceAsStream(DB_PROPERTIES_PATH));

            String url = properties.getProperty("URL");
            String username = properties.getProperty("Uname");
            String password = properties.getProperty("password");

            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
//            throw new SQLException("Error establishing database connection.", e);
            System.out.println("Error establishing database connection." + e);
        }
        return null;
    }
    
    public static void main(String[] args) {
//		try {
//			System.out.println(DBConnection.getConnection());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		DBConnection.getConnection();
	}
}
