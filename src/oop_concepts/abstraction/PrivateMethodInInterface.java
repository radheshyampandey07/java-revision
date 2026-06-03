package oop_concepts.abstraction;

interface AA {

	private void Hi() {
		System.out.println("Hi from private method of interface ...");
	}

	default void callPrivateMethod() {
		Hi();
	}
}

class AB implements AA {

}

public class PrivateMethodInInterface {

	public static void main(String[] args) {

		AB ab = new AB();
		ab.callPrivateMethod();
	}

}
