package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStreamExample {

	public static void main(String[] args) {

		List<Employee> employees = Employee.getAllEmployees();

		System.out.println(employees);

		String maxSalariedEmployee = employees.stream().max(Comparator.comparing(Employee::getSalary))
				.map(Employee::getEmpName).get();

		System.out.println("Max Salaried Employee : " + maxSalariedEmployee);

		List<String> decOrderSalariedEmplist = employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary ).reversed()).map(Employee::getEmpName).toList();

		System.out.println("decOrderSalariedEmplist : " + decOrderSalariedEmplist);

		List<Employee> secHighestPaidEmployee = employees.stream().sorted(Comparator.comparing(Employee::getSalary))
				.skip(1).limit(1).toList();
		System.out.println("secHighestPaidEmployee : " + secHighestPaidEmployee);

		Set<String> uniqueEmpNames = employees.stream().map(Employee::getEmpName).collect(Collectors.toSet());

		System.out.println(uniqueEmpNames);

		// get employee name and their emp Id
		Map<Long, String> employeesNames = employees.stream()
				.collect(Collectors.toMap(Employee::getEmpId, Employee::getEmpName));

//		System.out.println(employeesNames);
		for (Map.Entry<Long, String> emp : employeesNames.entrySet()) {
			System.out.println(emp.getKey() + " : " + emp.getValue());
		}

		// collect all names into a single string
		String name = employees.stream().map(Employee::getEmpName).collect(Collectors.joining(", "));
		System.out.println(name);

		// collect avg salary

		Double avgSalary = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));

		System.out.println("avgSalary : " + avgSalary);

		// count emp having salary more than 60000

		Long count = employees.stream().filter(e -> e.getSalary() > 60000).count();
		System.out.println(count + " employee have more salary than 60000");

		// sort employee (ascending)

		employees.stream().sorted(Comparator.comparing(Employee::getDepartment)).forEach(System.out::println);

		// filter employees whose salary is greater than a given value

		List<Employee> grtThan = employees.stream().filter(s -> s.getSalary() > 30000).toList();

		System.out.println(grtThan);

		// average salary of all employees

		Double collect = employees.stream().collect(Collectors.averagingDouble(s -> s.getSalary()));

		System.out.println(collect);

		Map<String, List<Employee>> grpByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		System.out.println("grpByDept : " + grpByDept);

		// count employees in every department

		Map<String, Long> countem = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println(countem);

		Map<String, Double> grpByDeptAndAvgSalary = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println("group by dept and find average salary from each dept : " + grpByDeptAndAvgSalary);
	
		// find number of employees from the department where employees are more than 3
		Map<String, Long> empCountGroupByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
			.entrySet()
			.stream()
			.filter(e -> e.getValue()>2)
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(empCountGroupByDept);
			
	
	}

}
