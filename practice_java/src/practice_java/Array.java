package practice_java;



public class Array {
public static void main(String[] args) {
//	Float sum = 0.0f;
//	Float marks[] = {75.5f,78.0f,78.5f,89.5f,57.5f};
//	for (int i = 0; i < marks.length; i++) {
//		sum = sum + marks[i];
//	
//	}
//	System.out.println("The sum of marks is:"+sum);
	
//	float marks[] = {56.5f,78.5f,98.0f,45.5f,73.5f};
//	float num =45.0f;
//	Boolean isInArray = false;  
//	
//	for (int i = 0; i < marks.length; i++) {
//		if (num == marks[i]) {
//			isInArray = true;
//			break;
//		}
//		
//		
//	 }
//		if (isInArray == true) {
//			System.out.println("num is available in Array");
//			
//		}else {
//			System.out.println("num is not available in Array");
//		}
	 
//	int m1[][] = {{1,2,3},
//			          {4,5,6}};
//	int m2[][] = {{7,8,9},
//	                  {0,1,2}};
//	int result[][] = {{0,0,0},
//			            {0,0,0}};
//	
//	
//	
//	for (int i = 0; i < m1.length; i++) {
//		for(int j = 0; j < m1[i].length; j++) {
//			result[i][j] = m1[i][j]+m2[i][j]; 
//			System.out.print(result[i][j]+" ");
//		}
//		System.out.println("");
//	    }
	
//	int arr[] = {34,95,45,90,12,34};
//	int max = 0;
//	for (int i = 0; i < arr.length-1; i++) {
//		if (arr[i]>max) {
//			max = arr[i];
//		} 
//		
//	}
//	System.out.println("The max number is:"+max);
	
	int arr[] = {34,95,45,90,12,67};
	int temp;
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]>arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			
			} 
			
		}
		System.out.print(arr[i]+" ");
		
	}
	
			
       }
	}