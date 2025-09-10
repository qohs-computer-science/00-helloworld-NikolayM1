/*
 * Nikolay Merenko
 * September 9th, 2025
 * Period 6
 * A program that greets the user by their inputted first name.
 */

import java.util.Scanner;

public class HelloWorld { //class begins
	public static void main(String[] args) { //method begins
		Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
		String firstName = in.nextLine();
		System.out.println("Hello," + firstName);
	} //method ends

} //class ends
