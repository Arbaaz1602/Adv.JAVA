<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Welcome to the demo of all the things </h2>
<%--Including the resource read.html --%>
<%@ include file="read.html" %>
<%--Declaring some variable and defining a method --%>
<%!
	int marks=98;
	public String showGreeting(String username)
	{
		return "Welcome "+username;
	}
	
%>

<h1>Printing welcome 5 times</h1>

<%
	for(int a=1; a<=5;a++){
%>
	<h2>Welcome</h2>
<%
	}
	LocalDate systemDate = LocalDate.now();
	
%>

<%--Using expressions to fetch the data --%>

<h2>Marks obtained are<%=marks %></h2>
<h2>Marks falling short for 100 are <%=(100-marks) %></h2>
<h2>Reply frommethod show greeting is <%=showGreeting("Joker") %></h2>
<h2>Todays Date is <%=systemDate %></h2>




</body>
</html>