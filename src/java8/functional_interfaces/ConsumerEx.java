package java8.functional_interfaces;

import java.util.function.Consumer;
import java.util.function.Predicate;

class Student {

	String name;

	Student() {

	}

	void setName(String name) {
		this.name = name;
	}
}

public class ConsumerEx {

	public static void main(String[] args) {

		Consumer<Student> con = (n) -> {
			n.setName("my name is Bond");
			System.out.println(n.name);
		};

		Student s = new Student();
		con.accept(s);

		// predicate example
		Predicate<Student> st = (n) -> {
			n.setName("Bond");
			if (n.name.length() % 2 == 0) {
				return true;
			}
			return false;
		};
		Student s1 = new Student();
		System.out.println(st.test(s1));
		;
	}

}
