<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="subject.html"%>

<%
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
%>
</body>
</html>