package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	int age;

	String name;

	Long salary;

	String Dept;

	Employee() {

	}

	Employee(int age, String name, Long salary, String Dept) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.Dept = Dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + ", Dept=" + Dept + "]";
	}

	// employees list
	public static List<Employee> getEmployeeList() {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(25, "Radhe", 45000L, "IT"));
		employees.add(new Employee(28, "Aman", 30000L, "HR"));
		employees.add(new Employee(30, "Rohit", 45000L, "Finance"));
		employees.add(new Employee(25, "Priya", 30000L, "IT"));
		employees.add(new Employee(32, "Neha", 50000L, "Management"));
		employees.add(new Employee(29, "Karan", 30000L, "Sales"));
		employees.add(new Employee(28, "Anjali", 27000L, "HR"));
		employees.add(new Employee(31, "Vikram", 68000L, "Finance"));
		employees.add(new Employee(24, "Sneha", 68000L, "IT"));
		employees.add(new Employee(35, "Arjun", 68000L, "Management"));

		return employees;
	}

}
