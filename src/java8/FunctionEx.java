package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {

		Function<String, Integer> function = f -> f.length();

		System.out.println(function.apply("Radhe shyam pandey"));

		Function<String, String> function2 = s -> s.substring(0, 3);

		System.out.println(function2.apply("Radhe shyam"));

		Function<List<Student>, List<Student>> filteredStud = student -> {
			List<Student> students = new ArrayList<Student>();

			for (Student s : student) {
				if (function2.apply(s.getName()).equals("Raj")) {
					students.add(s);
				}
			}
			return students;
		};

		List<Student> students = List.of(new Student(1, "Radhe Shyam", 30), new Student(2, "Rajesh Kumar", 25),
				new Student(3, "Rajnish Singh", 22), new Student(4, "Rahul Verma", 28),
				new Student(5, "Neha Sharma", 24), new Student(6, "Vikas Pandey", 27),
				new Student(7, "Anjali Gupta", 23), new Student(8, "Rajveer Sharma", 29),
				new Student(9, "Rajkumari Tiwari", 26), new Student(10, "Sandeep Yadav", 31));
		
		List<Student> filteredStudents = filteredStud.apply(students);
		
		filteredStudents.forEach(System.out::println);

	}

	public static class Student {

		private int id;

		private String name;

		private int age;

		public Student(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
		}

	}

}
