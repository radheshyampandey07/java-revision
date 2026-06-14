package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterDemo {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 5; i++) {
			int taskId = i;
			service.execute(() -> {
				System.out.println("Task : " + taskId + " is performed by " + Thread.currentThread().getName());
			});
		}

	}

}
