package com.bptn.course._05_strings;

public class StepToZero {

	public static int numberOfSteps(int num) {
		int steps = 0;

		// Fill in the code below based on the problem statement

		while (num > 0) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num -= 1;

			}
			steps++;
		}
		return steps;

	}

	public static void main(String[] args) {

		// Test 1
		int num = 123;
		int steps = numberOfSteps(num);
		System.out.println("Number of steps to reduce " + num + " to zero: " + steps);

		// Test 2
		num = 14;
		steps = numberOfSteps(num);
		System.out.println("Number of steps to reduce " + num + " to zero: " + steps);

	}

}
