

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterTask implements Filter {
	
	static int count = 0;
	
    public FilterTask() {}

	public void destroy() {}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		/*
		//Example of Sending response by filter only
		
		
		out.println("<br>this site is under construction");
		out.close();
		*/
		
		//Example of counting the no. of visitors for a single page
		out.print("<br>Total Visitors: " + (++count));
		out.close();
		chain.doFilter(req, res);
		
	}

	public void init(FilterConfig fConfig) throws ServletException {}

}
