package exceptions;

class Mathmatics {
	int x;

	void printDivision() throws ArithmeticException {
		x = 0;
		System.out.println(9 / x);
	}
}

public class ThrowsExample {

	public static void main(String[] args) {
		Mathmatics m1 = new Mathmatics();
		m1.printDivision();
	}

}
