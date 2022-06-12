package ace.assignment.login;

import java.io.IOException; 
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class WorkOut5
 */
@WebServlet("/register2")
public class WorkOut5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Person person = new Person();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorkOut5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			person.setName(request.getParameter("name")); 
		
			person.setPassword(request.getParameter("password"));
			
			person.setGender(request.getParameter("gender"));
			
			person.setEmail(request.getParameter("email")); 
			
			person.setAddress(request.getParameter("address"));
			
			HttpSession session = request.getSession();
			session.setAttribute("person",person);
			
			if(person.getName() == "" ||
					   person.getPassword() == "" ||
					   person.getEmail() == "") {
						out.println("<html><body>");
						out.println("<p style='color:red;'>Fill the blank!!!</p>");
						out.println("</body></html>");
						request.getRequestDispatcher("register2.html").include(request, response);
				}
			else {
				out.println("<p style='color:red;'>Succesfully Register!!!"
									+" "+ person.getName()+"</p>");
				request.getRequestDispatcher("login.html").include(request, response);
			}
	}
}
