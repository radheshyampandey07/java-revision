package equals_hashcode;

import java.util.HashSet;

public class MainMethod {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.id = 1;
		e1.name = "Radhe";
		
		Employee e2 = new Employee();
		e2.id = 1;
		e2.name = "Radhe";
		
		System.out.println(e1.equals(e2));
		
		HashSet<Employee> emp = new HashSet<Employee>();
		emp.add(e2);
		emp.add(e1);
		
		System.out.println(emp.size());
	}

}
