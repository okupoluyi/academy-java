package com.bptn.course._01_variables;

import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		// Creates object of scanner class
		Scanner scanner = new Scanner(System.in);
		// Declaration and initialization of the variables we would use
		int targetNumber = 23;
		int guess = 0;
		// Prints out the welcome message
		System.out.println("Welcome to Olu's number guessing game!!");
		System.out.println("Guess a number between 1 to 100(inclusive):");
		// while loop once the number is not guessed and stop when guessed
		while (guess != targetNumber) {
			// Prompt user to enter number
			System.out.print("Enter the number: ");
			// save the input into a variable
			guess = scanner.nextInt();
			System.out.println("targetNumber: " + targetNumber);
			System.out.println("guess " + guess);
			// if ese if statements to compare the guess number to the target number
			if (guess < 1 || guess > 100) {
				System.out.println("Please guess the number between 1 to 100(inclusive)");
			} else if (guess < targetNumber) {
				System.out.println("Too low! Try again.");
			} else if (guess > targetNumber) {
				System.out.println("Too high! Try again.");
			} else {
				System.out.println("Congratulations! You guessed the number correctly");
			}
		}
		// close out the scanner object to avoid memory leak
		scanner.close();
	}
}
/*
 * This program is to prompt user to guess a number between 1-100 (inclusive)
 * The target number is 23, the user keeps on guessing using a while loop until
 * the number is guessed correctly, we used if else if statements to compare the
 * guess number and target number and prints out if too low or tow high and
 * Congratulations if it is the right number
 */