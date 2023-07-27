package com.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.BookBean;
import com.util.DBConnection;

public class BookDAO {
	private Connection conn = null;
	
	public void insertBook(BookBean book) {
		try {
			String insertQuery = "INSERT INTO book (title, author, price) VALUES (?, ?, ?)";
			conn = DBConnection.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setFloat(3, book.getPrice());
			
			int i = pstmt.executeUpdate();
//			System.out.println("Insert Query Response -> " + pstmt.executeUpdate());
			if(i == 1) {
				System.out.println("Book Added Successfully!");
			} else {
				System.out.println("Failed to Add Book!");
			}
			DBConnection.disconnect(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<BookBean> listBook() {
		try {
			String listQuery = "SELECT * FROM book";
			conn = DBConnection.getConnection();
			
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
			DBConnection.disconnect(conn);
			return books;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public BookBean getBookbyBookId(int id) {
		try {
			String selectQuery = "SELECT * from book WHERE book_id = ?";
			conn = DBConnection.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(selectQuery);
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				BookBean bookBean = new BookBean();
				bookBean.setId(rs.getInt("book_id"));
				bookBean.setTitle(rs.getString("title"));
				bookBean.setAuthor(rs.getString("author"));
				bookBean.setPrice(rs.getFloat("price"));
				return bookBean;
			}
			DBConnection.disconnect(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public void updateBook(BookBean bookBean) {
		try {
			String updateQuery = "UPDATE book SET title=?, author=?, price=? WHERE book_id = ?";
			conn = DBConnection.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);
			pstmt.setString(1, bookBean.getTitle());
			pstmt.setString(2, bookBean.getAuthor());
			pstmt.setFloat(3, bookBean.getPrice());
			pstmt.setInt(4, bookBean.getId());
			
			int i = pstmt.executeUpdate();
			if(i == 1) {
				System.out.println("Book Updated Successfully!");
			} else {
				System.out.println("Failed to Update Book!");
			}
			DBConnection.disconnect(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void deleteBook(int id) {
		try {
			String deleteQuery = "DELETE FROM Book WHERE book_id = ?";
			conn = DBConnection.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
			pstmt.setInt(1, id);
			
			pstmt.execute();
			pstmt.close();
			
			DBConnection.disconnect(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
