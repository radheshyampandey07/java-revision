package inner_class.member_inner_class;

class School {

	String name;

	boolean isOpen;

	public School() {
		name = "IGNOU";
		this.isOpen = false;
	}

	void printName() {
		System.out.println(this.name);
	}

	class Student {

		void goSchool() {
			if (!isOpen) {
				System.out.println("Student is not going school.");
				isOpen = true;
			} else {
				System.out.println("Student is going school.");
			}
		}

		void dontGoSchool() {
			if (!isOpen) {
				System.out.println(name + " school is not open.");
			} else {
				System.out.println(name + " is open for admission.");

			}
		}

	}
}

public class SchoolStudent {

	public static void main(String[] args) {

		School s = new School();
		s.printName();

		School.Student sc = s.new Student();
		sc.goSchool();
		sc.dontGoSchool();

	}

}
