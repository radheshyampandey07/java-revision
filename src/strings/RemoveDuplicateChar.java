package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		/*
		 * Input: programming
		 * 
		 * Output:progamin
		 */
		String str = "programming";

		List<Character> distinct = str.chars().mapToObj(c -> (char) c).distinct().toList();
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(distinct);
//		List<Character> list = collect.entrySet()
//				.stream()
//				.filter(c -> c.getValue() > 1)
//				.map(Map.Entry::getKey)
//				.toList();
//
//		System.out.println(list);
		
	}

}
