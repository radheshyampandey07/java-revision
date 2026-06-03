package collctions.set;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

class Product {

	private String name;

	private Double price;

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	@Override
	public String toString() {
		return " [name=" + name + ", price=" + price + "]";
	}

}

public class SetStreamExample {

	public static void main(String[] args) {

		// 1. Create a Set and populate it (Duplicates are automatically ignored)
		Set<Product> productSet = new HashSet<>();
		productSet.add(new Product("Laptop", 1200.00));
		productSet.add(new Product("Mouse", 25.50));
		productSet.add(new Product("Mouse", 25.50)); // Duplicate! Will be ignored by the Set.
		productSet.add(new Product("Sticky Notes", 5.00));
		productSet.add(new Product("Keyboard", 45.00));
		productSet.add(new Product("Pen", 2.50));
		productSet.add(new Product("Pen", 3.50));

		System.out.println(productSet);

		List<Product> products = productSet.stream()
				.filter(p -> p.getPrice() > 3 && p.getPrice() < 50).toList();
		
		AtomicInteger srNo = new AtomicInteger(1);
		products.forEach(product -> 
	    System.out.println(srNo.getAndIncrement() + ". " + product)
	);
	}

}
