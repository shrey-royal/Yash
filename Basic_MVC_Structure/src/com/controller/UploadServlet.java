package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

@WebServlet("/upload")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		String filePath = "C:\\Users\\Shrey Kadia\\Documents\\Work\\Shrey@Royal\\Java\\Yash\\Basic_MVC_Structure\\WebContent\\files";
		int maxFileSize = 50000 * 1024;
		
		@SuppressWarnings("unused")
		MultipartRequest m = new MultipartRequest(req, filePath, maxFileSize);
		
		res.getWriter().print("File Uploaded Successfully! \n");		
	}
}
