<%@page import="com.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   Employee e=(Employee)request.getAttribute("e");
%>
<form name="update" method="post" action="EmployeeController" >
<table>
<tr>
<td><input type="hidden" name="id" value="<%=e.getId()%>"></td>
<td><input type="hidden" name="einfo" value="<%=e.getEinfo().getEinfo()%>"></td>
</tr>
<tr>
<td>First Name</td>
<td><input type="text" name="fname" value="<%=e.getEinfo().getFname()%>"></td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lname" value="<%=e.getEinfo().getLname()%>"></td>
</tr>
<tr>
<td>Email</td>
<td><input type="email" name="email" value="<%=e.getEinfo().getEmail()%>"></td>
</tr>
<tr>
<td>User Name</td>
<td><input type="text" name="uname" value="<%=e.getUname()%>"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" value="<%=e.getPassword()%>"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" name="action" value="Update">
</td>
</tr>
</table>

</form>
<a href="show.jsp">Show All Employee</a>
</body>
</html>