<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
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
			<input type="date" name="birthday">
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
			<input type="checkbox" name="html">HTML
			<input type="checkbox" name="css" >CSS
			<input type="checkbox" name="javascript" >JavaScript
			<input type="checkbox" name="css" >jQuery
		</span>
	</div>
	<br>
	<div>
		<label for="cars">Choose a car:</label>
			<select name="lang" id="lang">
			  <option value="python">Python</option>
			  <option value="java">Java</option>
			</select>
	</div>
	<br>
	<span style="padding-top: 10px; padding-left: 90px;"><input type="submit" value="Submit"></span>
	<span style="padding-top: 10px; padding-left: 10px;"><input type="submit" value="Reset"></span>
</body>
</html>