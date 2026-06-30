package streams;

import java.util.stream.IntStream;

public class ParallelStream {

	public static void main(String[] args) {

		long start = 0, end = 0;

		start = System.currentTimeMillis();
		IntStream.range(0, 100).forEach(System.out::println);
		end = System.currentTimeMillis();

		System.out.println("time taken : " + (end - start));
		System.out.println("--------------------------------------");

		start = 0;
		end = 0;
		start = System.currentTimeMillis();
		IntStream.range(0, 100).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();

		System.out.println("time taken : " + (end - start));
		
	}

}
