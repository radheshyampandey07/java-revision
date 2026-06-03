package java11plus;

public class StringMethods {

	public static void main(String[] args) {

		String str = "radhe Shyam pandey";
		String str1 = "radhe shyam is working. \n he is a java developer. \n he is currently looking for job change.";

		// 1.isBlank()
		System.out.println(str.isBlank());
		System.out.println("------------------------------");

		// 2. lines() -  it will return stream of string
		str1.lines().forEach(System.out::println); 
		System.out.println("------------------------------");

		// 3. repeat(int n) - returns repeated string
		String str2 = str.repeat(5);
		
		System.out.println(str2);
		System.out.println("------------------------------");

		// 4. stripLeading() + stripTrailing
		
		String str3 = "     hello guys.";
		System.out.println(str3.stripLeading());
		
	}

}
