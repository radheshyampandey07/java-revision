package java11plus;

class ABC {
	int a = 5;
}

class XYZ extends ABC {
	int a = 10;
}

public class InstanceOfOpeatorEx {

	public static void main(String[] args) {

		ABC abc = new ABC();
		System.out.println(abc instanceof ABC);
		System.out.println(abc instanceof XYZ);

		ABC ab = new XYZ();
		ABC ab1 = ab;

		if (ab1 instanceof XYZ) {
			System.out.println("XYZ : " + ((XYZ) ab1).a);
			System.out.println("ABC : " + ab1.a);
		}

		Object s = "Radhe shyam pandey";
		if (s instanceof String) {
			String name = (String) s;
			System.out.println(name.toUpperCase());
		}

		// after java 16
		if (s instanceof String n) {
			System.out.println(n.toLowerCase());
		}

		Object[] obj = { "Radhe shyam pandey", 32, 159.9, true, 70000L };

		for (Object o : obj) {
			checkObjectType(o);
		}
	}

	private static void checkObjectType(Object o) {
		if (o instanceof String s) {
			System.out.println("your name is : " + s.toUpperCase());
		} else if (o instanceof Integer i) {
			System.out.println("your age is : " + i);
		} else if (o instanceof Double f) {
			System.out.println("your height is " + f + " inches.");
		} else if (o instanceof Boolean b) {
			System.out.println("are you a male : " + b);
		} else {
			System.out.println("unknown data.  " + o.getClass().getSimpleName());
		}

	}

}
