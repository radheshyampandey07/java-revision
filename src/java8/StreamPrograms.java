package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPrograms {

	public static void main(String[] args) {

		String str = "there is tree and tree has leaves and leaves are green";

		// get the count of duplicate words


		Map<String, Long> duplicates = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(s -> s.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(duplicates);
	}

}
