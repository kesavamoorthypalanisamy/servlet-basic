<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<body>
<div>
<form action="/login.do" method="post">
<p><font color="red">${errorMessage}</font></p>
Enter your name: <input type="text" name="name"/>
Enter your password: <input type="password" name="password"/>
<input type="submit" value="LOGIN"></input>
</form>
</div>
</body>
</html>