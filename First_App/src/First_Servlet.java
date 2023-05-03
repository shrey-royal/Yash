import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class First_Servlet extends HttpServlet {
	ServletConfig config = null;
	
	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("Servlet is Initialized");
	}
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("<b>Hello World, From servlet</b>");
		out.print("</body></html>");
	}
	
	public void destroy() { System.out.println("Servlet is Destroyed");	}
	public ServletConfig getServletConfig() { return config; }
	public String getServletInfo() { return "Yash bhai no Copyright"; }


}
