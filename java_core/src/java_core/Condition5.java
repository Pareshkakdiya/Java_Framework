package java_core;

public class Condition5 {
	public static void main(String[] args) {
		char choice='a';
		if (choice<'a'||choice>'z') {
			System.out.println("invalid input");
		}else {
			switch (choice) {			
					
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("vowel");
				break;
				
			default:
				System.out.println("consonant");
				break;
			}
		}
	}

}
