package java8.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparator<Student>  {

	int age;

	String name;

	String course;

	public Student() {
	}

	public Student(int age, String name, String course) {
		this.age = age;
		this.name = name;
		this.course = course;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	
	public int compare(Student o1, Student o2) {

		return o1.age - o2.age;
//		if (o1.getCourse().length() > o2.getCourse().length())
//			return 1;
//		else
//			return -1;
	}

	// Method to return list of students
	public static List<Student> getStudents() {

		List<Student> students = new ArrayList<>();

		students.add(new Student(21, "Rahul", "Java"));
		students.add(new Student(22, "Amit", "Spring Boot"));
		students.add(new Student(20, "Neha", "Microservices"));
		students.add(new Student(23, "Priya", "Docker"));
		students.add(new Student(24, "Karan", "AWS"));
		
		return students;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", course=" + course + "]";
	}

}
