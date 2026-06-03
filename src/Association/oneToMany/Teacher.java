package Association.oneToMany;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

	private String teacherName;

	private List<Student> students;

	public Teacher(String teacherName) {
		this.teacherName = teacherName;
		this.students = new ArrayList<Student>();
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", students=" + students + "]";
	}

}
