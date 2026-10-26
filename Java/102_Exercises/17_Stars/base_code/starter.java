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
		System.out.println("----------------------------");
		System.out.println("Now enter an integer: ");
		int num = sc.nextInt();
		int i = 0;
		String stars = "*";
		while (i != num){
			System.out.println(stars);
			i++;
			stars = stars + "*";

		}
		System.out.println("----------------------------");
		System.out.println("Now enter another integer: ");
		int num2 = sc.nextInt();
		int i2 = 0;
		int i3 = 0;
		String stars2 = "*";
		String space = "";
		while (i2 != num2){
			while (i3 != num2 - i2){
				space = space + " ";
				i3++;
			}
			System.out.println(space + stars2);
			i2++;
			stars2 = stars2 + "*";
			space = "";
			i3 = 0;

		}
		
	}
}
