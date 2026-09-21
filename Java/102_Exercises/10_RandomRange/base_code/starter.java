/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first number for your range: ");
		int num1 = input.nextInt();
		System.out.print("Please enter the second number for your range (Must be bigger than first number): ");
		int num2 = input.nextInt();
		System.out.println();
		System.out.println();
		System.out.println("Your range is: " + num1 + " to " + num2);
		System.out.println("Here are five numbers generated in your range:");
		int x = num1 +(int)(Math.random()*(num2-num1));
		int y = num1 +(int)(Math.random()*(num2-num1));
		int z = num1 +(int)(Math.random()*(num2-num1));
		int w = num1 +(int)(Math.random()*(num2-num1));
		int v = num1 + (int)(Math.random()*(num2-num1));
		System.out.println("Here are the five numbers generated in your range: ");
		System.out.println(x + ", " + y + ", " + z + ", " + w + ", " + v);
	}
}
