package static_examples;

class Test {
	static int count = 0;

	static int x = 1;

	static {
		x++;
		if (x > 1) {
			count++;
		} else {
			count--;
		}
		System.out.println(count);
	}
}

public class StaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
		Test.count = 9;

	}

}
