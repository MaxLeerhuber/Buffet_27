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
		System.out.println("Please enter three integers.");
		System.out.print("Enter the first integer: ");
		int x = sc.nextInt();
		System.out.print("Enter the second integer: ");
		int y = sc.nextInt();
		System.out.print("Enter the third integer: ");
		int z = sc.nextInt();
		if(x > y && x > z){
			System.out.println("The first integer is the largest.");
		}
		if (y > z && y > x){
			System.out.println("The second integer is the largest.");
		}
		if (z > y && z > x){
			System.out.println("The third integer is the largest.");
		}
		System.out.println("Now the code will find the smallest integer.");
		if(x < y && x < z){
			System.out.println("The first integer is the smallest.");
		}
		if (y < z && y < x){
			System.out.println("The second integer is the smallest.");
		}
		if (z < y && z < x){
			System.out.println("The third integer is the smallest.");
		}
	}
}
