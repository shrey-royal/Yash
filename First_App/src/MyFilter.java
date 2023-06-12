

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

    public MyFilter() {}

    public void init(FilterConfig fConfig) throws ServletException {}  
    
    


	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = res.getWriter();
		
		String password = req.getParameter("password");
		if(password.equals("admin")) {
			chain.doFilter(req, res);//sends request to next resource
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("filter.html");
			rd.include(req, res);
			out.print("Username or Password error!");
		}				
		
//		out.println("Filter is invoked before");
//		
//		chain.doFilter(req, res);
//	
//		out.println("filter is invoked after");
		out.close();
	
	}
	
	public void destroy() {}

}
