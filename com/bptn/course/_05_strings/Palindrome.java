package com.bptn.course._05_strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		// Creating an option of Scanner class to take in input
		Scanner scanner = new Scanner(System.in);
		// Declare the variables to be used
		String firstWord, secondWord;
		int optionSelected;
		String reverseInput = "";
		int continueLoop = 1;
		do {
			// Print out the string Menu
			System.out.println("/...String Menu...");
			System.out.println("Press 1 for Palindrome Check");
			System.out.println("Press 2 to reverse a String");
			System.out.println("Press 3 to Concatenate two Strings");
			System.out.println("Press 4 for String Comparison");
			System.out.println("Press 5 to Calculate the Length of String");
			System.out.println("Enter the option: ");
			// Take in the option selected from the user
			optionSelected = scanner.nextInt();
			scanner.nextLine();
			// Switch statement to perform the tasks
			switch (optionSelected) {
			case 1:
				System.out.println("Palindrome Check");
				System.out.println("Enter the string to check for palindrome: ");
				// This stores the string that the user entered to the object scanner
				firstWord = scanner.nextLine();
				// This initializes the string that will check the characters of the string the
				// user enters

				// This is a for loop that checks the lenght of the string and go backwards from
				// the last character to the first
				for (int i = firstWord.length() - 1; i >= 0; i--) {
					reverseInput += firstWord.charAt(i);
				}
				// This if else statement compares both strings input and reverseinput all in
				// lower case to make sure it matches, if does print the input string is
				// palindrome
				// else print input is not palidrome
				if (firstWord.toLowerCase().equals(reverseInput.toLowerCase())) {
					System.out.println("Input string is palindrome");
				} else {
					System.out.println("Input string is not palindrome");
				}
				// print out statement to continue the loop
				System.out.println("To continue String Menu Press 1, else press any other number to exit");
				continueLoop = scanner.nextInt();
				break;
			case 2:
				System.out.println("Reverse a string");
				// Take in string input from user
				System.out.println("Enter the string to reverse");
				// stores the input to firstWord
				firstWord = scanner.nextLine();

				// Reverse the string
				for (int i = firstWord.length() - 1; i >= 0; i--) {
					reverseInput += firstWord.charAt(i);
				}
				// Prints out the string and the reverse word
				System.out.println("Original String is: " + firstWord);
				System.out.println("Reversed String is: " + reverseInput);
				// print out statement to continue the loop
				System.out.println("To continue String Menu Press 1, else press any other number to exit");
				continueLoop = scanner.nextInt();
				break;
			case 3:
				System.out.println("String Concatenation");
				// Solution to concatenate two strings
				System.out.println("Enter First string: ");
				firstWord = scanner.nextLine();
				System.out.println("Enter Second string: ");
				secondWord = scanner.nextLine();

				System.out.println(
						"Concatenation of " + firstWord + " and " + secondWord + " is " + firstWord + secondWord);
				// print out statement to continue the loop
				System.out.println("To continue String Menu Press 1, else press any other number to exit");
				continueLoop = scanner.nextInt();
				break;
			case 4:
				System.out.println("String Comparison");
				// Take in string input from user
				System.out.println("Enter first string");
				// stores the input to firstWord
				firstWord = scanner.nextLine();
				System.out.println("Enter second string");
				// stores the input to secondWord
				secondWord = scanner.nextLine();
				// Compare string
				if (firstWord.toLowerCase().equals(secondWord.toLowerCase())) {
					System.out.println("The entered strings are equal");
				} else {
					System.out.println("The entered strings are not equal");
				}
				System.out.println("To continue String Menu Press 1, else press any other number to exit");
				continueLoop = scanner.nextInt();
				break;
			case 5:
				System.out.println("Lenght of a string");
				// Take in string input from user
				System.out.println("Enter a string:");
				// stores the input to firstWord
				firstWord = scanner.nextLine();
				System.out.println("The length of the entered string is: " + firstWord.length() + ".");
				System.out.println("To continue String Menu Press 1, else press any other number to exit");
				continueLoop = scanner.nextInt();
				break;

			default:
				System.out.println("Invalid choice! Please make a valid choice.");
				System.out.println("To continue String Menu Press 1, else press any other number to exit");
				continueLoop = scanner.nextInt();
				break;
			}
		} while (continueLoop == 1);
		scanner.close();
	}

}
/*
 * This code is a string menu checking for Palindrome, reversing a string,
 * concatenanting two strings, String comparison and the length of a string The
 * issue I experienced was codio was failing me for 2 things and I don't know
 * what, my code runs in eclipse and even runs in codio without issues
 */
