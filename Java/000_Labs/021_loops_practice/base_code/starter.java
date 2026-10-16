/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 1000");
		int x = 0;
		int num = (int)(Math.random() *999 + 1);
		while (true) {
			System.out.println("Enter your guess: ");
			int guess = sc.nextInt();
			x = x + 1;
			if (guess < num) {
				System.out.println("Higher");
			}
			else if (guess > num) {
				System.out.println("Lower");
			}
		else if (guess == num) {
				System.out.println("You guessed the number!");
				System.out.println("It took you " + x + " guesses.");
				break;
		}

		
		
			
		
			
			
		}
		
		




		
	}

}