package design_patterns.singelton;

class Test {
	private static Test test; // = null
	// if 2 threads comes together and check whether the obj is null and they will found it null 
	// so they will create 2 object
	

	private Test() {

	}

	public static Test getInstance() {
		if (test == null) {
			test = new Test();
		}
		return test;
	}
}

public class LazyInitializationSingelton {

	public static void main(String[] args) {

		Test t = Test.getInstance();
		Test t1 = Test.getInstance();
		
		System.out.println(t == t1);
		
	}

}
