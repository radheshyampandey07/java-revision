package design_patterns.builder;

public class Employee {

	private int id;
	private String name;
	private Long deptId;
	private Long managerId;

	private Employee(EmployeeBuilder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.deptId = builder.deptId;
		this.managerId = builder.managerId;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Long getDeptId() {
		return deptId;
	}

	public Long getManagerId() {
		return managerId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptId=" + deptId + ", managerId=" + managerId + "]";
	}

	public static class EmployeeBuilder {

		int id;
		String name;
		Long deptId;
		Long managerId;

		public EmployeeBuilder setId(int id) {
			this.id = id;
			return this;
		}

		public EmployeeBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public EmployeeBuilder setDeptId(Long deptId) {
			this.deptId = deptId;
			return this;
		}

		public EmployeeBuilder setManagerId(Long managerId) {
			this.managerId = managerId;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}

	}

}
