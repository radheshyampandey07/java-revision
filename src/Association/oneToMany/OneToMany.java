package Association.oneToMany;

public class OneToMany {

	public static void main(String[] args) {

		Student st1 = new Student("Radhe");
		Student st2 = new Student("Shyam");
		Student st3 = new Student("Anita");
		Student st4 = new Student("Anu");
		Student st5 = new Student("Kiran");

		Teacher teacher = new Teacher("Jaskirat");
		teacher.addStudent(st5);
		teacher.addStudent(st4);
		teacher.addStudent(st2);
		teacher.addStudent(st3);
		teacher.addStudent(st1);

		st1.setTeacher(teacher);

//		System.out.println(teacher);
		System.out.println("Teacher name : " + teacher.getTeacherName());
		for (Student s : teacher.getStudents()) {
			System.out.println(s.getStudentName());
		}

		System.out.println("my teacher name is : " + st1.getTeacher().getTeacherName());
	}

}
