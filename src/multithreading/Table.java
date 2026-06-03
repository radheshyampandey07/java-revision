package multithreading;

class ShowTable {

	public synchronized void table(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "x" + i + " = " + n * i);
			try {
				Thread.sleep(700);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class Student implements Runnable {

	ShowTable st = null;
	int n = 0;
	Thread t = null;

	public Student(int x, ShowTable s) {
		this.n = x;
		st = s;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		st.table(n);
	}

}

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowTable s = new ShowTable();
		Student s1 = new Student(4, s);
		Student s2 = new Student(5, s);
		Student s3 = new Student(6, s);
	}

}
