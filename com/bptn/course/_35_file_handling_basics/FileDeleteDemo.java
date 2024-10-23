package com.bptn.course._35_file_handling_basics;

import java.io.File;

public class FileDeleteDemo {

	public static void main(String[] args) {

		File file = new File("stduent.txt");

		if (file.delete()) {
			System.out.println("File Found! Deleting now!");
		} else {
			System.out.println("File not found");
		}

	}

}
