package streams;

import java.util.List;

public class CustomerStreamOps {

	public static void main(String[] args) {

		List<Customer> customers = Customer.getAll();

		List<String> customersName = customers.stream().map(c -> c.getName()).toList();

		System.out.println(customersName);
		
		List<String> orders = customers.stream().flatMap(c -> c.getOrders().stream()).toList();
		
		System.out.println(orders);
		
		

	}

}
