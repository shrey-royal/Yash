package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.Book;
import com.util.DBConnection;

public class BookDAO {
	
	public boolean insertBook(Book book) throws SQLException {
		String insertQuery = "INSERT INTO book (title, author, price) VALUES (?, ?, ?)";
		Connection conn = DBConnection.getConnection();
		
		PreparedStatement pstmt = conn.prepareStatement(insertQuery);
		pstmt.setString(1, book.getTitle());
		pstmt.setString(2, book.getAuthor());
		pstmt.setFloat(3, book.getPrice());
		
		boolean rowsInserted = pstmt.executeUpdate() > 0;
		pstmt.close();
		conn.close();
		return rowsInserted;
	}
}
