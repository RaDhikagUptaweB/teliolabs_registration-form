<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>  
<html>  
<head>  
<meta charset="ISO-8859-1">  
<title>Insert title here</title>  
</head>  
<body>  
  
<h1>Add New Employee</h1>  
<form action="SaveServlet" method="post">  
<table>  
<tr><td>Name:</td><td><input type="text" name="name"/></td></tr>  
<tr><td>Email:</td><td><input type="email" name="email"/></td></tr>  
<tr><td>Password:</td><td><input type="password" name="password"/></td></tr>  
<tr><td>Profession:</td><td>  
<select name="profession" style="width:150px">  
<option>Developer</option>  
<option>consultant</option>  
<option>Hr</option>  
<option>Other</option>  
</select>  
</td></tr>  
<tr><td colspan="2"><input type="submit" value="Save Employee"/></td></tr>  
</table>  
</form>  
  
<br/>  
<a href="ViewServlet">view employees</a>  
  
</body>  
</html>  