package streams;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		String str = "malyalam";

		str.chars().mapToObj(c -> (char) c).distinct().forEach(System.out::println);
	}

}
