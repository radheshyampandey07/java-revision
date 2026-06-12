package collctions.map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TreeMapEx {

	public static void main(String[] args) {

		// tree map is naturally sorted based on key

		Map<Integer, String> students = new TreeMap<Integer, String>();
		students.put(19, "Radhe");
		students.put(29, "Gyan");
		students.put(36, "Radhe");
		students.put(79, "Shyam");
		students.put(10, "Ankit");
		students.put(21, "Shyam");
		students.put(13, "Shivam");
		students.put(43, "Ishan");

		System.out.println("all students : " + students);

		Map<Integer, String> sorted = students.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(
						Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println("sorted by values " + sorted);

		// group by value

		students.entrySet().stream()
				.collect(Collectors.groupingBy(Map.Entry::getValue,
						Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
				.forEach((name, ids) -> System.out.println(name + " -> " + ids));
	}

}
