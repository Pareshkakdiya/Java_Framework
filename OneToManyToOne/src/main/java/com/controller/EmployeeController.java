package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.tuple.entity.BytecodeEnhancementMetadataNonPojoImpl;

import com.bean.Dept;
import com.bean.Emp;
import com.dao.EmpDao;


@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	String action=request.getParameter("action");
    	if (action.equalsIgnoreCase("insert dept")) {
			
    		Dept d=new Dept();
    		d.setDname(request.getParameter("dname"));
    		d.setJob(request.getParameter("job"));
    		d.setLocation(request.getParameter("location"));
    		EmpDao.insertDept(d);
    		response.sendRedirect("insert.jsp ");
		}
    	else if (action.equalsIgnoreCase("insert emp")) {
			Emp e=new Emp();
			e.setEname(request.getParameter("ename"));
			e.setSalary(Double.parseDouble(request.getParameter("salary")));
			int did=Integer.parseInt(request.getParameter("dept"));
			Dept d=EmpDao.getDept(did);
			e.setDept(d);
			EmpDao.insertEmp(e);
			response.sendRedirect("emp.jsp");
			
		}
	}

}
