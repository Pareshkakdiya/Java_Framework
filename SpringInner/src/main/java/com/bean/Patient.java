package com.bean;

public class Patient {

	private int pno;
	private String pname;
	private Hospital h;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Hospital getH() {
		return h;
	}
	public void setH(Hospital h) {
		this.h = h;
	}
	public void call() {
		System.out.println("Calling for...");
		h.takeAppiontment();
	}
}
