package com.bptn.course._22_maps_sets_teachback;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) {
		String text = "Group 3 Team 5 Olu Happi Kyra Olu";
		// Splitting the text into words, the split method divides the string into an
		// array of words based on spaces.
		String[] words = text.split(" ");
		// Initialize the data structure
		// this will store each word as a key and its count as a value.
		Map<String, Integer> wordCountMap = new HashMap<>();
		// this will hold unique words from the text.
		Set<String> uniqueWords = new HashSet<>();
		// this would iterates through each word in the words array.
		for (String word : words) {
			// For each word it checks if its in the wordCountMap
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
			// Each word is added to the uniqueWords set, ensuring only unique entries are
			// stored.
			uniqueWords.add(word);
		}

		System.out.println("Word Count: " + wordCountMap);
		System.out.println("Unique Words: " + uniqueWords);
	}

}
