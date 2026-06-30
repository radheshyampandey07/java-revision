package collctions.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapBasics {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "Radhe");
		map.put(32, "Bob");
//		map.put(43, "Charlie");
//		map.put(46, "null");
//		map.put(55, "Ethan");
		map.put(null, "Fiona");
		map.put(17, "George");
		map.put(28, "null");
		map.put(99, "Ian");
		map.put(10, "Julia");
		System.out.println(map);

		System.out.println("check if roll no exist : " + map.get(28)); // if not found then null
		System.out.println("............");

		// get all key
		Set<Integer> keySet = map.keySet();
		System.out.println(" all keys : " + keySet);
		System.out.println("............");

		// replace
		map.replace(98, "ian");

		// print map
		System.out.println("all entries : ");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
//		System.out.println("............");

		// putIfAbsent will insert when given is not present in hashmap
//		map.putIfAbsent(5, null);
//		System.out.println(map);
		map.putIfAbsent(32, "Geeta");
//		System.out.println(map);
		System.out.println("............");

		// getOrDefault
		System.out.println(map.getOrDefault(2, "Not Found"));
		System.out.println("............");

		// check if that key exist in this map
		System.out.println("map contains this key : " + map.containsKey(99));
		System.out.println("............");
		
		System.out.println(map.remove(null));
	}

}
