package static_examples;

class College {

	static String name = "ABC";
}

class School {

	static School school = new School();

	String name = "MVS publc school";

	private School() {

	}

	public static School getObject() {
		return school;
	}
}

public class SingeltonPatternStatic {

	public static void main(String[] args) {
		School school = School.getObject();
		System.out.println(school.name);
		System.out.println(school.hashCode());

		School school2 = School.getObject();
		System.out.println(school2.name);
		System.out.println(school2.hashCode());
		
		System.out.println("-----------------------------------------------");
		
		College c = new College();
		System.out.println(c.hashCode());

		College c1 = new College();
		System.out.println(c1.hashCode());

	}

}
