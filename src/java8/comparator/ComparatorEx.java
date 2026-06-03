package java8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorEx {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(15);
		numbers.add(20);
		numbers.add(55);
		numbers.add(30);
		numbers.add(35);
		System.out.println("List data :" + numbers);
		Collections.sort(numbers, (a, b) -> b - a);
		System.out.println("List data sorted desc order :" + numbers);

		System.out.println("asc sorted order print : ");
		numbers.stream().sorted().forEach(System.out::println);

		System.out.println("desc sorted order print : ");
		numbers.stream().sorted((a, b) -> b - a).forEach(System.out::println);

		// ----------------------------------
		List<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Kiwi");
		fruits.add("Chickoo");
		fruits.add("Pomegranate");

		fruits.sort((a, b) -> b.length() - a.length());
		System.out.println("after desc order sorting based on length : " + fruits);

		// --------------------------------
		List<Student> studentsList = Student.getStudents();

		studentsList.sort(new Student());
		System.out.println(studentsList);

//		studentsList.stream().sorted().forEach(System.out::println);

	}

}
