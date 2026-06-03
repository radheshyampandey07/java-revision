package multithreading;

class PrintTable {

	synchronized void prinTable(int n) {
		System.out.println("print table of : " + n);
		for (int m = 1; m <= 10; m++) {
			System.out.println(n + "*" + m + " = " + n * m);
			try {
				Thread.sleep(350);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public void table(int n) {
		System.out.println("given number is : " + n);
		synchronized (this) {
			for (int m = 1; m <= 10; m++) {
				System.out.println(n + "*" + m + " = " + n * m);
				try {
					Thread.sleep(350);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

class PassNumber extends Thread {
	PrintTable pt;
	int num = 0;

	public PassNumber(int n, PrintTable pt1) {
		num = n;
		pt = pt1;
	}

	public void run() {
		pt.table(num);
	}
}

class PassNumber2 extends Thread {
	PrintTable pt;
	int num = 0;

	public PassNumber2(int n, PrintTable pt1) {
		num = n;
		pt = pt1;
	}

	public void run() {
		pt.prinTable(num);
	}
}

public class PrintTableSync {

	public static void main(String[] args) {

		PrintTable p = new PrintTable();

		PassNumber pm = new PassNumber(10, p);

		PassNumber2 pm1 = new PassNumber2(12, p);
		pm.start();
		pm1.start();
	}

}
