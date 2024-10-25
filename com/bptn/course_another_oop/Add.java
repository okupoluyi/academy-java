package com.bptn.course_another_oop;

public class Add {
	// Declared all the class variables to be used
	private int firstNumber;
	private int secondNumber;
	private int thirdNumber;
	private double firstDoubleNumber;
	private double secondDoubleNumber;

	// Creates first method to add 2 integers, add the numbers and return it
	public int add(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		return this.firstNumber + this.secondNumber;
	}

	// Creates second method to add 3 integers, add the numbers and return it
	public int add(int firstNumber, int secondNumber, int thirdNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
		return this.firstNumber + this.secondNumber + this.thirdNumber;
	}

	// Creates third method to add 2 doubles, add the numbers and return it
	public double add(double firstDoubleNumber, double secondDoubleNumber) {
		this.firstDoubleNumber = firstDoubleNumber;
		this.secondDoubleNumber = secondDoubleNumber;
		return this.firstDoubleNumber + this.secondDoubleNumber;
	}

	// Do not modify the code below. The code below gives you the idea of how the
	// different methods are called.
	public static void main(String args[]) {
		Add obj = new Add();
		System.out.println(obj.add(12, 21));
		System.out.println(obj.add(11, 23, 10));
		System.out.println(obj.add(100.10, 200.5));
	}

}
/*
 * This code is explaining the concept of method overloading by creating 3
 * methods to calculate sum of 2 integers, 3 integers and 2 double numbers and
 * return them with different arguements and the compiler finds the particular
 * method based on the variables Declared the type and where it is placed
 */