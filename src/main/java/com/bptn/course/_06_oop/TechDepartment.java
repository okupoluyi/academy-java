package com.bptn.course._06_oop;

class TechDepartment extends Department {

	private double totalPurchaseAmount;
	public TechDepartment(String accounting, int numberOfEmployees, double totalPurchaseAmount) {
		super(accounting, numberOfEmployees);
		this.totalPurchaseAmount = totalPurchaseAmount;
		// TODO Auto-generated constructor stub
	}
}
