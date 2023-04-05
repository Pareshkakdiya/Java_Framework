package java_core;


public class Condition2 {
	public static void main(String[] args) {
		int i=13;
		if(i>=15) {
			System.out.println("entered number is grater than 15");
		}else {
			System.out.println("entered number is smaller than 15");
		}
		
		int year =2024;
		if(year%4==0 && year%100!=0) {
			System.out.println("year is leap year");
		}else {
			System.out.println("year is not leap year");
		}
		
		int c=50;
		if(c%2==0) {
			System.out.println("no is even");
		}else {
			System.out.println("no is odd");
		}
		
	}

}
