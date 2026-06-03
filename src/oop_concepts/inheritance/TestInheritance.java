package oop_concepts.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		Father father = new Father();
		
		father.age = 45;
		father.f_name = "ABC";
		father.property = "3BHK Home and a Alto 800 car";
		
		System.out.println(father.toString());
		father.pray();
		
		Father f = new FirstChild();
		f.age = 5;
		f.f_name = "abc";
		f.property = "school bag";
		System.out.println(f.toString());
		f.pray();
	}
}
