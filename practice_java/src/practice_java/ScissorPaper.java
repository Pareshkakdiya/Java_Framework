package practice_java;

import java.util.Random;
import java.util.Scanner;

public class ScissorPaper {
public static void main(String[] args) {
//	0 for rock
//	1 for paper
//	2 for scissor
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number from 0,1 or 2");
	 int a = scanner.nextInt();
	 
	 Random random = new Random();
	 int b = random.nextInt(3);
	 
	 if (a == b) {
		System.out.println("Draw");
	}else if (a == 0 && b == 2 || a == 2 && b == 1 || a == 1 && b == 0) {
		System.out.println("you win");
	}else {
		System.out.println("Computer win");
	}
	 if (b == 0) {
		System.out.println("Rock");
	}else if (b == 1) {
		System.out.println("Paper");
	}else {
		System.out.println("Scissor");
	}
}
}
