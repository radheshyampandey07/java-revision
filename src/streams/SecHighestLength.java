package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecHighestLength {

	public static void main(String[] args) {

		String str = "i am preparing for java interviews";
		
		String ans = Arrays.stream(str.split(" "))
						.sorted(Comparator.comparing(String::length).reversed())
						.skip(1)
						.findFirst()
						.get();
		
		System.out.println(ans);
		
		Map<Integer, List<String>> strlen = Arrays.stream(str.split(" "))
			.collect(Collectors.groupingBy(String::length));
		
		System.out.println(strlen);
		
		// find length of the second longest word
		
		Integer secstrlen = Arrays.stream(str.split(" "))
			.map(s -> s.length())
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst()
			.get();
		
		System.out.println(secstrlen);
		
		// find occurrences of every letter
		Map<String, Long> n=  Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		
		System.out.println(n);
				
	}

}
