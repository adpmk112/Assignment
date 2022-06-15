package ace.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ace.project.model.Student;
import ace.project.model.StudentInfo;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Student newStudent(HttpServletRequest request) {
		Student student = new Student();
		
		student.setId(request.getParameter("id")); 
		student.setName(request.getParameter("name")); 
		student.setBirth(request.getParameter("birth")); 
		student.setGender(request.getParameter("gender")); 
		student.setPhone(request.getParameter("phone"));
		student.setEducation(request.getParameter("education")); 
		student.setAttend(request.getParameterValues("attend")); 
		return student;
	}
	
	public void createStudent(Student student,StudentInfo info,HttpServletRequest request) {
		info.addStudent(student);
		request.getServletContext().setAttribute("studentList", info.getStudentList());
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
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
		StudentInfo info = new StudentInfo();
		StudentController controller = new StudentController();
		Student student = controller.newStudent(request);
		controller.createStudent(student,info,request);
		request.getRequestDispatcher("studentList.jsp").include(request, response);
	}
}
