package basic_java;

public class FundamentalOfPatterns {

	public static void main(String[] args) {

		int rows = 5, columns = 3;

		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= columns; j++) {

				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
