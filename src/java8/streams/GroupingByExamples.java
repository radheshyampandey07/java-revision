package java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExamples {

	public static void main(String[] args) {

		List<Employee> employees = Employee.getEmployeeList();

		Map<String, List<Employee>> groupByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDept));

		System.out.println("groupByDept.........");
		System.out.println(groupByDept);
		System.out.println("------------------------------------------------------");

		Map<String, Long> groupByEmpCountInEachDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

		System.out.println("groupByEmpCountInEachDept.........");
		System.out.println(groupByEmpCountInEachDept);
		System.out.println("------------------------------------------------------");

		Map<String, Map<Integer, List<Employee>>> groupByDeptThenGroupByAge = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.groupingBy(Employee::getAge)));

		System.out.println("groupByDeptThenGroupByAge...");
		System.out.println(groupByDeptThenGroupByAge);
		System.out.println("------------------------------------------------------");

		Map<String, Double> collect = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingLong(Employee::getSalary)));

		System.out.println("groupByDeptAndAvgSalaryInDept...");
		System.out.println(collect);
		System.out.println("------------------------------------------------------");

		Map<Long, List<String>> collect2 = employees.stream().collect(
				Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())));

		System.out.println(
				"Question: I want a map where the key is the Department and the value is a list of only Employee Names (Strings), not the full objects.");
		System.out.println(collect2);
		System.out.println("------------------------------------------------------");

	}

}
