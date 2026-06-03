package java8.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {

	public static void main(String[] args) {

		List<Student> studentList = Student.getStudentList();
		
		System.out.println("before sorting : " + studentList);
		
		Collections.sort(studentList);

		System.out.println("after sorting : " + studentList);

	}

}
