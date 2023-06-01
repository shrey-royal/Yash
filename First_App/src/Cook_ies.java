

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cook_ies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Cook_ies() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		Cookie ck = new Cookie(name, req.getParameter("password"));
		
		//ck.setMaxAge(10);
		
		res.addCookie(ck);
		
		PrintWriter out = res.getWriter();
		
		 out.print("<form action='cookie_1'>");  
		 out.print("<input type='submit' value='go'>");  
		 out.print("</form>");  
		 
//		RequestDispatcher rd = req.getRequestDispatcher("cookie_1");
//		rd.forward(req, res);
		
		
		res.sendRedirect("http://localhost:8080/First_App/cook_ies.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
