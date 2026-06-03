package streams;

import java.util.Arrays;
import java.util.List;

public class ArraysStream {

	public static void main(String[] args) {

		Integer[] ages = { 23, 34, 45, 12, 90, 2, 11, 14, 87, 63, 17, 38 };

		List<Integer> minor = Arrays.stream(ages).filter(x -> x < 18).toList();

		System.out.println(minor);

		List<Integer> sorted = Arrays.stream(ages).sorted((a, b) -> a - b).toList();

		System.out.println(sorted);
	}

}
