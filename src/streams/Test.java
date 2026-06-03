package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		String str = "radhe shyam pandey is a very nice person";

		Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect);

		 Map<Character, Long> collect2 = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));

		System.out.println(collect2);

	}

}
