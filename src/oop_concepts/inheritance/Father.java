package oop_concepts.inheritance;

public class Father {

	String f_name;

	int age;

	String property;
	
	public void pray() {
		System.out.println("father is praying");
	}

	@Override
	public String toString() {
		return "Father [f_name=" + f_name + ", age=" + age + ", property=" + property + "]";
	}

	
}
