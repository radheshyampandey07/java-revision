package streams.list_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {

	
		List<Student> studentList =Student.getStudents();

		System.out.println("student list : " + studentList);
		
		// Removes the student with roll number 101
		System.out.println(studentList.removeIf(student -> student.getRollNo() == 69));;
		System.out.println("........................");

		List<Student> collect = studentList.stream()
				.filter(x -> x.getName().charAt(0) == 'R').collect(Collectors.toList());
		System.out.println(collect);
		System.out.println("........................");

		List<Student> firstDivStudents = studentList.stream()
				.filter(x -> x.getMarks() > 60)
				.collect(Collectors.toList());

		System.out.println("firstDivStudents : " + firstDivStudents);
		System.out.println("...................");
		
		studentList.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).forEach(System.out::print);
		
		
		System.out.println("\n ...................");

		// grouping by example
		Map<String, Double> collect2 = studentList.stream()
				.collect(Collectors.groupingBy(Student::getCourse, Collectors.averagingInt(Student::getMarks)));
		
		System.out.println("avg in every course : "+collect2);
	}

}
