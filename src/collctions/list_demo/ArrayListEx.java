package collctions.list_demo;

import java.util.*;

class Student {
	int age;

	String name;

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

}

public class ArrayListEx {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "bb"));
		students.add(new Student(2, "aa"));
		students.add(new Student(13, "abc"));
		students.add(new Student(4, "dd"));
		students.add(new Student(5, "xyz"));

		System.out.println(students); // List maintains the order of insertion

		System.out.println(students.get(2)); // get method is used to get element at given index

		// insertion/deletion is fast in ArrayList
		students.set(1, new Student(2, "Radhe")); // set method is used to set the element at particular index

		// 
		
		System.out.println(students.get(3));;
		
		// sort arraylist
		List<Student> sortedlist = students.stream().sorted(Comparator.comparingInt(Student::getAge).reversed())
				.toList();

		System.out.println(sortedlist);

		List<Integer> nums = Arrays.asList(2, 22, 33, 1, 11, 10, 9, 71, 0, 100);
		List<Integer> sortedNums = nums.stream().sorted((a, b) -> b - a).toList();

		System.out.println(sortedNums);

	}

}
