package com.bean;

import java.util.Collection;
import java.util.jar.Attributes.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="COURSES")
public class Courses {
    int cid;
    String cname;
    Collection<Students> s;
    @Id
    @GenericGenerator(name="sc", strategy = "increment")
    @GeneratedValue(generator = "sc")
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Column(name="CNAME")
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@ManyToMany(mappedBy = "courses")
	public Collection<Students> getS() {
		return s;
	}
	public void setS(Collection<Students> s) {
		this.s = s;
	}
    
}
