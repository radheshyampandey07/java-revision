package streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {

	public static void main(String[] args) {

		Map<String, Integer> fruits = new HashMap<String, Integer>();

		fruits.put("Mango", 10);
		fruits.put("Banana", 15);
		fruits.put("Orange", 20);
		fruits.put("Watermelon", 25);
		fruits.put("Kiwi", 30);

		// sort map based on value in ascending and descending

		Map<String, Integer> ascsortedfruits = fruits.entrySet()
												.stream()
												.sorted(Map.Entry.comparingByValue())
												.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1 - e2, LinkedHashMap::new));

		System.out.println(ascsortedfruits);

		Map<String, Integer> descSortedfruits = fruits.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1 - e2, LinkedHashMap::new));

		System.out.println(descSortedfruits);

	}

}
