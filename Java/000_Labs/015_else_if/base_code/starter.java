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
		System.out.println("Guess a number between 1 and 1000.");
		int x = (int)(Math.random()*1000 + 1);
		Scanner sc = new Scanner(System.in);
		int yournum = sc.nextInt();
		boolean equal = x==yournum;
		if(equal){
			System.out.println("You guessed the correct number!");
		}
		else if(yournum < x){
			System.out.println("Higher");
		}
		else{
			System.out.println("Lower");
		}
		System.out.println("Input a new number to see if you can guess the correct number.");
		int yournum2 = sc.nextInt();
		boolean equal2 = x==yournum2;
		if(equal2){
			System.out.println("You guessed the correct number!");
		}
		else if(yournum2 < x){
			System.out.println("Higher");
		}
		else{
			System.out.println("Lower");
		}
		System.out.println("Input a new number to see if you can guess the correct number.");
		int yournum3 = sc.nextInt();
		boolean equal3 = x==yournum3;
		if(equal3){
			System.out.println("You guessed the correct number!");
		}
		else if(yournum3 < x){
			System.out.println("Higher");
		}
		else{
			System.out.println("Lower");
		}
		System.out.println("Input a new number to see if you can guess the correct number.");
		int yournum4 = sc.nextInt();
		boolean equal4 = x==yournum4;
		if(equal4){
			System.out.println("You guessed the correct number!");
		}
		else if(yournum4 < x){
			System.out.println("Higher");
		}
		else{
			System.out.println("Lower");
		}
		System.out.println("Input a new number to see if you can guess the correct number.");
		int yournum5 = sc.nextInt();
		boolean equal5 = x==yournum5;
		if(equal5){
			System.out.println("You guessed the correct number!");
		}
		else if(yournum5 < x){
			System.out.println("Higher");
		}
		else{
			System.out.println("Lower");
		}
		System.out.println("Input a new number to see if you can guess the correct number.");
		int yournum6 = sc.nextInt();
		boolean equal6 = x==yournum6;
		if(equal6){
			System.out.println("You guessed the correct number!");
		}
		else if(yournum6 < x){
			System.out.println("Higher");
		}
		else{
			System.out.println("Lower");
		}
		System.out.println("Input a new number to see if you can guess the correct number.");
		int yournum7 = sc.nextInt();
		boolean equal7 = x==yournum7;
		if(equal7){
			System.out.println("You guessed the correct number!");
		}
		else if(yournum7 < x){
			System.out.println("Higher");
		}
		else{
			System.out.println("Lower");
		}
		System.out.println("Input a new number to see if you can guess the correct number.");
		int yournum8 = sc.nextInt();
		boolean equal8 = x==yournum8;
		if(equal8){
			System.out.println("You guessed the correct number!");
		}
		else if(yournum8 < x){

			System.out.println("Higher");
		}
		else{
			System.out.println("Lower");
		}
		System.out.println("Input a new number to see if you can guess the correct number.");
		int yournum9 = sc.nextInt();
		boolean equal9 = x==yournum9;
		if(equal9){
			System.out.println("You guessed the correct number!");
		}
		else if(yournum9 < x){
			System.out.println("Higher");
		}
		else{
			System.out.println("Lower");
		}
		System.out.println("Your last try to guess the number.");
		int yournum10 = sc.nextInt();
		boolean equal10 = x==yournum10;
		if(equal10){
			System.out.println("You guessed the correct number!");
		}
		else{
			System.out.println("You guessed the wrong number. Here is the correct number: " + x);
		}
	}
}
