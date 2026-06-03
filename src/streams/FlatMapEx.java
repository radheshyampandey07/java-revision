package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FlatMapEx {

	public static void main(String[] args) {

		List<Integer> number1 = List.of(1, 2, 3);
		List<Integer> number2 = List.of(4, 12, 13);
		List<Integer> number3 = List.of(19, 25, 32);

		List<List<Integer>> num4 = List.of(number1, number2, number3);

		List<Integer> list = num4.stream().flatMap(List::stream)
								.sorted((a, b) -> (b-a)).toList();

		System.out.println(list);

		List<List<String>> names = List.of(List.of("radhe", "shyam"), List.of("pandey", "Krisha"));

		Map<String, Long> collect2 = names.stream()
				.flatMap(List::stream)
				.flatMap(w -> Arrays.stream(w.split("")))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect2);
	}

}
