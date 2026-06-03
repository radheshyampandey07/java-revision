package multithreading;

class T extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(hi() + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public String hi() {
		return "Hi";
	}
}

public class ReviseThread {

	public static void main(String[] args) throws InterruptedException {

		T t1 = new T();
		t1.setName("T1");

		T t2 = new T();
		t2.setName("T2");

		T t3 = new T();
		t3.setName("T3");

		t1.start();
		t1.join(); // Wait for T1 to finish

		t2.start();
		t2.join(); // Wait for T2 to finish

		t3.start();
		t3.join(); // Wait for T3 to finish
	}

}
