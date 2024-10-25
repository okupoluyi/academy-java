package com.bptn.course._13_week_2_bigcoding_employee;

public class Employee {
	// Instance variable to store salary
	private int salary;
	private int hoursPerDay;

	// Instance variable to store hours per day worked by employee

	// Constructor to set instance variables(salary and hoursPerDay) value
	public Employee(int salary, int hoursPerDay) {
		setSalary(salary);
		setHoursPerDay(hoursPerDay);
	}

	// Set method to update salary
	public void setSalary(int salary) {
		if (salary < 500) {
			this.salary = salary + 10;
		} else {
			this.salary = salary;
		}
	}

	// Set method to update hoursPerDay
	public void setHoursPerDay(int hoursPerDay) {
		if (hoursPerDay > 6) {
			this.salary += 5;
		} else {
			this.hoursPerDay = hoursPerDay;
		}
	}

	// Get method to return salary
	public int getSalary() {
		return salary;
	}
}
