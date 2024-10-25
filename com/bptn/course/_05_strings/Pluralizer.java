package com.bptn.course._05_strings;

import java.util.Scanner;

public class Pluralizer {
	public static void main(String[] args) {
		// Create a scanner object class
		Scanner scanner = new Scanner(System.in);
		// Ask user to enter a non-negative number
		System.out.print("Enter a non-negative number: ");
		// Take in the number input from the user
		int amt = scanner.nextInt();
		// consume the new line
		scanner.nextLine();
		// Take in the noun input from user
		System.out.print("Enter a singular noun: ");
		String word = scanner.nextLine();

		// pluralize logic if statements
		// Declare a string for the pularized word
		String pluralWord;
		// if statements return singular noun
		if (amt == 1) {
			pluralWord = word;
		} else {
			// checks the string with endsWith() method for string that ends with fe
			if (word.endsWith("fe")) {
				// substring that helps get the portion of the string, take out the fe, the last
				// two letters and replace it with ves
				pluralWord = word.substring(0, word.length() - 2) + "ves";
				// substring helps get the portion of the string and replace y with ies
				// considering the last 2 letters are not vowels
			} else if (word.endsWith("y") && word.length() > 1 && !isVowel(word.charAt(word.length() - 2))) {
				pluralWord = word.substring(0, word.length() - 1) + "ies";
				// subsstring that checks for the portion of the string ending with sh and ch
				// and add es to the end of it
			} else if (word.endsWith("sh") || word.endsWith("ch")) {
				pluralWord = word + "es";
				// statement to replcase us in at the end of a noun to i
			} else if (word.endsWith("us")) {
				pluralWord = word.substring(0, word.length() - 2) + "i";
				// statement to check for noun that ends with ay,oy,ey and uy and add s to the
				// end
			} else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
				pluralWord = word + "s";
			} else {
				// for other nouns add s to the end by default
				pluralWord = word + "s";
			}
		}
		// This prints out the result to the console
		System.out.println("# in: " + amt);
		System.out.println("word: " + word);
		System.out.println(amt + " " + pluralWord);
		scanner.close();
	}

	/*
	 * The isVowel method checks if the provided character c is a vowel (a, e, i, o,
	 * u) by converting it to lowercase and checking its presence in the string
	 * "aeiou". It returns true if c is a vowel and false otherwise.
	 */
	private static boolean isVowel(char c) {
		return "aeiou".indexOf(Character.toLowerCase(c)) != -1;

	}
}
/*
 * This program is a pluralizer for noun that takes in a non-negative nuumber a
 * singular noun as string and prints out the plural from It takes into
 * consideration nouns that end with fe, y, sh,ch, us, ay,oy,ey and uy it adds s
 * as default if the rules don't apply The program uses methods like .length to
 * find the length of the string indexOf to find the index of the string
 * endsWith to get the characters the string ends with substring to extract a
 * portion of the string
 * 
 * Lesson learned from this program was the endWith method which made it easier
 */