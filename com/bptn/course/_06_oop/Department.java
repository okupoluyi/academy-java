package com.bptn.course._06_oop;

class Department {
	private String accounting;
	private int numberOfEmployees;

	public Department(String accounting, int numberOfEmployees) {
		this.accounting = accounting;
		this.numberOfEmployees = numberOfEmployees;
	}

	public void showDepartmentInformation() {
		System.out.println("Department Name: " + accounting);
		System.out.println("Number of Employees: " + numberOfEmployees);
	}
}
