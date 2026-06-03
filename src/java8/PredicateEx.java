package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {

		Predicate<Integer> t = x -> x % 2 == 0000;

		System.out.println(t.test(200));

		List<Integer> salaries = Arrays.asList(292, 3001, 408, 100, 405, 23, 1);

		salaries.sort((a, b) -> b - a);
		System.out.println(salaries);

		List<Integer> filtered = salaries.stream().filter(t).toList();

		System.out.println(filtered);
	}

}
