

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class cookie_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public cookie_1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie ck[] = req.getCookies();
		
		for(Cookie i: ck) {
			System.out.println("Cookie Name: " + i.getName());
			System.out.println("Cookie Value: " + i.getValue() + "\n\n");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
