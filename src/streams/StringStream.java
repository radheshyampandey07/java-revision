package streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStream {

	public static void main(String[] args) {

		String name = "Malyalam";

		Map<Character, Long> collect = name.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect);

		name.chars().mapToObj(c -> (char) c).sorted().forEach(System.out::println);

	}

}
