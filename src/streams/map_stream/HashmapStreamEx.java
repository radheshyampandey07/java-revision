package streams.map_stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashmapStreamEx {

	public static void main(String[] args) {

		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(2, "Akash");
		students.put(8, "Ankit");
		students.put(71, "Akash");
		students.put(33, "Smriti");
		students.put(42, "Krisha");

		students.forEach((k, v) -> {
			System.out.println(k + " : " + v);
		});

		Map<String, List<Entry<Integer, String>>> collect = students.entrySet().stream()
				.collect(Collectors.groupingBy(a -> a.getValue()));

		System.out.println(collect);

		students.entrySet().stream()
//				.sorted(Comparator.comparingInt(z -> z.getKey()))
				.sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		LinkedHashMap<Integer, String> collect2 = students.entrySet().stream()
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2)->o1, LinkedHashMap::new));

		System.out.println(collect2);
		
	}

}
