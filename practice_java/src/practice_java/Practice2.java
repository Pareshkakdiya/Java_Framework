package practice_java;

import java.util.Scanner;

public class Practice2 {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your income in lakhs per annum");
	float tax = 0;
	float income = sc.nextFloat();
	if (income <= 2.5f) {
		tax = tax + 0;
	}
	
	else if(income > 2.5f && income <= 5f) {
		tax = tax + 0.05f*(income - 2.5f);
	}
	
	else if(income > 5.0f && income <=10f) {
		tax = tax + 0.05f*(income - 2.5f);
		tax = tax + 0.2f*(income -5f);   
		 
	}
	
	else if(income >10f) {
		tax = tax + 0.05f*(income - 2.5f);
		tax = tax + 0.2f*(income -5f);
		tax = tax + 0.3f*(income - 10f);
	}
	System.out.println("The total tax paid by employee :"+tax);
			
}
}
