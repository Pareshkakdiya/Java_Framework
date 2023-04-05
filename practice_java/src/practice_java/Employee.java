package practice_java;
//class Employee1{
//	int salary;
//	String name;
//	
//	public int getSalary() {
//		return salary;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String n) {
//		name = n;
//	}
//}

class Square{
	
	int a;
	public int area() {
		return a*a;
	}
	
	public int perimeter() {
		return 4*a;
	}
}
public class Employee {
public static void main(String[] args) {
//	Employee1 e1 = new Employee1();
//    e1.setName("Paresh");
//    e1.salary = 20000;
//    System.out.println(e1.getName());
//    System.out.println(e1.getSalary());
	
	Square square = new Square();
	square.a = 4;
	System.out.println(square.area());
	System.out.println(square.perimeter());
   }
}
