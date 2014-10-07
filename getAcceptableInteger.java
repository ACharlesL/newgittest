/**
 * Exercise 5
 */

import java.util.Scanner;

public class getAcceptableInteger {
	private final int min = 0 ;
	private final int max = 10 ;
	private int userInput;
	
	/**
	 * Precondition:userInput is a nonnegative number.
	 * Postcondition:writes to the screen userInput.
	 */
	public void getValue(){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an Integer: ");
		userInput = keyboard.nextInt();
		
		while ((userInput>max) || (userInput < min)){
			
			System.out.println("Please enter an Integer within the range 0-10: ");
			userInput = keyboard.nextInt();
		}
		System.out.println("Thank you. Your value was: "+userInput);
	}
	
	
	
	
	
	

}
