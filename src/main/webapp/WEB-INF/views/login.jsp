<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello from JSP</title>
</head>
<body>
	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<form action="/login" method="post">
		Username: <input type="text" name="username" />
		Password: <input type="password" name="password" /> <input type="submit" />
	</form>
</body>
</html>