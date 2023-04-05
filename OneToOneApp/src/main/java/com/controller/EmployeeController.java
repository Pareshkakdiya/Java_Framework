package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.problem.AbortCompilation;

import com.bean.Employee;
import com.bean.EmployeeInfo;
import com.dao.EmployeeDao;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action=request.getParameter("action");
		if (action.equalsIgnoreCase("insert"))
		{
			
			EmployeeInfo einfo=new EmployeeInfo();
			einfo.setFname(request.getParameter("fname"));
			einfo.setLname(request.getParameter("lname"));
			einfo.setEmail(request.getParameter("email"));
			EmployeeDao.insertEmployeeInfo(einfo);
			Employee e=new Employee();
			e.setUname(request.getParameter("uname"));
			e.setPassword(request.getParameter("password"));
			e.setEinfo(einfo);
			EmployeeDao.insertEmployee(e);
			response.sendRedirect("show.jsp");
		}
		else if (action.equalsIgnoreCase("edit")) 
		{
			int id=Integer.parseInt(request.getParameter("id"));
			Employee e=EmployeeDao.getEmployee(id);
			request.setAttribute("e", e);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		else if (action.equalsIgnoreCase("update"))
		{
			EmployeeInfo einfo=new EmployeeInfo();
			einfo.setEinfo(Integer.parseInt(request.getParameter("einfo")));
			einfo.setFname(request.getParameter("fname"));
			einfo.setLname(request.getParameter("lname"));
			einfo.setEmail(request.getParameter("email"));
			EmployeeDao.insertEmployeeInfo(einfo);
			Employee e=new Employee();
			e.setId(Integer.parseInt(request.getParameter("id")));
			e.setUname(request.getParameter("uname"));
			e.setPassword(request.getParameter("password"));
			e.setEinfo(einfo);
			EmployeeDao.insertEmployee(e);
			response.sendRedirect("show.jsp");
		}
		else if (action.equalsIgnoreCase("delete")) 
		{
			int id=Integer.parseInt(request.getParameter("id"));
			EmployeeDao.deleteEmployee(id);
			response.sendRedirect("show.jsp");
		}
	}

}
