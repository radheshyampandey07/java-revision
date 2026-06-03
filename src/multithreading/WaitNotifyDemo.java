package multithreading;

class A extends Thread {

	public int sum = 0;

	public void run() {
		synchronized (this) {

			for (int i = 0; i < 10; i++) {
				sum = sum + i;
			}
			this.notify();
//			System.out.println("sum : " + sum);
		}
	}

}

public class WaitNotifyDemo {

	public static void main(String[] args) throws InterruptedException {

		A t = new A();

		t.start();

		synchronized (t) {
			t.wait();
			System.out.println("sum is : " + t.sum);

		}

	}

}
