package java_core;

import java.util.Scanner;

public class JaggedArray2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the no of row : ");
	int r = scanner.nextInt();
	int[][] a  = new int[r][];
	
	for (int i = 0; i < r; i++) {
		System.out.println("enter the no of column : ");
		a[i] = new int[scanner.nextInt()];
	}
	
	for (int i = 0; i < r; i++) {
		for (int j = 0; j < a[i].length; j++) {
		    System.out.println("enter vlue : ");
			a[i][j] = scanner.nextInt();
		}
	}
	
	for (int i = 0; i < r; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}
  }
}
