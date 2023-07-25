package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

@WebServlet("/FileUploadServlet")
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String path = "C:\\Users\\Shrey Kadia\\Documents\\Work\\Shrey@Royal\\Java\\Yash\\Basic_MVC_Structure\\WebContent\\files";
		
		@SuppressWarnings("unused")
		MultipartRequest m = new MultipartRequest(req, path);
		out.print("File Uploaded");
		System.out.println("File Uploaded Sucessfully");
		
		RequestDispatcher rd = req.getRequestDispatcher("list");
		rd.forward(req, res);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
