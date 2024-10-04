package com.bptn.course_10_super_classes;

public class Vehicle {

	// declare instance variables- colour and brand
	public String colour, brand;

	Vehicle() {
		this("Black", "Tesla");
	}


	// add parameterized constructor
	public Vehicle(String colour, String brand) {
		this.colour = colour;
		this.brand = brand;
	}

	// Do not modify this code as we have parameters that pass the test case

	public static void main(String[] args) {
		Car car = new Car("White", "Audi", "Chromecoloured");
		Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
		System.out.println(car.colour + " " + car.brand + " " + car.steeringWheel);
		System.out.println(bike.colour + " " + bike.brand + " " + bike.bikeHandle);

	}

}
