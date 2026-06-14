package design_patterns.factory;

public class Rectangle implements Shape {

	@Override
	public void getArea(int a, int b) {

		System.out.println("area of rectangle is : " + a * b);
	}
}
