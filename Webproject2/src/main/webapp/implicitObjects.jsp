<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h2>Demonstrating implicit objects</h2>
	<%--Retrieving request specific parameters --%>
	
	<%
	String firstName = request.getParameter("fname");
	String lastName = request.getParameter("lname");
	
	%>
	
	<%--Obtaining the session id which is created by this user --%>
	
	<%
	String sessionId = session.getId();
	%>
	
	<%--Printing all the details using jsp writer object out --%>
	
	<%
	out.println("<h2>Hello: "+firstName+" "+lastName+"</h2>");
	out.println("<h2>Session id: "+sessionId+"</h2>");
	%>
</body>
</html>