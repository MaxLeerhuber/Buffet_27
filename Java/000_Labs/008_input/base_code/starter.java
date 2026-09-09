/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("What is your first name?");
		String text = sc.nextLine();
		System.out.println("What is your age?");
		int number = sc.nextInt();
		System.out.println("What month were you born in?");
		String text2 = sc.nextLine();
		System.out.println("Which day of the week were you born on?");
		String text3 = sc.nextLine();
		System.out.println("What year were you born in?");
		int number2 = sc.nextInt();
		System.out.println("How much is a buck fifty?");
		double money = sc.nextDouble();
	}
}
