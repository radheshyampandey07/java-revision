package design_patterns.singelton;

class DBConnection {

	private static volatile DBConnection connection;

	private DBConnection() {

	}

	public static DBConnection getInstance() {
		// 1st check
		if (connection == null) {
			synchronized (DBConnection.class) {
				// 2nd check
				if (connection == null) {
					connection = new DBConnection();
				}
			}
		}
		return connection;
	}
}

public class DoubleCheckLockingSingelton {

	public static void main(String[] args) {

	}

}
