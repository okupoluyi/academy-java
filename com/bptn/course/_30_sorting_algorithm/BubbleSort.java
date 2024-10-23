package com.bptn.course._30_sorting_algorithm;

import java.util.Arrays;

public class BubbleSort {

	static void bubbleSort(int array[]) {
		int size = array.length;
		// loop for every array element
		for (int i = 0; i < size - 1; i++) {
			// loop for comparison
			for (int j = 0; j < size - 1; j++) {
				// Comparison - if value on left is greater than value on right, we swap
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] data = { 5, 3, -1, 7, 10, 2 };
		// Print the array before sorting using Arrays.toString()
		System.out.println("Before sort: " + Arrays.toString(data));

		// Call bubbleSort method to sort the array
		BubbleSort.bubbleSort(data);

		// Print the array after sorting
		System.out.println("After sort: " + Arrays.toString(data));
	}

}
