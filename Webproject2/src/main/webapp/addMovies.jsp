<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--Instantiating a java bean: Movie using UseBaean --%>
	<jsp:useBean id="m1" class="example.bean.Movie" scope="session"></jsp:useBean>
	<%--Setting the properties --%>
	<jsp:setProperty property="*" name="m1"/>
	<h2>Movie Created successfully</h2>
	<h2>To view details please <a href="showMovie.jsp">Click Here</a></h2>
	





</body>
</html>