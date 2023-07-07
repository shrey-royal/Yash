package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.BookBean;
import com.util.DBConnection;

public class BookDAO {
	
	public void insertBook(BookBean book) {
		try {
			String insertQuery = "INSERT INTO book (title, author, price) VALUES (?, ?, ?)";
			Connection conn = DBConnection.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setFloat(3, book.getPrice());
			
			int i = pstmt.executeUpdate();
			if(i == 1) {
				System.out.println("Book Added Successfully!");
			} else {
				System.out.println("Failed to Add Book!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
