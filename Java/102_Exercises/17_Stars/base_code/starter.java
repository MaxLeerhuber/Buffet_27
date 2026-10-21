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
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a width: ");
		int width = sc.nextInt();
		System.out.print("Please enter a height: ");
		int height = sc.nextInt();
		int w = 0;
		int h = 0;
		while (h != height){
			while (w != width){
				System.out.print("*");
				w++;
			}
			System.out.println();
			w = 0;
			h++;
		}
	}
}
