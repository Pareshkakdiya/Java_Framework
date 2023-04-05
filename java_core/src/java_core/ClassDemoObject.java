package java_core;

class Student{
	private int rollno;
	private String name,degree,city;
	void setStudentData() {
		rollno = 12;
		name= "Paresh";
		degree = "B.E.mech";
		city = "surat";
	}
	void displayStudent(){
		System.out.println("roll no:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Degree:"+degree);
		System.out.println("City:"+city);

	}

	}

public class ClassDemoObject {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudentData();
		s1.displayStudent();
	}

}
