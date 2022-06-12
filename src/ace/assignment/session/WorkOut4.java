package ace.assignment.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WorkOut4
 */
@WebServlet("/WorkOut4")
public class WorkOut4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Count count = new Count();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorkOut4() {
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
		
		HttpSession session = request.getSession();
		session.setAttribute("count",count.increaseID());
		
		int result = (Integer)session.getAttribute("count");
		
		out.println("<html><body>");
		out.println("<form action='WorkOut4' method='get'>");
		out.println("<div style='border: 1px solid black;"
				+ " width:400px; padding-left:10px'>");
		out.println("<p>You have hit this page "
				+result
				+" times.</p>");
		out.println("</div>");
		out.println("</form");
		out.println("</html></body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
