

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();
    }

    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		req.getRequestDispatcher("link.html").include(req, res);
		
		String name = req.getParameter("name");
		System.out.println(name);
		String password = req.getParameter("password");
		
		ServletContext context = getServletContext();
		
		if(password.equals(context.getInitParameter("password"))) {
			out.print("you are successfully logged in!");
			out.print("<br>Welcome " + name + "!");
			
			
			Cookie ck = new Cookie("name", name);
			res.addCookie(ck);
		} else {
			out.print("Sorry, username and password error!");
			req.getRequestDispatcher("cookies_login.html").include(req, res);
		}
		
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
