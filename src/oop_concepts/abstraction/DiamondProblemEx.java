package oop_concepts.abstraction;

interface A {

	public void printMessage();

	default void sayHello() {
		System.out.println("Hi Hello from interface A....");
	}
}

interface B {

	public void printMessage();

	default void sayHello() {
		System.out.println("Hi Hello from interface B ....");
	}
}

class C implements A, B {

	@Override
	public void printMessage() {
		System.out.println("hello.....");
	}

	@Override
	public void sayHello() {
		A.super.sayHello();
	}

}

public class DiamondProblemEx {

	public static void main(String[] args) {
		C c = new C();
		c.printMessage();
		c.sayHello();
	}

}
