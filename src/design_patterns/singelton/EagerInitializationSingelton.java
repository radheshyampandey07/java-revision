package design_patterns.singelton;

class College {
//	private static String name = "IGNOU";

	private static College college = new College();

	private College() {

	}

	public static College getInstance() {
		return college;
	}
}

public class EagerInitializationSingelton {

	public static void main(String[] args) {

		College c = College.getInstance();
		System.out.println(c.hashCode());
		College c1 = College.getInstance();
		System.out.println(c1.hashCode());
	}

}
