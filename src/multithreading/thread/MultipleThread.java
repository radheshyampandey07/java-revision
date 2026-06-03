package multithreading.thread;

class A extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("hi");
	}
}

class B extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("hello");
	}
}

public class MultipleThread {

	public static void main(String[] args) {

		System.out.println("main thread started..");
		A a = new A();
		B b = new B();
		a.setPriority(10);
		b.setPriority(Thread.MAX_PRIORITY);
		a.start();
		b.start();
		System.out.println("main thread ended..");

	}

}
