package com.bptn.course_instance_variables;

public class Main {

	public static void main(String[] args) {
		// Creating isntances of the Car class and calling it
		Car car1 = new Car("white", "BMW", 70000);
		Car car2 = new Car("Red", "Audi", 80000);
		Car car3 = new Car("Grey", "Mercedez Benz", 90000);
		car1.printCarDetails();
		car2.printCarDetails();
		car3.printCarDetails();

	}

}
