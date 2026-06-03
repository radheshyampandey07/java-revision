package oop_concepts.polymorphism;

class Shape {
	void printArea(int n) {
		System.out.println(n*n);
		sayHi();
	}

	void sayHi() {
		System.out.println("Hi from Shape..");
	}
}

class Square extends Shape {

	void printArea(int n) {
		System.out.println("area of square is : " + n * n);
		sayHi();
	}

	void sayHi() {
		System.out.println("Hi from Square..");
	}

}

class Circle extends Shape {

	void printArea(int n) {
		System.out.println("area of circle is : " + 2 * 3.14 * n);

		sayHi();
	}

	void sayHi() {
		System.out.println("Hi from Circle..");

	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		Shape s1 = new Square();
		s1.printArea(5);

		Shape s2 = new Circle();
		s2.printArea(7);
		
		Shape s3 = new Shape();
		s3.printArea(9);

	}

}
