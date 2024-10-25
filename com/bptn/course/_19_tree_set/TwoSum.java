package com.bptn.course._19_tree_set;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> numMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int complement = target - nums[i];

			if (numMap.containsKey(complement)) {

				return new int[] { numMap.get(complement), i };
			}

			numMap.put(nums[i], i);
		}

		return new int[] {};
	}

	public static void main(String[] args) {
		int[] nums = { 11, 7, 2, 15 };
		int target = 9;

		int[] result = twoSum(nums, target);
		System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
	}

}
