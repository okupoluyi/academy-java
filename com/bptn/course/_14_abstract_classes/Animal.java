package com.bptn.course._14_abstract_classes;

public abstract class Animal {

	// Abstract Method
	public abstract void sound();

	// Concrete Method
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}

	class Cat extends Animal {
		public void sound() {
			System.out.println("Cat meows");
		}

	}
}

