package java8.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		nums.add(8);
		nums.add(12);
		nums.add(3);
		nums.add(98);
		nums.add(11);
		nums.add(32);

		System.out.println("sorted : " + nums);

		Collections.sort(nums);

		System.out.println(nums);
	}

}
