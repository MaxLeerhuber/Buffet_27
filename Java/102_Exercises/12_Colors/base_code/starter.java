/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        int red = (int)(Math.random()*256);
        int green = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);
        System.out.println("The numbers picked are:" + red + "," + green + "," + blue);
        System.out.println("Normal Color:");
        getColor(red, green, blue);
        System.out.println("This is the complementary color:");
        int red2 = 255 - red;
        int green2 = 255 - green;
        int blue2 = 255 - blue;
        getColor(red2, green2, blue2);
        System.out.println("Your color in BRG format:");
        getColor(blue, red, green);
        System.out.println("Your color in GBR format:");
        getColor(green, blue, red);
        int reddark = (int)(Math.random()*129);
        int greendark = (int)(Math.random()*129);
        int bluedark = (int)(Math.random()*129);
        System.out.println("New colors but 0 - 128 range:" + reddark + "," + greendark + "," + bluedark);
        System.out.println("Your new color");
        getColor(reddark, greendark, bluedark);
        int redlight = (int)(Math.random()*129 + 128);
        int greenlight = (int)(Math.random()*129 + 128);
        int bluelight = (int)(Math.random()*129 + 128);
        System.out.println("New colors but 128 - 255 range:" + redlight + "," + greenlight + "," + bluelight);
        System.out.println("Your new color");
        getColor(redlight, greenlight, bluelight);
        int red3 = (int)(Math.random()*129);
        int green3 = (int)(Math.random()*129);
        int blue3 = (int)(Math.random()*129 + 128);
        System.out.println("New colors but blue is in 128 - 255 range:" + red3 + "," + green3 + "," + blue3);
        System.out.println("Your new color");
        getColor(red3, green3, blue3);
        System.out.println("Now the code will generate a random color with numbers larger than 255");
        int red4 = (int)(Math.random()*1000 + 256);
        int green4 = (int)(Math.random()*1000 + 256);
        int blue4 = (int)(Math.random()*1000 + 256);
        System.out.println("The numbers picked are:" + red4 + "," + green4 + "," + blue4);
        System.out.println("Your new color");
        getColor(red4, green4, blue4);
		

		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
