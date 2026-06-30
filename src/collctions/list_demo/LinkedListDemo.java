package collctions.list_demo;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		List<String> names = new LinkedList<String>();
		names.add("Radhe");
		names.add("shyam");
		
		System.out.println(names);
	}

}
