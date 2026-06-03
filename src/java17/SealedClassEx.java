package java17;

sealed class A permits B, C {

	public void identify() {
		System.out.println("I am a member of the Sealed Hierarchy A.");
	}
}

non-sealed class B extends A {

	@Override
	public void identify() {
		System.out.println("I am B, a non-sealed subclass. My children are unrestricted.");
	}
}

non-sealed class C extends A {

	@Override
	public void identify() {
		System.out.println("I am C, a non-sealed subclass.");
	}

	public void actionC() {
		System.out.println("Action specific to C");
	}
}

class D extends B {

	@Override
	public void identify() {
		System.out.println("I am D, a grandchild of A. I can exist because B is non-sealed.");
	}

	public void actionD() {
		System.out.println("Action specific to D");
	}
}

public class SealedClassEx {
	public static void main(String[] args) {
		A obj = new D();
		process(obj);
	}

	public static void process(A a) {
		if (a instanceof D d) {
			d.identify();
		} else if (a instanceof B b) {
			b.identify();
		} else if (a instanceof C c) {
			c.actionC();
		} else {
			a.identify();
		}
	}
}