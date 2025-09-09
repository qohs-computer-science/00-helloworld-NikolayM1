/*
 * TODO: Nikolay Merenko
 * TODO: September 9th, 2025
 * TODO: Period 6
 * TODO: A program that prompts the user to enter their first name, which then promptly greets the person whose name was entered.
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
