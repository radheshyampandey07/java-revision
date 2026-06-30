package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

	private Long empId;

	private String empName;

	private Double salary;

	private String department;

	public Employee(Long empId, String empName, Double salary, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.department = dept;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", department=" + department
				+ "]";
	}

	public static List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee(1L, "Radhe Shyam", 85000D, "IT"),
				new Employee(2L, "Amit Verma", 42000D, "HR"), 
				new Employee(3L, "Neha Singh", 90000D, "Finance"),
				new Employee(4L, "Rohit Sharma", 65000D, "IT"), 
				new Employee(5L, "Anjali Mishra", 78000D, "Admin"),
				
				new Employee(7L, "Sneha Kapoor", 91000D, "Finance"),
				new Employee(8L, "Vikas Yadav", 42000D, "HR"), 
//				new Employee(9L, "Anjali Mishra", 87000D, "IT"),
//				new Employee(6L, "Karan Mehta", 32000D, "IT"), 
				new Employee(10L, "Deepak Kumar", 78000D, "Admin")));
		
		return employees;
	}

}
