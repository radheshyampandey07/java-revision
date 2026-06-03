package java8.comparable;

import java.util.*;

public class Student implements Comparable<Student> {

	private int rollNo;

	private String name;

	public static List<Student> getStudentList() {
		Student student1 = new Student(1, "Radhe");
		Student student2 = new Student(2, "Aman");
		Student student3 = new Student(3, "Rohit");
		Student student4 = new Student(4, "Priya");
		Student student5 = new Student(5, "Neha");
		Student student6 = new Student(6, "Karan");

		List<Student> studentList = new ArrayList();

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		return studentList;
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public int compareTo(Student o) {
//		return o.getRollNo() - this.rollNo;
//	}
	
	// sort by name
	@Override
	public int compareTo(Student o) {
//		return o.getName().compareTo(this.getName());
		return this.getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

}
