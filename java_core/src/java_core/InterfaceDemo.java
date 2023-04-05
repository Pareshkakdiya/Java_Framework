package java_core;

class Result1{
	int marks;
	public void setaMarks() {
		marks = 34;
	}
}

class Staff extends Result1 implements StudentI,inter{

	@Override
	public void setNo() {
		// TODO Auto-generated method stub
		System.out.println("s no is...."+s_no);
		System.out.println("marks...."+marks);
		System.out.println("i no....."+i_no);
	}
	
}

public class InterfaceDemo {
public static void main(String[] args) {
	Staff s1 = new Staff();
	s1.setaMarks();
	s1.setNo();
}
}
