package com.bptn.course_10_super_classes;

public class Car extends Vehicle {
	// instance variable
	public String steeringWheel;

	// add parameterized constructor- use super keyword to call parent constructor
	public Car(String colour, String brand, String steeringWheel) {

		super(colour, brand);
		this.steeringWheel = steeringWheel;
	}

}
