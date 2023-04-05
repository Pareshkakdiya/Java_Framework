<%@page import="java.util.List"%>
<%@page import="com.bean.Employee"%>
<%@page import="com.dao.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="5" width="100%" cellspacing="10px" cellpadding="10px">
<tr>
<th>EINFO</th>
<th>FNAME</th>
<th>LNAME</th>
<th>EMAIL</th>
<th>EID</th>
<th>UNAME</th>
<th>PASSWORD</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>

<%
   List<Employee> list=EmployeeDao.getAllEmployees();
   for(Employee e : list)
   {
%>
<tr>
<td><%=e.getEinfo().getEinfo() %></td>
<td><%=e.getEinfo().getFname() %></td>
<td><%=e.getEinfo().getLname() %></td>
<td><%=e.getEinfo().getEmail() %></td>
<td><%=e.getId() %></td>
<td><%=e.getUname() %></td>
<td><%=e.getPassword() %></td>
<td>
<form name="edit" method="post" action="EmployeeController">
<input type="hidden" name="id" value="<%=e.getId()%>">
<input type="submit" name="action" value="EDIT">
</form>
</td>
<td>
<form name="delete" method="post" action="EmployeeController">
<input type="hidden" name="id" value="<%=e.getId()%>">
<input type="submit" name="action" value="DELETE">
</form>
</td>
</tr>

<%
    }
%>
</table>
<a href="insert.jsp">Add New Employee</a>
</body>
</html>