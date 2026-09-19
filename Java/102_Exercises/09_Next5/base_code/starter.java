/*
 *	Author:Max Leerhuber
 *  Date:9/15/26
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		System.out.println("Here are the next five numbers: " +(num + 1) + ", " + (num + 2) + ", " + (num + 3) + ", " + (num + 4) + ", " + (num + 5));
		System.out.println("Here are the next five multiples of " + num + ": " + (num * 1) + ", " + (num * 2) + ", " + (num * 3) + ", " + (num * 4) + ", " + (num * 5));
		System.out.println("Here is " + num + " divided by 100: " + ((double)num / 100));
		System.out.println("Here is " + num + " divided by 10: " + ((double)num / 10));

	}
}
