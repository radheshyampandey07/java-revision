package streams.list_stream;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name;

	private int rollNo;

	private int marks;

	private String course;

	public Student(String name, int rollNo, int marks, String course) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + ", course=" + course + "]";
	}

	public static List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();
		Student student1 = new Student("Radhe", 11, 89, "BCA");
		Student student2 = new Student("Aman", 22, 99, "MCA");
		Student student3 = new Student("Rohit", 12, 23, "BCA");
		Student student4 = new Student("Priya", 45, 89, "MCA");
		Student student5 = new Student("Neha", 15, 68, "MCA");
		Student student6 = new Student("Karan", 66, 75, "MCA");
		Student student7 = new Student("Shivam", 7, 89, "BCA");

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);

		return students;
	}

}
