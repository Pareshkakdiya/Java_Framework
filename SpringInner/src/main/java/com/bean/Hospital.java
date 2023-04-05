package com.bean;

public class Hospital {

	private String hname;

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}
	public void takeAppiontment() {
		System.out.println("Register name.."+hname);
	}
}
