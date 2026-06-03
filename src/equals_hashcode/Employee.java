package equals_hashcode;

import java.util.Objects;

public class Employee {

	int id;

	String name;

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if (e.id == this.id)
			return true;
		else
			return false;
	}

}
