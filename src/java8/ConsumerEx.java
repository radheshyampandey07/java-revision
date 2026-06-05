package java8;

import java.util.function.Consumer;

public class ConsumerEx {

	public static void main(String[] args) {
		
		Consumer<String> consumer = t -> System.out.println(t);
		
		consumer.accept("radhe shyam");

		
	}

}
