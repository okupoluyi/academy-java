package com.bptn.course._04_arrays;

public class InsertPosition {

	public static int searchInsert(int[] num, int target) {

		int n = num.length;
		for (int i = 0; i < n; i++)
			if (num[i] >= target) {
				return i;
			}
		return n;
	}

	public static void main(String[] args) {
		int num[] = { 1, 3, 5, 7, 9 }, target = 9;
		int num1[] = { 1, 3, 5, 6 }, target1 = 3;
		int num2[] = { 1, 3, 5, 6, 7 }, target2 = 7;

		System.out.println(searchInsert(num, target));
		System.out.println(searchInsert(num1, target1));
		System.out.println((searchInsert(num2, target2)));
	}

}
