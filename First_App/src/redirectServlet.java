

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class redirectServlet
 */
public class redirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public redirectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String site_url = "https://www." + req.getParameter("site_url");
//		String website = "https://www." + req.getParameter("sites");
		String sites[] = req.getParameterValues("sites");
		
		for(String i: sites) {
			System.out.println(i);
		}
//		res.sendRedirect("https://www." + sites);
		
		PrintWriter out = res.getWriter();
		for(int i=0; i<sites.length; i++) {
			out.print("<a href='https://www."+sites[i]+"' target='_blank'>"+ sites[i] +"</a><br><br>");
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
