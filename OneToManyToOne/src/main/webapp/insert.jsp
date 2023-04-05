<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="insert" method="post" action="EmployeeController" >
<table>
<tr>
<td>Department name</td>
<td><input type="text" name="dname"></td>
</tr>
<tr>
<td>Job</td>
<td><input type="text" name="job"></td>
</tr>
<tr>
<td>Location</td>
<td><input type="text" name="location"></td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" name="action" value="Insert Dept">
</td>
</tr>
</table>

</form>

</body>
</html>