package exceptions;

class Vote {

	int age;

	Vote(int age) {
		this.age = age;
	}

	void checkVote() {
		if (age < 18) {
			System.out.println("You are a minor so can not vote.");
			throw new ArithmeticException("No vote rights.");

		} else {
			System.out.println("you have right to vote.");
		}
	}
}

public class ThrowExample {

	public static void main(String[] args) {

		Vote v1 = new Vote(12);
		v1.checkVote();
	}

}
