

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calculateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public calculateServlet() { super(); }
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int result = a+b;
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.print("<html><head><title>Result Page</title></head><body>");
		out.print("<h1>Addition</h1><br><br>");
		out.print("<h3>Addition of " + a + " and " + b + " is " + result + " </h3>");
		out.print("</body></html>");
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		doGet(request, response);	}

}
