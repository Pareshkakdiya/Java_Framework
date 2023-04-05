package com.exeception;


import java.io.IOException;
import java.util.Scanner;

class PareshException extends Exception{

double amount;
public PareshException(double amount) {
	this.amount = amount;
   }
}

class ATM{
	double balance;

    public void deposit(double amount) {
	     balance += amount;
	     System.out.println("your deposit amount is :"+amount);
	     System.out.println("your total amount is :"+balance);
	}
    
    public void withdraw(double amount) throws PareshException,ArithmeticException,IOException{
	 if (amount<balance) {
		   System.out.println("your withdraw amount is :"+amount);
		   balance -= amount;
		   System.out.println("your total amount is :"+balance);
	}else {
		double needs;
		needs = amount-balance;
	    throw new PareshException(needs);
	}
	  
	}
}

public class ExceptionHandlingDemo {
public static void main(String[] args) {
	ATM atm = new ATM();
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter deposit amount :");
	double amount = scanner.nextDouble();
	atm.deposit(amount);
	
	System.out.println("enter withdraw amount :");
	double amount1 = scanner.nextDouble();
	
	try {
		atm.withdraw(amount1);
	} catch (PareshException e) {
	System.out.println("if you enter"+e.amount+"more in your account you can withdraw"+amount1);
	} catch (ArithmeticException e) {
		// TODO: handle exception
	}catch (IOException e) {
		// TODO: handle exception
	}
	
	
}
}
