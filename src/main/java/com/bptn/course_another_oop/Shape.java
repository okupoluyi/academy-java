package com.bptn.course_another_oop;

class AnotherShape {

	void draw() {
		System.out.println("Drawing a shape");
	}
}

class Rectangle extends AnotherShape {
	@Override
	void draw() {
		System.out.println("Drawing a rectangle");
	}
}

class Circle extends AnotherShape {
	@Override
	void draw() {
		System.out.println("Drawing a circle");
	}
}

public class Shape {
	public static void main(String[] args) {
		AnotherShape s1 = new AnotherShape();
		AnotherShape s2 = new Rectangle();
		AnotherShape s3 = new Circle();

		s1.draw();
		s2.draw();
		s3.draw();
	}
}