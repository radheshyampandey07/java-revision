package java17;

public class SwitchEx {

	public static void main(String[] args) {

		// Modern Way (Java 14+)
		String day = "Sunday";
		switch (day) {
		case "Saturday", "Sunday" -> System.out.println("Its weekend...");

		case "Monday" -> System.out.println("Office is started...");

		default -> System.out.println("regular routine..");
		}

		int x = 18;
		String str = "";
		str = switch (x) {
		case 15 -> "minor";
		case 70 -> "old";
		default -> "adult";
		};
		System.out.println(str);
	}

}
