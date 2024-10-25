package com.bptn.course._16_array_list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// C ->
		ArrayList<String> groceries = new ArrayList<>();

		groceries.add("Milk");
		groceries.add("Bread");
		groceries.add("Egg");

		System.out.println("Grocery List: " + groceries);
		System.out.println(groceries.get(2));
		System.out.println(groceries.getLast());
		System.out.println(groceries.getFirst());

	}

}