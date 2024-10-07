package com.bptn.course._16_array_list;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		int counter = 1;
		// Create a new array
		ArrayList<String> myBooks = new ArrayList<>();

		// Add 3 favorite books to the list
		myBooks.add("Hamlet".toLowerCase());
		myBooks.add("Things Fall Apart".toLowerCase());
		myBooks.add("Americana".toLowerCase());

		// Display all books
		System.out.println("My favorite books are: " + myBooks);

		for (String book : myBooks) {

			System.out.println("Book " + counter + ": " + book);
			counter++;
		}

		System.out.println(myBooks.getFirst());
		System.out.println(myBooks.getLast());
		System.out.println(myBooks.get(0));

		// Delete the second book
		myBooks.remove(1);
		System.out.println("My favorite books are: " + myBooks);

		// Search for a book
		if (myBooks.contains("Hamlet".toLowerCase())) {
			System.out.println("Book found");
		} else
			System.out.println("Book not found");

		System.out.println("The size of the list is: " + myBooks.size());
		System.out.println("The size of the list is: " + myBooks.get(myBooks.size() - 1));
	}


}
