<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href=
"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="person" class="ace.assignment.BeanPerson"></jsp:useBean>
	<jsp:setProperty property="name" name="person"></jsp:setProperty>
	<jsp:setProperty property="birth" name="person"></jsp:setProperty>
	<jsp:setProperty property="gender" name="person"></jsp:setProperty>
	<jsp:setProperty property="course" name="person"></jsp:setProperty>
	
	<%@ page import="ace.assignment.BeanPerson"%>
	
	<%! 
		BeanPerson beanPerson = new BeanPerson();
	%>
	
		<table class="table">
		  <thead>
			    <tr>
			      <th scope="col">Label</th>
			      <th scope="col">Use JSP UseBean</th>
			      <th scope="col">Use Expression Language</th>
			    </tr>
		  </thead>
			  <tbody>
				    <tr>
				      <th scope="row">Name</th>
				      <td><jsp:getProperty property="name" name="person"></jsp:getProperty></td>
				      <td>${param.name}</td>
				    </tr>
				    <tr>
				      <th scope="row">DOB</th>
				      <td><jsp:getProperty property="birth" name="person"></jsp:getProperty></td>
				      <td>${param.birth}</td>
				    </tr>
				    <tr>
				      <th scope="row">Gender</th>
				      <td><jsp:getProperty property="gender" name="person"></jsp:getProperty></td>
				      <td>${param.gender}</td>
				    </tr>
				    <tr>
				      <th scope="row">Knowledge You May Know</th>
				      <td><jsp:getProperty property="course" name="person"></jsp:getProperty></td>
				      <td>${param.course}</td>
				    </tr>
				    <tr>
				      <th scope="row">Class You want to attend</th>
				      <td> <%
							beanPerson.setKnowledge(request.getParameterValues("knowledge"));
							String[]arrOut = beanPerson.getKnowledge();
							for(int i=0;i<arrOut.length;i++) {
								out.print(arrOut[i]+",");
							}
						%></td>
				      <td> <%
							beanPerson.setKnowledge(request.getParameterValues("knowledge"));
							String[]arrOut1 = beanPerson.getKnowledge();
							for(int i=0;i<arrOut.length;i++) {
								out.print(arrOut[i]+",");
							}
						%></td>
				    </tr>
		     </tbody>
	</table>
	
</body>
</html>