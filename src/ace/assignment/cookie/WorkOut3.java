package ace.assignment.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WorkOut3
 */
@WebServlet("/WorkOut3")
public class WorkOut3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorkOut3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Cookie ckArr[] = request.getCookies();
		if(ckArr==null) {
			
			out.println("<html><body>");
			out.println("<div style='border: 1px solid black;"
					+ " width:400px; padding:20px'>");
			out.println("<p>Welcome Aboard,<br>You are the first vistor!!!</p>");
			out.println("</div>");
			out.println("</html></body>");
			
			Cookie ck = new Cookie("welcome","welcome");
			response.addCookie(ck);
		}
		else {
			out.println("<html><body>");
			out.println("<div style='border: 1px solid black;"
					+ " width:400px; padding:20px'>");
			out.println("<p>Welcome Back, the vistor!!!</p>");
			out.println("</div>");
			out.println("</html></body>");
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
