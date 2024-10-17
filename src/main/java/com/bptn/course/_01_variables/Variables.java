package com.bptn.course._01_variables;

import java.util.ArrayList;
import java.util.List;

public class Variables {

	private List<Number> numbers;

	public Variables() {
		numbers = new ArrayList<>();
	}

	// Method to add integers to the list
	public void addNumber(Number number) {
		numbers.add(number);
	}

	// Method to sum the integers in the list
	public double sum() {
		double total = 0.0;
		// Using a for-loop to sum the numbers
		for (Number number : numbers) {
			total += number.doubleValue();
		}
		return total;
	}

	public static void main(String[] args) {
		Variables integerList = new Variables();

		// Populating the list with some integers
		integerList.addNumber(10);
		integerList.addNumber(20);
		integerList.addNumber(30);
		integerList.addNumber(40);

		// Calculating and printing the sum
		System.out.println("The sum of the numbers is: " + integerList.sum());

		Variables doubleList = new Variables();

		// Populating the list with mixed numbers
		doubleList.addNumber(10);
		doubleList.addNumber(20.4);
		doubleList.addNumber(30.0f);
		doubleList.addNumber(40.5);

		// Calculating and printing the sum
		System.out.println("The sum of the numbers is: " + doubleList.sum());

	}
}
