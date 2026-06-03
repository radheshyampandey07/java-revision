package java17;

import java.util.Objects;

//class User {
//
//	private final int id;
//
//	private final String name;
//
//	public User(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		User other = (User) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
//
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", name=" + name + "]";
//	}
//
//}

/* by default Records are final and immutable by default
 * Fields are automatically private and final
 * 
 * 
 * Auto-Generated Methods -:
 * Java automatically provides-

 * equals()
 * hashCode()
 * toString()
 * Getter methods (no get prefix)
 * 
 */

record User(int id, String name) {
}

public class Record {

	public static void main(String[] args) {

		User u1 = new User(1, "Radhe");
		User u2 = new User(1, "Radhe");

		System.out.println(u1);

		System.out.println(u1.equals(u2));
		
		System.out.println(u1.name());

	}

}
