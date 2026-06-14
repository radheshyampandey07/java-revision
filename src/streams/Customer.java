package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {

	private int id;

	private String name;

	private List<String> orders;

	public Customer() {
		super();
	}

	public Customer(int id, String name, List<String> orders) {
		super();
		this.id = id;
		this.name = name;
		this.orders = orders;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getOrders() {
		return orders;
	}

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}

	public static List<Customer> getAll() {
		List<Customer> customers = new ArrayList<>(
				Arrays.asList(new Customer(1, "Radhe", Arrays.asList("iphone", "TV")),
						new Customer(2, "Shyam", Arrays.asList("Cooler", "AC")),
						new Customer(3, "Gyan", Arrays.asList("Fridge", "Washing Machine")),
						new Customer(4, "Ishan", Arrays.asList("Bluetooth speaker", "Laptop"))));
		return customers;
	}
}
