package arrays;

public class TestArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 9, 8 };

		System.out.println("array length " + arr.length);

		for (int n : arr) {
			System.out.print(n + ", ");
		}
		System.out.println();

		// find max of array
		int m = 0;
		for (int n : arr) {
			if (n > m) {
				m = n;
			}
		}
		System.out.println(m);
	}

}
