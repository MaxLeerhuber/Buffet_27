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
		System.out.println("What is your name? ");
		String name = sc.nextLine();
		System.out.println("What is your character title?");
		String title = sc.nextLine();
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
		int totalPoints = 20;
		System.out.println("Now you can choose your traits you have 20 points you can spend(Maximum of 10 points per trait).");
		System.out.println("Strength: ");
		int strength = sc.nextInt();
		if (strength > 10){
			System.out.println("You cannot spend more than 10 points on a trait. Rerun program.");
		}
		else if (strength < 0){
			System.out.println("You cannot spend less than 0 points on a trait. Rerun program.");
		}
		else{
			System.out.println("Dexterity: ");}
		totalPoints = totalPoints - strength;
		System.out.println("You have " + totalPoints + " points left to spend on your traits.");
		int dexterity = sc.nextInt();
		if (dexterity > 10){
			System.out.println("You cannot spend more than 10 points on a trait. Rerun program.");
		}
		else if (dexterity < 0){
			System.out.println("You cannot spend less than 0 points on a trait. Rerun program.");
		}
		else{
			System.out.println("Intelligence: ");}
		totalPoints = totalPoints - dexterity;
		System.out.println("You have " + totalPoints + " points left to spend on your traits.");
		int intelligence = sc.nextInt();
		if (intelligence > 10){
			System.out.println("You cannot spend more than 10 points on a trait. Rerun program.");
		}
		else if(totalPoints < 0){
			System.out.println("You cannot spend more than 20 points on your traits. Rerun program.");
		}
		else if (intelligence < 0){
			System.out.println("You cannot spend less than 0 points on a trait. Rerun program.");
		}
		else{
			System.out.println("Charisma: ");}
		totalPoints = totalPoints - intelligence;
		System.out.println("You have " + totalPoints + " points left to spend on your traits.");
		int charisma = sc.nextInt();
		if (charisma > 10){
			System.out.println("You cannot spend more than 10 points on a trait. Rerun program.");
		}
		else if (totalPoints < 0){
			System.out.println("You cannot spend more than 20 points on your traits. Rerun program.");
		}
		else if (charisma < 0){
			System.out.println("You cannot spend less than 0 points on a trait. Rerun program.");
		}
		else{
			System.out.println("You have spent " + (strength + dexterity + intelligence + charisma) + " points on your traits.");
		}
		System.out.println("You have " + totalPoints + " points leftover.");
		System.out.println("Your name is " + name + ", Your character's title is " + title + ", Your role is " + role);
		System.out.println("You have spent " + strength + " points on Strength, " + dexterity + " points on Dexterity, " + intelligence + " points on Intelligence, and " + charisma + " points on Charisma.");
	}
}
