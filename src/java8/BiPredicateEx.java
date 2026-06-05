package java8;

import java.util.function.BiPredicate;

public class BiPredicateEx {

	public static void main(String[] args) {

		BiPredicate<String, Integer> checkLen = (s, i) -> s.length() == i;
		
		System.out.println(checkLen.test("radhe", 4));
		System.out.println(checkLen.test("shiv", 4));
	}

}
