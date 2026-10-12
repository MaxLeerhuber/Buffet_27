/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("You will now choose which exhibit you want to enter");
	System.out.println("1. Plant Exhibit");
	System.out.println("2. Food Exhibit");
	System.out.println("3. Building Exhibit");
	String exhibit = sc.nextLine();
	if (exhibit.equals("building") || exhibit.equals("Building")){
			System.out.println("What art piece do you want to select?");
			System.out.println("1. House");
			System.out.println("2. Castle");
			String buildingchoice = sc.nextLine();
	
			if(buildingchoice.equals("house") || buildingchoice.equals("House")){
				System.out.println("You have selected the House.");
				System.out.println("  ____||____");
				System.out.println(" ///////////");
				System.out.println(" ///////////");
				System.out.println("|    _    |  |");
				System.out.println("|[] | | []|  |");
				System.out.println("|   | |   |  |");
			}if(buildingchoice.equals("castle") || buildingchoice.equals("Castle")){
				System.out.println("You have selected the Castle.");
				System.out.println(" _   |~  _");
				System.out.println("[_]--'--[_]");
				System.out.println("|'|''`''|'|");
				System.out.println("| |  ^  | |");
				System.out.println("|_|_|I|_|_|");
			}
			else {
				System.out.println("You have not selected a valid option.");
			}
	}


	
	if(exhibit.equals("food") || exhibit.equals("Food")){
		System.out.println("What art piece do you want to select?");
			System.out.println("1. Pizza");
			System.out.println("2. Ice Cream");
			String foodchoice = sc.nextLine();
			if(foodchoice.equals("pizza") || foodchoice.equals("Pizza")){
				System.out.println("You have selected the Pizza.");
				System.out.println("// ''--.._");
				System.out.println("||  (_)  _ ._");
				System.out.println("||      _ (_)'-.");
				System.out.println("||   (_)   __..-'");
				System.out.println(" //___..--''  ");
			}
				if(foodchoice.equals("ice cream") || foodchoice.equals("Ice Cream")){
					System.out.println("You have selected the Ice Cream.");
					System.out.println("   .-'`'-. ");
					System.out.println("  /_______//");
					System.out.println(" |_________//");
					System.out.println(" //________//");
					System.out.println("  '--------' ");
					System.out.println("    /////  ");
					System.out.println("    ///      ");
					System.out.println("    /       ");
				}
	
else {
System.out.println("You have not selected a valid option.");
}
	}
	
				
			



	
	if(exhibit.equals("plant") || exhibit.equals("Plant")){
		System.out.println("What art piece do you want to select?");
		System.out.println("1. Dandelion");
		System.out.println("2. Leaf");
		String plantchoice = sc.nextLine();
		if(plantchoice.equals("dandelion") || plantchoice.equals("Dandelion")){
			System.out.println("You have selected the Dandelion.");
			System.out.println("  .--.");
			System.out.println(".'_||_'.");
			System.out.println("'. || .'");
			System.out.println("  '||'");
			System.out.println("   || //");
			System.out.println("// ||//|");
			System.out.println("(/ ||/");
			System.out.println(" __||/__");
		}
		
		else if(plantchoice.equals("leaf") || plantchoice.equals("Leaf")){
			System.out.println("You have selected the Leaf.");
			System.out.println("   | ");
			System.out.println(" .'|'. ");
			System.out.println("/.'| //");
			System.out.println("| /|'.|");
			System.out.println(" | | | ");
			System.out.println("   |");
		}
		
	
else {
System.out.println("You have not selected a valid option.");
}
	}
else {
	System.out.println("You have not selected a valid option.");
	}
System.out.println("Thank you for visiting the exhibit!");
	}
}