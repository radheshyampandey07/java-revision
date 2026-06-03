package java8;

import java.time.Instant;
import java.time.LocalDateTime;

public class DateTimeApi {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		LocalDateTime dt1 = dt.plusDays(2);
		System.out.println(dt1);

		Instant instant = Instant.now();

		System.out.println(instant);
	}

}
