package design_patterns.singelton;

class Person {
	private static Person person;
	
	private Person() {
		
	}
	
	// slow as this is thread safe
	public static synchronized Person getInstance() {
		if(person == null)
		{
			person = new Person();
		}
		return person;
	}
}

public class SynchronizedSingelton {

	public static void main(String[] args) {

		Person p1 = Person.getInstance();
		Person p2 = Person.getInstance();
		
		System.out.println(p1 == p2);
		
	}

}
