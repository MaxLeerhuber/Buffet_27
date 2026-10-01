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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter what you want to be: Wizard, Warrior, or a Rouge.");
		String role = sc.nextLine();
		String Wizard = "Wizard";
		String Warrior = "Warrior";
		String Rouge = "Rouge";
		String wizard = "wizard";
		String warrior = "warrior";
		String rouge = "rouge";
		if (role.equals(Wizard) || role.equals(wizard)){
			System.out.println("You are a Wizard.");
		}
		else if (role.equals(Warrior) || role.equals(warrior)){
			System.out.println("You are a Warrior.");
		}
		else if (role.equals(Rouge) || role.equals(rouge)){
			System.out.println("You are a Rouge.");
		}
		else{
			System.out.println("You are not a valid role. Rerun program.");
		}
			}
	}

