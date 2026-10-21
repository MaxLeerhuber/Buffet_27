/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		int money = 100;
		System.out.println("Slot Machine Rules:");
		System.out.println("1. You have 100 dollars to start with.");
		System.out.println("2. Can't bet a number higher than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 nnumbers between 1 and 10.");
		System.out.println("   a. If all 3 numbers are the same, you win 3 times your bet.");
		System.out.println("   b. If 2 numbers are the same, you win 2 times your bet.");
		System.out.println("   c. If no numbers are the same, you lose your money.");
		System.out.println("---------------------------------------------------------------------");
	
		
		
		while(true){
			System.out.println("Would you like to play the slot machine? (y/n)");
		String play = sc.nextLine();
			
			if(play.equalsIgnoreCase("n") || play.equalsIgnoreCase("no")){
			System.out.println("ok");
			break;
			}
			
			
			
			else if(play.equalsIgnoreCase("y") || play.equalsIgnoreCase("yes")){
			System.out.println("You have $" + money);
			System.out.println("How much would you like to bet?");
			int bet = sc.nextInt();
			int num1 = (int)(Math.random() * 9) + 1;
			int num2 = (int)(Math.random() * 9) + 1;
			int num3 = (int)(Math.random() * 9) + 1;
			System.out.println("You rolled:");
			System.out.println("-------------");
			System.out.println("| " + num1 + " | " + num2 + " | " + num3 + " |");
			System.out.println("-------------");
			if(num1 == num2 && num2 == num3){
				System.out.println("You win 3 times your money!");
				money += (bet * 3);
			}
			else if(bet > money){
				System.out.println("You can't bet more than you have.");
				break;
			}
			else if(bet <= 0){
				System.out.println("You can't bet less than or equal to 0.");
				break;
			}
			else if (num1 == num2 || num1 == num3 || num2 == num3){
				System.out.println("You win 2 times your money!");
				money += (bet * 2);
			}
			
			else if(money <= 0){
				System.out.println("You have no money left to play.");
				break;
			}
			else if(num1 != num2 && num1 != num3 && num2 != num3){
				System.out.println("You lose your money.");
				money -= bet;
			}

			}
			}
			
		}
}


