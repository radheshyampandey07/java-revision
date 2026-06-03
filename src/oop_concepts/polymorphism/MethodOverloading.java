package oop_concepts.polymorphism;

class Sqaure {

	int side;

	void area(int n) {
		side = n;
		System.out.println("area of square is  " + side * side);
	}

	void area(int n1, int n2) {
		System.out.println("area of square is  " + n1 * n2);

	}

}

public class MethodOverloading {

	public static void main(String[] args) {

		Sqaure s1 = new Sqaure();
		s1.area(5);
		s1.area(2, 2);

	}

}
