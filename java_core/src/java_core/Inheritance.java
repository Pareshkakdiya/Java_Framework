package java_core;

class Student1{
	int roll;
	String nameString;
	
	public void setStudentData() {
		roll = 23;
		nameString = "Paresh";
	}
	
    public Student1() {
		System.out.println("in student constuctor");
    }
}

class Sport extends Student1{
	int sport = 56;
	public void display() {
		System.out.println("Roll no : "+roll);
		System.out.println("Name : "+nameString);
		System.out.println("Sport : "+sport);
	}
	
	public Sport() {
		System.out.println("in sport constuctor");
    }
}

class Result extends Sport{
	char grade;
	public void setGrade(char ch) {
		grade = ch;
	}
	public void display() {
		System.out.println("Roll no : "+roll);
		System.out.println("Name : "+nameString);
		System.out.println("Sport : "+sport);
		System.out.println("Grade : "+grade);
	}
	
	public Result() {
		System.out.println("in result constructor");
	}
} 

public class Inheritance {
public static void main(String[] args) {
//	Sport s1 = new Sport();
//	s1.setStudentData();
//	s1.display();
	
	Result result = new Result();
	result.setStudentData();
	result.setGrade('A');
	result.display();
  }
}
