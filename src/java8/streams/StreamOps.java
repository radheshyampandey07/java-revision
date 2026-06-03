package java8.streams;

import java.util.*;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOps {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Blueberry", "Melon", "Apricot", "Orange",
				"Strawberry");

		Map<Integer, List<String>> byLenght = fruits.stream().collect(Collectors.groupingBy(String::length));

		System.out.println(byLenght);

		String str = "radhe shyam pandey";

		str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(s -> s.getValue() > 1).map(Map.Entry::getKey)
				.forEach(c -> System.out.print(c + ", "));
		System.out.println();

		System.out.println("1. Find duplicate elements from given list ...");

		List<Integer> list = Arrays.asList(10, 15, 8, 94, 25, 98, 98, 32, 10);

		Stream<Entry<Integer, Long>> filter = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(c -> c.getValue() > 1);

		filter.forEach(c -> System.out.print(c + ", "));
		System.out.println();

		System.out.println("2. Find the Second Highest Number ...");
		Integer n = list.stream().sorted((a, b) -> b - a).distinct().skip(1).findFirst().get();
		System.out.println(n);

		System.out.println("3. Partition a List of Integers into Even and Odd ...");
		Map<Boolean, List<Integer>> collect = list.stream()
				.collect(Collectors.partitioningBy(m -> m % 2 == 0));
		System.out.println("Even : " + collect.get(true));
		System.out.println("Odd  : " + collect.get(false));
		
		System.out.println("4. Find the Longest String in a List ...");
		
		 Entry<Integer, List<String>> sorted = fruits.stream()
		        .collect(Collectors.groupingBy(String::length))
		        .entrySet()
		        .stream()
		        .sorted(Map.Entry.<Integer, List<String>>comparingByKey().reversed())
		        .findFirst().get();
		        
				System.out.println(sorted);
				
		System.out.println("5. Concatenate a List of Strings with a Delimiter ...");
		String collect2 = fruits.stream().collect(Collectors.joining(", ", "[", "]"));
		
		System.out.println(collect2);
		
		
	}
}
