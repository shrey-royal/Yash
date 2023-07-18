package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BookBean;
import com.dao.BookDAO;

public class DeleteBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteBook() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		BookDAO bookDao = new BookDAO();
		BookBean bookBean = bookDao.getBookbyBookId(id);
		
		System.out.println("Book Details to be deleted:");
		System.out.println("Book Id: " + bookBean.getId());
		System.out.println("Book Title: " + bookBean.getTitle());
		System.out.println("Book Author: " + bookBean.getAuthor());
		System.out.println("Book Price: " + bookBean.getPrice());
		
		bookDao.deleteBook(id);
		res.sendRedirect("list");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
