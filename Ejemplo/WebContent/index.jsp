<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejemplo</title>
</head>
<body>
<h1>Bienvenido a Ejemplo</h1>
<h2>Suma</h2>
<form action="Operation" method="get" target="_blank">
<input type="hidden" name="operation" value="0"/> 
<input type="number" name="a" />
<input type="number" name="b" />
<input type="submit"/>
</form>
<h2>Resta</h2>
<form action="Operation" method="get" target="_blank">
<input type="hidden" name="operation" value="1"/> 
<input type="number" name="a" />
<input type="number" name="b" />
<input type="submit"/>
</form>
</body>
</html>