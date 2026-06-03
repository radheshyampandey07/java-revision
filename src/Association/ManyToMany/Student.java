package Association.ManyToMany;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String studentName;

	private List<Course> courses;

	public Student(String studentName) {

		this.studentName = studentName;

		this.courses = new ArrayList<Course>();
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
