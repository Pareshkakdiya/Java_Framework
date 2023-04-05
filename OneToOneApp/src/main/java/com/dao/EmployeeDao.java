package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Employee;
import com.bean.EmployeeInfo;
import com.util.EmployeeUtil;

public class EmployeeDao {

	public static void insertEmployeeInfo(EmployeeInfo e) {
		Session session=EmployeeUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	public static void insertEmployee(Employee e) {
		Session session=EmployeeUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	public static List<Employee> getAllEmployees() {
		Session session=EmployeeUtil.createSession();
		List<Employee> list=session.createQuery("from Employee").list();
		session.close();
		return list;
	}
	public static Employee getEmployee(int id) {
		Session session=EmployeeUtil.createSession();
		Employee e=session.get(Employee.class, id);
		session.close();
		return e;
	}
	public static void deleteEmployee(int id) {
		Session session=EmployeeUtil.createSession();
		Transaction tr=session.beginTransaction();
		Employee e=session.get(Employee.class, id);
		session.delete(e);
		tr.commit();
		session.close();
	}
}
