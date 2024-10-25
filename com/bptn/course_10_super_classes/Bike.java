package com.bptn.course_10_super_classes;

public class Bike extends Vehicle {
	// Declare an instance variable- String bikeHandle
	public String bikeHandle;

	// add parameterized constructor- use super keyword to call parent constructor
	public Bike(String colour, String brand, String bikeHandle) {
		super(colour, brand);
		this.bikeHandle = bikeHandle;
	}

}
