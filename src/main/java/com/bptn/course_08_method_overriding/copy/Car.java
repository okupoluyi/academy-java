package com.bptn.course_08_method_overriding.copy;

public class Car extends Vehicle {
	// Step 2a: Declare String steeringWheel
	private String steeringWheel;

	// Step 2b: Define a parameterized constructor as per the specifications above
	public Car(String color, String brand, String steeringWheel) {
		super(color, brand);
		this.steeringWheel = steeringWheel;
	}

	// Step 2c: Create a print() method as per the specifications above
	@Override
	public void print() {
		System.out.println("I am Car");
	}

}
