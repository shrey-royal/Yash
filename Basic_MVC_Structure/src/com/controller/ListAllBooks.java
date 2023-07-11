package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BookBean;
import com.dao.BookDAO;

public class ListAllBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListAllBooks() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		BookDAO bookDao = new BookDAO();
		ArrayList<BookBean> books = bookDao.listBook();
		for (BookBean bookBean : books) {
			System.out.println(bookBean.getTitle());
		}
		req.setAttribute("books", books);
		RequestDispatcher rd = req.getRequestDispatcher("BookList.jsp");
		rd.forward(req, res);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
