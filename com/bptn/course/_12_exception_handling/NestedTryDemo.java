package com.bptn.course._12_exception_handling;

public class NestedTryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1234";
		int num = 0;

		// outer try for string to integer conversion
		try {
			int input = Integer.parseInt(str); // conversion of string to integer
			// inner try for division by zero
			try {
				int result = input / num;
			} catch (ArithmeticException e) {
				System.out.println("Error: Cannot divide by zero");
			}
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid input!");
		}
	}

}
