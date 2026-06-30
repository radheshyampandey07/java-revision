package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringStreamEx {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Radhe", "Shyam", "Ram", "Sita", "Radha", "Mohan", "Gyan", "Amit", "Shyam",
				"Radhe");

		// 1. filter names with R
		List<String> filteredNames = names.stream().filter(n -> n.charAt(0) == 'R').toList();
		System.out.println(filteredNames);

		// 2. convert names to upper case
		List<String> uppercaseNames = names.stream().map(n -> n.toUpperCase()).toList();
		System.out.println(uppercaseNames);

		// 3. remove duplicate names
		List<String> uniqueNames = names.stream().distinct().toList();
		System.out.println(uniqueNames);

		// 4. sort names alphabetically

//		List<String> sortedNames = names.stream().sorted().toList();
		List<String> sortedNames = names.stream().sorted(Comparator.reverseOrder()).toList();

		System.out.println(sortedNames);

		// 5. Count Names Starting with "R"
		Long num = names.stream().filter(s -> s.startsWith("R")).count();
		System.out.println(num);
		
		// 6. 
				names.stream()
				.collect(Collectors.partitioningBy( c -> c.charAt(0) == 'R'))
				.entrySet()
				.stream()
				.forEach(s -> {
					System.out.println(s.getKey() + " : "+ s.getValue());
				});
			
		// 7. 
		
		
	}

}
