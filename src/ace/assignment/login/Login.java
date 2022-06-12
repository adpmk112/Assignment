package ace.assignment.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		Person person = (Person) request.getSession().getAttribute("person");
		
		String inputName = request.getParameter("lname");
		String inputPassword = request.getParameter("lpassword");
		
	if(inputName == "" ||
		   inputPassword == "") {
					out.println("<html><body>");
					out.println("<form action='login' method='post'>");
					out.println("<p style='color:red;'>Fill the blank!!</p>");
					out.println("</form");
					out.println("</html></body>");
					request.getRequestDispatcher("login.html").include(request, response);
				}
	
	else if(inputName.equals(person.getName()) && 
				   inputPassword.equals(person.getPassword())) {
					out.println("<html><body>");
					out.println("<h2>Successful Login!!"+" "+person.getName()+"</h2>");
					out.println("</html></body>");
			}
		
		else {
			out.println("<html><body>");
			out.println("<form action='login' method='post'>");
			out.println("<p style='color:red;'>UserName and Password do not match!!</p>");
			out.println("</form");
			out.println("</html></body>");
			request.getRequestDispatcher("login.html").include(request, response);
		}
	}

}
