package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	
	public ArrayList<BookBean> listBook() {
		try {
			String listQuery = "SELECT * FROM book";
			Connection conn = DBConnection.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(listQuery);
			ResultSet rs = pstmt.executeQuery();	//select
			
			ArrayList<BookBean> books = new ArrayList<BookBean>();
			while(rs.next()) {
				BookBean bookBean = new BookBean();
				bookBean.setId(rs.getInt("book_id"));
				bookBean.setTitle(rs.getString("title"));
				bookBean.setAuthor(rs.getString("author"));
				bookBean.setPrice(rs.getFloat("price"));
				books.add(bookBean);
			}
			return books;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
