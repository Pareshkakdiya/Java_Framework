package com.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Student;

public class StudentDao extends HibernateDaoSupport{

	@Transactional
	public void insertStudent(Student s) {
		getHibernateTemplate().saveOrUpdate(s);
	}
	public List<Student> getAllStudent() {
		return (List<Student>) getHibernateTemplate().find("from Student");
	}
	@Transactional
	public void deleteStudent(int id) {
		Student s=getHibernateTemplate().get(Student.class, id);
		getHibernateTemplate().delete(s);
	}
	public Student getStudent(int id) {
		return getHibernateTemplate().get(Student.class, id);
	}
}
