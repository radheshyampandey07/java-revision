package java8.functional_interfaces;

public class RunnableEx {

	public static void main(String[] args) {

		Runnable r = () -> {
			Thread.currentThread().setName("Runnable thread");
			for (int i = 0; i < 5; i++) {
				System.out.println(i + " : " + Thread.currentThread().getName());
			}
		};

		Thread t = new Thread(r);
		t.start();
	}

}
