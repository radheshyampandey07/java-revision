package strings;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		// Input:String = swiss
		// Output: w

		String str = "swiss";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			boolean nonrep = true;

			for (int j = 0; j < str.length(); j++) {

				if (i != j && ch == str.charAt(j)) {
					nonrep = false;
					break;
				}
			}

			if (nonrep) {
				System.out.println("First non repeating character: " + ch);
				break;
			}
		}

	}

}
