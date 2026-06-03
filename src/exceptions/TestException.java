package exceptions;

class Math {

	int x, y;

	Math(int x, int y) {
		this.x = x;
		this.y = y;

	}

	void division() {
		try {
			System.out.println("division of numbers is : " + x / y);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
            System.out.println("This block always executes unless program is terminated...");
        }

	}
}

public class TestException {

	public static void main(String[] args) {
		Math m = new Math(2, 0);

		m.division();
	}

}
