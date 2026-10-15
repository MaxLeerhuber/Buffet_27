/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("How many times do you want to print out your name?");
		int numoftime = sc.nextInt();
		int x = 0;
		while(x != numoftime){
			if(x == numoftime){
				break;
			}
			System.out.println(name);
			x = x + 1;
		} 


		
	}
}
