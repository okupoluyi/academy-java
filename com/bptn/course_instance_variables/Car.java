package com.bptn.course_instance_variables;

public class Car {

	// Declaring the variables
	String color;
	String brand;
	int price;

	// Creating constructor class and variables to pass in the user input
	public Car(String color, String brand, int price) {
		// Fill in the code for Step 4
		this.color = color;
		this.brand = brand;
		this.price = price;
	}

	// method to call print method
	void printCarDetails() {
		this.print();
	}

	// method to print put color, brand and price
	// Fill in the code
	void print() {
		System.out.println("Car{" + "color='" + color + '\'' + ", brand='" + brand + '\'' + ", price=" + price + '}');

	}
}
/*
 * This program is to create a class called Car and a main method to call
 * methods in Car class Car class has a constructor, method to call a print
 * method and the last method to print out the car color, brand and price. In
 * the main method, we created a class to call the print method from Car And it
 * prints it out
 */