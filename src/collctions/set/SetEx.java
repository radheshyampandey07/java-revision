package collctions.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {

		Set<Integer> numbers = new HashSet<Integer>();

		numbers.add(2);
		numbers.add(34);
		numbers.add(4);
		numbers.add(null);
		numbers.add(null);
		numbers.add(2);
		numbers.add(21);

		System.out.println(numbers);
		
		Set<String> names = new LinkedHashSet<String>();
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		names.add("E");
		names.add(null);

		System.out.println(names);

	}

}
