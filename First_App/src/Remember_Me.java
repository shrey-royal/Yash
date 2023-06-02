

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Remember_Me extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Remember_Me() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie ck[] = new Cookie[2];
		
		ck[0] = new Cookie("uname", req.getParameter("uname"));
		ck[1] = new Cookie("pass", req.getParameter("pass"));
		
		ck[0].setMaxAge(2147483647);
		ck[1].setMaxAge(2147483647);
		
		if(req.getParameter("cb") != null) {
			for(Cookie c: ck){
				res.addCookie(c);
				System.out.println("Coookie Added -> " + c.getName());
			}
		} else {
			for(Cookie c: ck){
				System.out.println("Coookie Deleted -> " + c.getName());
				c.setMaxAge(0);	//delete cookie
			}
		}
		
		
		res.sendRedirect("http://localhost:8080/First_App/remember_me.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
