package design_patterns.factory;

public class Square implements Shape {

	@Override
	public void getArea(int a, int b) {

		System.out.println("area of square is : " + a * b);
	}

}
