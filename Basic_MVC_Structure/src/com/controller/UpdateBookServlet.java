package com.controller;

import java.io.IOException;
import java.util.EnumMap;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BookBean;

public class UpdateBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateBookServlet() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		Enumeration<String> bookData = req.getParameterNames();
//		while(bookData.hasMoreElements()) {
//			String param = bookData.nextElement();
//			System.out.println("Param Name: " + param);
//			System.out.println("Param Value: " + req.getParameter(param));
//		}
		String id = req.getParameter("id");
		String title = req.getParameter("title");
		String author = req.getParameter("author");
		String price = req.getParameter("price");
		
		BookBean bookBean = new BookBean();
		
		bookBean.setId(Integer.parseInt(id));
		bookBean.setTitle(title);
		bookBean.setAuthor(author);
		bookBean.setPrice(Float.parseFloat(price));
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
