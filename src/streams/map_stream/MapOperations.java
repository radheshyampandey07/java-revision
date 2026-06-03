package streams.map_stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOperations {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "Radhe");
		map.put(32, "Bob");
		map.put(43, "Charlie");
		map.put(46, "Diana");
		map.put(55, "Ethan");
		map.put(28, "Hannah");
		map.put(99, "Ian");
		map.put(10, "Julia");
		System.out.println("all map data : " + map);
		
		map.entrySet().stream().forEach(System.out::println);
		
		Map<Integer, String> sorted = map.entrySet().stream()
			.sorted(Map.Entry.comparingByKey())
			.collect(Collectors
					.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
			
			System.out.println(sorted);
			

			Map<String, Integer> items = new HashMap<>();
			items.put("Laptop", 1200);
			items.put("Mouse", 25);
			items.put("Monitor", 300);
			items.put("Cable", 250);
			items.put("USB", 12);
			
			// Filter: Price > 100 AND Key doesn't start with 'M'
			
			Map<String, Integer> collect = items.entrySet()
				.stream()
				.filter(x -> x.getValue()> 100 && x.getKey().charAt(0) !='M')
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
			
			System.out.println(collect);
			
			
			List<String> names = items.entrySet()
			.stream()
			.map(Map.Entry::getKey)
			.map(String::toUpperCase)
			.toList();
			
			System.out.println(names);
			
			String str = "Radhe shyam pandeyr";
			
			Map<Character, Long> collect2 = str.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
			
			System.out.println(collect2);
		
	}

}
