package java_core;



class Addition{
	int a,b;
	public Addition() {
		a = 1;
		b = 2;
		System.out.println("Sum of cns:"+(a+b));
	}                                        
	
	public Addition(int p, int q){ 
		a = p;
		b = q;
		System.out.println("sum of cns with parameter:"+(a+b));
	}
	
public void sum() {
	a=10;
	b=20;
	System.out.println("sum of first method : "+(a+b));
}
	
	public void sum(int x) {
		a=b=x;
		System.out.println("sum of second method : "+(a+b));
}
	
	public void sum(float x) {
		a=b=(int)x;
		System.out.println("sum of third method :"+(a+b));
	}
	
	public void sum(int x, int y) {
		a=x;
		b=y;
		System.out.println("sum of fourth method : "+(a+b));
	}
}

public class PolymorphismDemo {
public static void main(String[] args) {
	Addition addition = new Addition();
	Addition addition2 = new Addition(11,12);
	addition.sum();
	addition.sum(100);
	addition.sum(52.25f);
	addition.sum(100,200);
	
	
	
	
  }

}