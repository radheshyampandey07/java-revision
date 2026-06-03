package strings;

public class Palindrome {

	public static boolean checkPalindrome(String str) {
		boolean palindrome = true;
		for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				palindrome = false;
			}
		}
		return palindrome;
	}

	public static void main(String[] args) {

		// input : madam
		// output : true

		String str = "level";

		System.out.println(checkPalindrome(str));

	}

}
