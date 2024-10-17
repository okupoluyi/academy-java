package com.bptn.course._31_generics_demo;

public class GenericsDemo {

	public static <T extends Comparable<T>> T findMaxGeneric(T num1, T num2) {
		if (num1.compareTo(num2) > 0) {
			return num1;
		} else
			return num2;
	}

	public static int findMax(int num1, int num2) {
		return (num1 > num2) ? num1 : num2;
	}

	public static void main(String[] args) {

		System.out.println("Max of 10 and 20:  " + findMax(10, 20));
		System.out.println("Max of 10 and 20:  " + findMaxGeneric(10.90, 20.8));

	}

}
