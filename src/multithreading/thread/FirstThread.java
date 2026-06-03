package multithreading.thread;

class Test extends Thread {

	public void run() {
		for (int i = 0; i < 8; i++) {
			try {
				System.out.println("this is thread class ...." + i + "  " + Thread.currentThread().getName());
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class FirstThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1 = new Test();
		t1.start();
		t1.setName("first thread");

		Test t2 = new Test();
		t2.start();
		t1.setName("second thread");
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
