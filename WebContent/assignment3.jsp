<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="jspBean.jsp">
	<div>
		<span>Name</span>
		<span>
			<input type="text" name="name">
		</span>
	</div>
	<br>
	<div>
		<span>DOB</span>
		<span>
			<input type="date" name="birth">
		</span>
	</div>
	<br>
	<div>
		<span>Gender</span>
		<span>
			<input type="radio" name="gender" value="Male">Male
			<input type="radio" name="gender" value="Female">Female
		</span>
	</div>
	<br>
	<div>
		<span>Knowledge You May Know</span>
		<span>
			<input type="checkbox" name="knowledge" value="Html">HTML
			<input type="checkbox" name="knowledge" value="CSS">CSS
			<input type="checkbox" name="knowledge" value="JavaScript">JavaScript
			<input type="checkbox" name="knowledge" value="jQuery">jQuery
		</span>
	</div>
	<br>
	<div>
			<label>Choose one class you want to attend</label>
			<select name="course" id="course">
			  <option value="Python">Python</option>
			  <option value="Java">Java</option>
			</select>
	</div>
	<br>
	<span style="padding-top: 10px; padding-left: 240px;"><input type="submit" value="Submit"></span>
</form>
</body>
</html>