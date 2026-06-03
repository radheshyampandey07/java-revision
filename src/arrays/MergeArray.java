package arrays;

public class MergeArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 23, 45, 56 };
		int[] arr2 = { 11, 3, 25, 60 };
		int[] merged = new int[arr1.length + arr2.length];

		for (int i = 0; i < merged.length; i++) {
			if (i < arr1.length) {
				merged[i] = arr1[i];
			} else {
				merged[i] = arr2[i - arr1.length];
			}
		}

		for (int i : merged) {
			System.out.print(i + ", ");
		}

	}

}
