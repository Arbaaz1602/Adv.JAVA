<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--Retrieving the movie bean with id m1 with session scope --%>
	<jsp:useBean id="m1" class="example.bean.Movie" scope="session"></jsp:useBean>
	<h2>Movie Details</h2>
	<h3>Movie Number: <jsp:getProperty property="movieNumber" name="m1"/></h3>
	<h3>Movie name: <jsp:getProperty property="title" name="m1"/></h3>
	<h3>Genre: <jsp:getProperty property="genre" name="m1"/></h3>
	<h3>Year: <jsp:getProperty property="year" name="m1"/></h3>
	

	
</body>
</html>