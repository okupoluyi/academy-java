package com.bptn.course._06_oop;

public class BankSystem {

	public static void main(String[] args) {


		BankAccount myAccount = new BankAccount("987654", 1200.00);
		myAccount.displayAccountInfo();

		BankAccount newMyAccount = new BankAccount("123765", 600.00);
		newMyAccount.displayAccountInfo();
		SavingsAccount mySavingsAccount = new SavingsAccount("Savings123", 100.00, 1.00);
		mySavingsAccount.applyInterest();
		mySavingsAccount.displayAccountInfo();

		CheckingAccount myCheckingAccount = new CheckingAccount("12345", 500.00, 300.00);
		myCheckingAccount.withdraw(300);
		myCheckingAccount.displayAccountInfo();

	}

}
