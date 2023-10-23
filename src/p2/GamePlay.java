package p2;

import java.util.Random;
import java.util.Scanner;

public class GamePlay {
	
	public static void main(String[] args) {
		
	
	Scanner reader=new Scanner(System.in);
	String Play="yes";
	
	while(Play.equals("yes")) {
		Random random=new Random();
		int randNum=random.nextInt(100);
		
		int guess=-1;
		int tries=0;
		
		while(guess!=randNum) {
			
			System.out.println("Guess a number between 1-100");
			guess=reader.nextInt();
			tries++;
			
			if(guess==randNum) {
				System.out.println("awesome you guess the num");
				System.out.println("it only took you"+tries+"guess");
				System.out.println("would you like to play again ");
				 Play = reader.next().toLowerCase();
			}
			else if(guess > randNum){
				System.out.println("your guess is too high guess agian");
			}
			else {
				System.out.println("your guess is too low try again");
			}
			
		}
		
	}
	reader.close();

}
}