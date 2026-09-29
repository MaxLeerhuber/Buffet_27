/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type in a number for x: "); 
		int x = sc.nextInt();
		System.out.print("Type in a number for y: ");
		int y = sc.nextInt();
		System.out.println("Now this code will see if they are equal to eachother or not."); 
		boolean equal = (x == y);
		boolean notequal = (x != y);
		if (equal){
			System.out.println("The numbers you inputted are equal to eachother.");


		}
		if (notequal){
			System.out.println("The numbers you inputted are not equal to eachother.");
		}
	}
}
