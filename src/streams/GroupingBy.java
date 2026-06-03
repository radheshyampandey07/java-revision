package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ram","Shyam","Sita","Kajal","Guddu","Vikash","Shivay");
		
		Map<Integer, List<String>> lengthNames = names.stream()
				.collect(Collectors.groupingBy(String::length));
		
		System.out.println(lengthNames );
		
		List<String> list = names.stream().filter(a -> a.charAt(0) == 'S').toList();
		
		System.out.println(list);
		
		List<String> uppernames =names.stream().map( a -> a.toUpperCase()).toList();
		
		System.out.println(uppernames);
	}

}
