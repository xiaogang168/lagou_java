<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>demon</title>
</head>
<body>

<!-- <form action="/example/html/form_action.asp" method="get">
  <p>Your name: <input type="text" name="fname" /></p>
  <p>Last name: <input type="text" name="lname" /></p>  
 <input type="submit" value="Submit" />
</form> -->
<!-- <h1>hello</h1> -->
<h2>${output}</h2>

<form action="/getName" method="get">
  <p>name: <input type="text" name="name" /></p>
  <input type="submit" value="Submit" />
</form>

</body>
</html>