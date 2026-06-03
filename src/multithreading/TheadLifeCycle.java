package multithreading;

class AA extends Thread {

	public void run() {
		System.out.println("RUNNING");
		for(int i =0; i< 2; i++) {
			System.out.println();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class TheadLifeCycle {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Thread State -: ");
		AA aa = new AA();
		System.out.println("1. " + aa.getState());
		aa.start();
		System.out.println("2. " + aa.getState());
		Thread.sleep(200);
		System.out.println("3. " + aa.getState());
		aa.join();
		System.out.println("4. " + aa.getState());

		
	}

}
