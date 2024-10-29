package com.bptn.course.com.bptn.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileUtils {

//	public static void main(String[] args) {
//        // The main() method is implemented in part 2 of this exercise.
//    }
	private static final Path FILE_PATH = Paths.get("test.txt");

	// define isFileExist()
	public boolean isFileExist() {
		if (Files.exists(FILE_PATH)) {
			System.out.println("File exists!");
			return true;
		} else {
			System.out.println("File doesn't exist!");
			return false;
		}
	}

	// define isFileExistsWithExceptionHandling()
	public boolean isFileExistsWithExceptionHandling() {
		try {
			File file = new File(FILE_PATH.toUri());
			Scanner scanner = new Scanner(file);
			scanner.nextLine(); // Read the first line to ensure file can be accessed
			System.out.println("File exists!");
			scanner.close();
			return true;
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist!");
			return false;
		}
	}

	// define createFileIfNotExist()
	public boolean createFileIfNotExist() {
		if (Files.exists(FILE_PATH)) {
			System.out.println("File already exists.");
			return true;
		} else {
			try {
				Files.createFile(FILE_PATH);
				System.out.println("File created successfully.");
				return true;
			} catch (IOException e) {
				System.out.println("An error occurred while creating the file: " + e.getMessage());
				return false;
			}
		}
	}
}
