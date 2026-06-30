package design_patterns.builder;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee.EmployeeBuilder()
				.setId(1)
				.setName("Radhe")
				.setDeptId(12L)
				.setManagerId(201L)
				.build();


		System.out.println(emp);
		
		System.out.println(emp.getName());
	}

}
