package java17;

public class TextBlock {

	public static void main(String[] args) {

		String str = """
				I guys
				I am radhe shyam pandey
				i am preparing for java developer interviews.
								""";
		
		System.out.println(str);
		System.out.println("-----------");

		
		System.out.println(str.charAt(2));
		System.out.println("-----------");

		
		System.out.println(str.strip());
		
		System.out.println("-----------"+ str.lines().count());
		
		str.lines().forEach(System.out::println);
		
	}

}
