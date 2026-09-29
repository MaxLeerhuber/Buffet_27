/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Guess a number between 1 and 1000.");
		int x = (int)(Math.random()*1000 + 1);
		Scanner sc = new Scanner(System.in);
		int yournum = sc.nextInt();
		boolean equal = x==yournum;
		if(equal){
			System.out.println("You guessed the correct number!");
		}
		else{
			System.out.println("You guessed the wrong number. Here is the correct number: " + x);
		}
	}
}
