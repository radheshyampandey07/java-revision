package multithreading;

class SharedData {

	volatile boolean running = true;
	volatile String name = "Radhe";
}

public class VolatileExample {

	public static void main(String[] args) {

		SharedData data = new SharedData();

		Thread workerThread = new Thread(() -> {

			System.out.println("Worker thread started");

			while (data.running) {

				// working continuously
			}

			System.out.println("Worker thread stopped");
		});

		Thread stopperThread = new Thread(() -> {

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Stopping thread...");

			data.running = false;
		});

		workerThread.start();
		stopperThread.start();
	}

}
