<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>
<%
  ApplicationContext a= new ClassPathXmlApplicationContext("Beans.xml");
  StudentDao studentDao=a.getBean("studentDao",StudentDao.class);
%>
<table width="100%" border="5" cellpadding="10px" cellspacing="10px">
<tr>
<th>ID</th>
<th>FIRST NAME</th>
<th>LAST NAME</th>
<th>EMAIL</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>
<%
  List<Student> list=studentDao.getAllStudent();
  for(Student s:list){
	  
%> 	  
  <tr>
  <td><%=s.getId() %></td>
  <td><%=s.getFname() %></td>
  <td><%=s.getLname() %></td>
  <td><%=s.getEmail() %></td>
 
  <td>
  <form name="edit" method="post" action="StudentController">
  <input type="hidden" name="id" value="<%=s.getId()%>">
  <input type="submit" name="action" value="EDIT" class="btn btn-primary">
  </form>
  </td>
  <td>
  <form name="delete" method="post" action="StudentController">
  <input type="hidden" name="id" value="<%=s.getId()%>">
  <input type="submit" name="action" value="DELETE" class="btn btn-danger">
  </form>
  </td>
  </tr>


<%
  }
%> 
</table>
<a href="insert.jsp">Add New Student</a>
</body>
</html>