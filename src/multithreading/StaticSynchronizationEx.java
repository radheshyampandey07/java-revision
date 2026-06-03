package multithreading;

class ABC {

	private static int count = 0;

	// The Scope: Locks the entire Class object
	synchronized public static void increment() {
		count++;
	}

	public static int getCount() {
		return count;
	}
}

class XYZ implements Runnable {

	public void run() {
		for(int i =0; i<10; i++) {
			ABC.increment();
		}
	}
}

public class StaticSynchronizationEx {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new XYZ());
		Thread t2 = new Thread(new XYZ());
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(ABC.getCount());

	}

}
