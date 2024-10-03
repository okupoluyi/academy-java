package com.bptn.course_08_method_overriding.copy;

public class TestClass {

	public static void main(String[] args) {
		Car car = new Car("White", "Audi", "ChromeColored");
		car.print();

		Bike bike = new Bike("Grey", "Bianchi", "SilverColored");
		bike.print();

	}

}
