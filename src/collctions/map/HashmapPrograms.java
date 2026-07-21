package collctions.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class HashmapPrograms {

	public static void main(String[] args) {

		Map<Integer, String> names = new HashMap<Integer, String>();
		names.put(12, "Priya");
		names.put(9, "Charan");
		names.put(8, "Ankit");
		names.put(2, "Shyam");
		names.put(1, "Radhe");
		System.out.println(names);

		Map<Integer, String> map = new HashMap<>();

		map.put(20, "A");
		map.put(5, "B");
		map.put(100, "C");
		map.put(3, "D");
		map.put(17, "E");

//		System.out.println(map);

//		System.out.println(map.values());

		Integer[] scores = { 3, 4, 5 };
		Integer[] scores1 = { 13, 48, 58 };
		Integer[] scores2 = { 33, 54, 75 };

		Map<Integer[], String> students = new HashMap<Integer[], String>();
		students.put(scores2, "Radhe");
		students.put(scores1, "Shyam");
		students.put(scores, "Gyan");

		Set<Integer[]> scoresSet = students.keySet();
//		System.out.println(scoresSet);
		for (Integer[] i : scoresSet) {
			for (Integer j : i) {
				System.out.println(j);
			}
		}

		List<Integer> list = scoresSet.stream().flatMap(Arrays::stream).toList();
		System.out.println(list);
	}

}
