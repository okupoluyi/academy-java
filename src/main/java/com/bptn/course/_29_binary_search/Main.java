package com.bptn.course._29_binary_search;

import java.util.Arrays;

public class Main {

	public void Start() {

		int[] array = { 3, 6, 1, 4, 2, 9, 7, 8, 5, 0 };
		int key = 1;

		Arrays.sort(array);

		// sort array
		int result = binarySearch(array, key);

		// Print values in array after sort
		System.out.println(result);

	}

	int binarySearch(int arr[], int key) {
		// put your code here.
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] < key) {
				left = mid + 1;
			} else
				right = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.Start();
	}

}
