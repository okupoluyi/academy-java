package com.bptn.course._06_oop;

class SalesDepartment extends Department {

	private double totalSalesAmount;

	public SalesDepartment(String accounting, int numberOfEmployees, double totalSalesAmount) {
		super(accounting, numberOfEmployees);
		this.totalSalesAmount = totalSalesAmount;
	
		// TODO Auto-generated constructor stub
	}

}
