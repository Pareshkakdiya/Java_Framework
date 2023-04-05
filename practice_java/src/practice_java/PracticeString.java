package practice_java;

public class PracticeString {
	public static void main(String[] args) {
		String name = "Paresh";
		name = name.toLowerCase();
		System.out.println(name);
		
		String text = "My friend name";
		text = text.replace( " ","_");
		System.out.println(text);
		
		String letter = "My Friend <|name|>, thanks a lot";
		letter = letter.replace("<|name|>","Paresh");
		System.out.println(letter);
		String myString = "My name  is   paresh";
		
		System.out.println(myString.indexOf("  "));
		System.out.println(myString.indexOf("   "));
		
		String letter1 = "My friend,\n\t Java course is fine.\n Thank you.";
		System.out.println(letter1);
	}

}
