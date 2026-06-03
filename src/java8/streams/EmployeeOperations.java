package java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeOperations {

	public static void main(String[] args) {

		List<Employee> employees = Employee.getEmployeeList();

//		employees.forEach(System.out::println);

		List<Employee> list = employees.stream().filter(e -> e.getName().charAt(0) == 'A').toList();

		System.out.println(list);

		System.out.println("------------------------------------------------------");

		System.out.println("grouped by salary...");
		employees
				.stream().collect(Collectors.groupingBy(Employee::getSalary,
						() -> new TreeMap<>(Comparator.reverseOrder()), Collectors.toList()))
				.forEach((salary, empList) -> {
					System.out.println("Salary: " + salary);
					empList.forEach(System.out::println);
				});
		System.out.println("------------------------------------------------------");

		System.out.println("highest grossed salary employee...");
		Employee highestsalariedemp = employees.stream()
				.sorted((a, b) -> (int) b.getSalary().intValue() - (int) a.getSalary().intValue()).findFirst().get();

//		System.out.println(highestsalariedemp);

		List<Employee> empSortedInReverseOrder = employees.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());

		System.out.println(empSortedInReverseOrder);

		System.out.println("------------------------------------------------------");

		System.out.println("grouped by department...");

		employees.stream().collect(Collectors.groupingBy(Employee::getDept)).entrySet().forEach((entry) -> {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		});

		System.out.println("------------------------------------------------------");
		System.out.println("find out count in every departement -");

		Map<String, Long> collectCountOfEmpInEachDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

		System.out.println(collectCountOfEmpInEachDept);

		collectCountOfEmpInEachDept.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()) // .findFirst()
				.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

		System.out.println("------------------------------------------------------");

		System.out.println("second highest salaries employee.. ");

		int n = 2; // for 2nd highest salary

		// Step 1: Find nth highest distinct salary
		Optional<Long> nthHighestSalary = employees.stream().map(Employee::getSalary).distinct()
				.sorted(Comparator.reverseOrder()).skip(n - 1).findFirst();

		// Step 2: Print all employees with that salary
		nthHighestSalary.ifPresent(salary -> employees.stream().filter(emp -> emp.getSalary().equals(salary))
				.forEach(System.out::println));

		// highest salary in each dept
		System.out.println("------------------------------------------------------");
		System.out.println("highest salary in each dept...");

		Map<String, Optional<Employee>> collect = employees.stream()
		.collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparingLong(Employee::getSalary))));
		
		System.out.println(collect);
		
		// main ends
	}
}
