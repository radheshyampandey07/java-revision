package oop_concepts.abstraction;

abstract class Shape {

	String type = "shape";

	abstract void area(int n);

	public void sayHi() {
		System.out.println("say Hi from base class.");
	}
}

class Circle extends Shape {

	int side;

	String type = "circle";

	void area(int r) {
		System.out.println("area of circle is " + 2 * r * 3.14);
	}

	void getType() {
		System.out.println("type of shape is : " + super.type);
		System.out.println("type of current shape is : " + type);
	}

}

public class MyAbstractClass {
	public static void main(String[] args) {

		Shape s1 = new Circle();
		s1.area(6);
		s1.sayHi();

		Circle c1 = new Circle();
		c1.side = 9;
		c1.area(8);
		System.out.println("circle side is " + c1.side);
		c1.getType();

	}

}
