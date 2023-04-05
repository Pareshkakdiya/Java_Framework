package java_core;
class Parent{
	long mo_no;
	String pname;
	public void setParentData() {
		mo_no = 8888899999l;
		pname = "Paresh";
	}
}

class Child1 extends Parent{
	String cname;
	public void setName() {
		cname = "Prajval "+pname+" Kakadiya";
	}
	public void display() {
		System.out.println("child 1 data :"+cname+"\nMobile no : "+mo_no);
	}
}

class Child2 extends Parent{
	String cname;
	public void setName() {
		cname = "Prancee "+pname+" Kakadiya";
	}
	public void display() {
		System.out.println("child 2 data : "+cname+"\nMobile no : "+mo_no);
	}
}
public class Hierarchical {
public static void main(String[] args) {
	Child1 child1 = new Child1();
	child1.setParentData();
	child1.setName();
	child1.display();
	
	Child2 child2 = new Child2();
	child2.setParentData();
	child2.setName();
	child2.display();
}
}
