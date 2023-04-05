package practice_java;

import java.util.Random;
import java.util.Scanner;



class Game{
	int number;
	int noOfGusses = 0;
	int inputNumber;
	
	public void setNoOfGusses(int noOfGusses) {
		this.noOfGusses = noOfGusses;
	}
	
	public int getNumber() {
		return noOfGusses;
	}
	
	Game(){
		Random random = new Random();
		number = random.nextInt(100);
     }
	
	void takeUserInput() {
		System.out.println("Guss the number:");
	Scanner scanner = new Scanner(System.in);
	inputNumber = scanner.nextInt();
	}
	
	boolean isCorrectNumber() {
		noOfGusses++;
		if (inputNumber == number) {
			System.out.format("your gusses is right, it was %d\n you gussed %d attempt",number,noOfGusses);
			return true;
		}else if (inputNumber > number) {
			System.out.println("number is to high");
		}else if (inputNumber < number) {
			System.out.println("number is to low");
		}
           return false;
	}
}
public class PracticeOfGame {
public static void main(String[] args) {
	Game g = new Game();
	boolean b = false;
	while(!b) {
	g.takeUserInput();
    b = g.isCorrectNumber();
	System.out.println(b);
	   }
    }
}
