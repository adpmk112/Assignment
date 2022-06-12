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
 * Servlet implementation class WorkOut1
 */
@WebServlet("/register")
public class WorkOut1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorkOut1() {
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
		
		String name = request.getParameter("name");
		
		String birth = request.getParameter("birthday");
		
		String gender = request.getParameter("gender");
		
		List<String>info = new ArrayList<>();
		info.add("Name : "+name);
		info.add("DOB : "+birth);
		info.add("Gender : "+gender);
		
		String[]value = request.getParameterValues("subject");
		
		for(String i:info) {
			out.println(i);
		}
	
		for(String v:value) {
			out.println("Subject : "+v);
		}
	}
}
