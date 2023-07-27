package com.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String fileName = "embrace.webp";
		String filePath = "C:\\Users\\Shrey Kadia\\Documents\\Work\\Shrey@Royal\\Java\\Yash\\Basic_MVC_Structure\\WebContent\\files\\";
		
		res.setContentType("APPLICATION/OCTET-STREAM");
		res.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
		
		FileInputStream fileInputStream = new FileInputStream(filePath + fileName);
		
		int i;
		while((i = fileInputStream.read()) != -1) {
			out.write(i);
		}
		
		fileInputStream.close();
		out.close();
		
		req.getRequestDispatcher("list").forward(req, res);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
