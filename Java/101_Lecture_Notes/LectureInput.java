/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Your Code Goes here!
        System.out.println("Welcome to Max's restraunt");
        System.out.println("Menu:");


        System.out.println("1. Burger - $2");
        int burgerprice = 2;
        

        System.out.println("2. Fries - $1");
        int friesprice = 1;


        System.out.println("3. Soda - $.5");
        double sodaprice = 0.5;


        System.out.println("What is your name for the order?");
        String name = sc.nextLine();


        System.out.println("How much burgers do you want?");
        int burgerquant = sc.nextInt();


        System.out.println("How much fries do you want?");
        int friesquant = sc.nextInt();


        System.out.println("How much drinks do you want?");
        double sodaquant = sc.nextDouble();


        double total = (burgerquant * burgerprice) + (friesquant * friesprice) + (sodaquant * sodaprice);
        System.out.println("Your order comes out to $" + total);


        System.out.println("How much do you want to tip? - percentage");
        double tip = sc.nextDouble();

        System.out.println("Thank you for your order " + name);
        System.out.println("Your total comes out to $" + (total * (tip / 100 + 1)));
	}
}
