package collctions.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student {
	private int id;

	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(id), name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Student, Integer> studentsMap = new HashMap<Student, Integer>();
		Student s1 = new Student(1, "Radhe");
		Student s2 = new Student(2, "Shyam");
		Student s3 = new Student(1, "Radhe");
		studentsMap.put(s1, 90);
		studentsMap.put(s2, 45);
		studentsMap.put(s3, 99);

		System.out.println(studentsMap.size());
		System.out.println(studentsMap.get(s3));
		System.out.println(studentsMap.get(s1));

		StringBuilder sb = new StringBuilder("Radhe");

		Map<StringBuilder, Integer> studs = new HashMap<StringBuilder, Integer>();
		studs.put(sb, 22);

		System.out.println(studs.get("Radhe"));
		sb.append("shyam");
		System.out.println(studs);
	}

}
