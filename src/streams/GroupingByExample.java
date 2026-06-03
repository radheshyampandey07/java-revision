package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

	public static void main(String[] args) {

		List<Employee> employees = Employee.getAllEmployees();

		List<String> empNames = employees.stream().map(Employee::getEmpName).toList();
		System.out.println(empNames);

		Map<Integer, List<String>> groupByNameLenght = empNames.stream()
				.collect(Collectors.groupingBy(String::length));

		System.out.println(groupByNameLenght);

		Map<String, List<Employee>> groupByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("groupByDept -> " );
		groupByDept.forEach((k, v) -> {
			System.out.println(k + " : " + v);
		});
		
		// count employees in every dept
		
		Map<String, Long> countEmpByDept = employees.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println("countEmpByDept : "+countEmpByDept);
		
		Map<String, Double> sumSalaryByDept = employees.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
		
		System.out.println("sumSalaryByDept : "+sumSalaryByDept);
		
		Map<String, List<String>> collect = employees.stream()
				.filter(e ->e.getSalary()>50000)
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(e -> "empId :"+ e.getEmpId() + " Name :" + e.getEmpName() + " ", Collectors.toList())));
		
		System.out.println(collect);
	}

}
