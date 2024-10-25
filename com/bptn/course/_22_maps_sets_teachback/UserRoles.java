package com.bptn.course._22_maps_sets_teachback;

import java.util.ArrayList;

public class UserRoles {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(8);
		nums.add(10);
		nums.add(2);

		int val1 = 0;
		int val2 = 5;

		boolean isEqual = (!nums.get(val1).equals(nums.get(val2)));
		System.out.println(isEqual);

		/*
		 * // HashMap Initialization Map<String, Set<String>> userRolesMap = new
		 * HashMap<>();
		 * 
		 * // The addRole method is called multiple times to assign roles to users
		 * addRole(userRolesMap, "Olu", "Lead Programmer"); addRole(userRolesMap,
		 * "Happiness", "Senior Software Developer"); addRole(userRolesMap, "Kyra",
		 * "Senior Quality Engineer"); addRole(userRolesMap, "Olu",
		 * "Senior Quality Engineer");
		 * 
		 * System.out.println("User Roles: " + userRolesMap); }
		 * 
		 * private static void addRole(Map<String, Set<String>> map, String user, String
		 * role) { // This method checks if the user exists in the map, if not
		 * initialize a new // HashSet for that user map.computeIfAbsent(user, k -> new
		 * HashSet<>()).add(role);
		 * 
		 */
	}

}
