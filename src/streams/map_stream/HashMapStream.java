package streams.map_stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapStream {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "Radhe");
		map.put(32, "Bob");
		map.put(43, "Charlie");
		map.put(46, "Diana");
		map.put(55, "Ethan");
		map.put(61, "Fiona");
		map.put(17, "George");
		map.put(28, "Hannah");
		map.put(99, "Ian");
		map.put(10, "Julia");
		System.out.println("all map data : " + map);

		System.out.println("........ascending sorting by key........");
		// sort by key Ascending
		map.entrySet().stream()
			.sorted(Map.Entry.comparingByKey())
			.forEach(System.out::print);

		System.out.println();

		System.out.println("........reverse order sorting by key........");
		// sort by key Descending
		map.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
			.forEach(System.out::print);
		System.out.println();

		System.out.println("........Sort Map by Value (Alphabetically).......");
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);


		// Linked HashMap (to maintain insertion order)
		Map<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		linkedMap.put(11, "Radhe");
		linkedMap.put(32, "Bob");
		linkedMap.put(43, "Charlie");
		linkedMap.put(46, "Diana");
		linkedMap.put(55, "Radhe");
//		Map<String, List<Entry<Integer, String>>> collect = linkedMap.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue));
//
//		System.out.println(collect);
		System.out.println("all linked map data (to maintain insertion order) : " + linkedMap);
		
		Map<String, List<Integer>> groupedByValue =
		        linkedMap.entrySet()
		                .stream()
		                .collect(Collectors.groupingBy(
		                        Map.Entry::getValue,
		                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
		                ));

		System.out.println(groupedByValue);

	}

}
