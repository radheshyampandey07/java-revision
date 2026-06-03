package Association.ManyToOne;

public class Employee {

	private String empName;

	private Department department;

	public Employee(String empName, Department department) {
		super();
		this.empName = empName;
		this.department = department;
		department.setEmployees(this);
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
