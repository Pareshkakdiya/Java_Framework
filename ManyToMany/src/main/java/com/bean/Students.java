package com.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "STUDENTS")
public class Students {
	int sid;
	String sname;
	Collection<Courses> courses;
	@Id
	@GenericGenerator(name = "sc", strategy = "increment")
	@GeneratedValue(generator = "sc")
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Column(name="SNAME")
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@ManyToMany
	@JoinTable(name = "COURSES_STUDENTS",joinColumns = @JoinColumn(name="SID"),inverseJoinColumns = @JoinColumn(name="CID"))
	public Collection<Courses> getCourses() {
		return courses;
	}
	public void setCourses(Collection<Courses> courses) {
		this.courses = courses;
	}
	

}
