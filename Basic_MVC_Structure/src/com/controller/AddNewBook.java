package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BookBean;
import com.dao.BookDAO;

public class AddNewBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddNewBook() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String title = req.getParameter("title");
		String author = req.getParameter("author");
		String price = req.getParameter("price");
		
		System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
		
		BookBean book = new BookBean();
		BookDAO bookDao = new BookDAO();
		
		book.setTitle(title);
		book.setAuthor(author);
		book.setPrice(Float.parseFloat(price));
		
		bookDao.insertBook(book);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
