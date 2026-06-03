package Association.ManyToOne;

public class ManyToOneEx {

	public static void main(String[] args) {

		Department department = new Department("IT");

		Employee emp = new Employee("Radhe Shyam", department);
		Employee emp1 = new Employee("Sunita", department);
		Employee emp2 = new Employee("Guddu", department);

		System.out.println("emploees under department : " + department.getDeptName());
		for (Employee employee : department.getEmployees()) {
			System.out.println(employee.getEmpName());
		}
	}

}
