package ace.assignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WorkOut2
 */
@WebServlet("/choose")
public class WorkOut2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorkOut2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String[]subjects = request.getParameterValues("subj");
		
		if(subjects == null) {
		out.println("<html><body>");
		out.println("<p style='color:red;'>Choose One!!!!</p>");
		out.println("</html></body>");
		request.getRequestDispatcher("subject.html").include(request, response);
		}
		else {
			out.println("Your Professional is :"+"<br><br>");
			for(int i=0;i<subjects.length;i++) {
				out.print((i+1)+"."+subjects[i]);
				out.print("<br>");
			}
		}
	}
}
