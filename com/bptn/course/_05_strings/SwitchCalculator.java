package com.bptn.course._05_strings;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		double billAmount = 0.0;
		System.out.println("Please choose an item from the list: ");
		System.out.println("1. Pizza - $12.99");
		System.out.println("2. Burger - $8.99");
		System.out.println("3. Pasta - $9.99");
		System.out.println("4. Salad - $6.99");
		System.out.println("5. Exit");
		choice = scanner.nextInt();
		 switch(choice) {
		 case 1: System.out.println("You ordered Pizza");
		    billAmount +=12.99;
		    break;
		 case 2: System.out.println("You ordered Burger");
		    billAmount +=8.99; 
		    break;
		  case 3: System.out.println("You ordered Pasta");
		    billAmount +=9.99;
		    break;
		  case 4: System.out.println("You ordered Salad");
		    billAmount +=6.99;
		    break;
		  case 5: if (billAmount >0) {
			  System.out.println("Thank you for ordering");
		  }
		 
		 }
			scanner.close();
		}
	}


