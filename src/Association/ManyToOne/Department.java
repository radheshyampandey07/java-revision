package Association.ManyToOne;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String deptName;

	private List<Employee> employees;

	public Department(String deptName) {
		this.deptName = deptName;
		this.employees = new ArrayList<Employee>();
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Employee employee) {
		this.employees.add(employee);
	}

}
