package com.bptn.course._05_strings;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {

		// Create an object of scanner class
		Scanner scanner = new Scanner(System.in);
		// Tell user to enter the string word
		System.out.println("String word;");
		String wordToEncrypt = scanner.nextLine();
		// create am object of a class the helps with modifying succession of characters
		StringBuilder encryptedWord = new StringBuilder();
		// Encrypt the word entered by the user by using toCharArray() method to convert
		// a string to sequence of characters
		for (char c : wordToEncrypt.toCharArray()) {
			// Use Character.isLetter method to determine if the specified character, c in
			// this case is a letter
			if (Character.isLetter(c)) {
				// use .append to append the value to the sequence we want
				if (c == 'z') {
					// wrap letter to lowercase if its lowercase
					encryptedWord.append('a');
				} else if (c == 'Z') {
					// wrap letter to uppercase if its uppercase
					encryptedWord.append('A');
				} else {
					// it shifts the letter by one position
					encryptedWord.append((char) (c + 1));
				}
			} else {
				// Non-alphabetic characters remains unchanged
				encryptedWord.append(c);
			}
		}
		// Display the encrypted word
		System.out.println("Encrypted word: " + encryptedWord.toString());
		scanner.close();
	}
}
/*
 * This program is designed to tell user to entetr the word and encrypt it, it
 * shifts each letter of the word by one position in the alphabet, wrapping them
 * based on lowercase or uppercase, non alphebetic characters remains the same I
 * used StringBuilder class to modifying succession of characters I also used
 * toCharArray() method to convert a string to sequence of characters I used
 * Character.isLetter method to determine if the specified character I used
 * append method to append the value to the sequence I want
 */

