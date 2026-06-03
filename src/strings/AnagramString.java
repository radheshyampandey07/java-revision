package strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {

		// listen, silent

//		String str1 = "silent", str2 = "listen";

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String str1 = sc.next();
		Scanner sc1 = new Scanner(System.in);

		System.out.println("enter second string");
		String str2 = sc.next();

		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();

		if (char1.length == char2.length) {
			for (int i = 0; i < char1.length - 1; i++) {
				for (int j = 0; j < char1.length - i - 1; j++) {

					if (char1[j] > char1[j + 1]) {
						char temp = char1[j];
						char1[j] = char1[j + 1];
						char1[j + 1] = temp;
					}
					if (char2[j] > char2[j + 1]) {
						char temp1 = char2[j];
						char2[j] = char2[j + 1];
						char2[j + 1] = temp1;
					}
				}
			}
			System.out.println(Arrays.equals(char1, char2));
			String str3 = new String(char1);
			String str4 = new String(char2);
			if (str3.equalsIgnoreCase(str4))
				System.out.println("both strings are anagram of each other.");

		} else {
			System.out.println("both strings are not anagram of each other.");
		}
	}

}
