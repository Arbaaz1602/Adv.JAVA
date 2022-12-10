<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<h1>User login form</h1>
<form action="login" method="post">
<h4>For Existing User</h4>
<table>

<tr><td>User Name: </td> <td><input type="text" name="username"></td></tr>
<tr><td>Password: </td> <td><input type="password" name="password"></td></tr>
<tr><td></td><td><input type="submit" name="login"></td></tr>
</table>
</form>
<h4>For New User</h4>
<form action="newLogin" method="post">
<table>

<tr><td>User name: </td> <td><input type="text" name="username"></td></tr>
<tr><td>Password: </td> <td><input type="password" name="password"></td></tr>
<tr><td>First name: </td> <td><input type="text" name="firstname"></td></tr>
<tr><td>Last name: </td> <td><input type="text" name="lastname"></td></tr>
<tr><td>Age: </td> <td><input type="number" name="age"></td></tr>
<tr><td>City: </td> <td><input type="text" name="city"></td></tr>
<tr><td></td><td><input type="submit" name="Create new User"></td></tr>
</table>
</form>
</div>


</body>
</html>



<%--This page will be the first page that will be shown at the time of login --%>>