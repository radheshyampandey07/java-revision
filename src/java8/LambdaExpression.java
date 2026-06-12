package java8;

@FunctionalInterface
interface CheckLength {

	abstract Boolean checkLength(String str, Integer len);
}

@FunctionalInterface
interface TestMath {

	abstract Integer getSum(int x, int y);

}

@FunctionalInterface
interface GetSquare {

	abstract Integer square(int x);
}

public class LambdaExpression {

	public static void main(String[] args) {

		CheckLength t = (s, l) -> {
			if (s.length() == l)
				return true;
			else
				return false;
		};

		System.out.println(t.checkLength("radhe", 5));

		TestMath tm = (x, y) -> {
			return x + y;
		};
		System.out.println(tm.getSum(10, 30));

		GetSquare gs = c -> c * c;

		System.out.println(gs.square(6));
	}

}
