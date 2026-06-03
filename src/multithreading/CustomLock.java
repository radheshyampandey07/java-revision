package multithreading;

class ABC1 {
	private int count;

	private final Object lock = new Object();

	public void increment(String str) {
		synchronized (lock) {
			for (int i = 0; i < 10; i++) {
				count++;
				System.out.println(str + " - " + count);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public int getCount() {
		synchronized (lock) {
			return count;
		}
	}
}

class XYZ1 implements Runnable {
	ABC1 ab;
	String name;

	public XYZ1(ABC1 ab, String n) {
		this.ab = ab;
		this.name = n;
	}

	public void run() {
		ab.increment(name);
	}
}

public class CustomLock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ABC1 ab = new ABC1();
		Thread t1 = new Thread(new XYZ1(ab, "Radhe"));
		Thread t2 = new Thread(new XYZ1(ab, "Shyam"));

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("final count : " + ab.getCount());

	}

}
