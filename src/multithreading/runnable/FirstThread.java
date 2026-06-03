package multithreading.runnable;

class Test implements Runnable {
	static int x = 1;

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(++x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class FirstThread {

	public static void main(String[] args) throws InterruptedException {

		Test test = new Test();
		Thread thread = new Thread(test);
		thread.start();
		
		System.out.println("---------------");

		Runnable r = () -> {
			for (int i = 0; i < 10; i++)
				System.out.println(i);
		};
		
		
		
		Thread thread1 = new Thread(r);
		thread1.start();
		
		thread.join();
		thread1.join();

	}

}
