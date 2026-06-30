package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.*;

public class _20StreamInterviewPrograms {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 3, 4, 7, 3, 12, 4, 3);
		List<Integer> num2 = Arrays.asList(3, 12, 4, 3);

		// 1. remove duplicate and sort in desc order
		List<Integer> sortedlist = nums.stream().distinct()
//				.sorted((a, b) -> b-a)
				.sorted(Comparator.reverseOrder()).toList();

		System.out.println(sortedlist);

		// 2. find all the odd numbers and return their square
		List<Integer> sqlist = nums.stream().filter(n -> n % 2 != 0).map(x -> x * x).toList();

		System.out.println(sqlist);

		// 3. get the 2nd and 3rd element from the list and store it to list
		List<Integer> limitlist = nums.stream().skip(1).limit(2).toList();
		System.out.println(limitlist);

		// 4. find the 2nd highest number in the list
		List<Integer> highlist = nums.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).toList();

		System.out.println(highlist);

		// 5. return the longest string
		List<String> language = Arrays.asList("Java", "CSS", "C#");
		String sortedlanguage = language.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst()
				.get();

		System.out.println(sortedlanguage);

		List<Employee> employees = Employee.getAllEmployees();

		// 6. sort by salary
		List<Employee> sortedSalaryList = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
				.toList();

//		System.out.println(sortedSalaryList);

		// 7. group by dept and find num of emp in each dept
		Map<String, Long> grpByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println(grpByDept);

		// 8. highest paid employee in every department
		Map<String, Optional<Employee>> highsalaryInEachDept = employees.stream()
				.collect(Collectors.groupingBy(
				emp -> emp.getDepartment(), 
					Collectors.maxBy(Comparator.comparingDouble(e -> e.getSalary()))));

		System.out.println(highsalaryInEachDept);

		// 9. find common element in two lists
		List<Integer> commonlist = num2.stream().filter(e -> nums.contains(e)).toList();

		System.out.println(commonlist);
		
		Optional<Double> reduce = employees.parallelStream()
			.map(e -> e.getSalary())
			.reduce((a, b)-> a+b);
		System.out.println(reduce);
		
		// 10. first sort by salary then name
		List<Employee> sortBySalThenNamelist = employees.stream()
			.sorted(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getEmpName))
			.toList();
		
		System.out.println(sortBySalThenNamelist);
	}

}
