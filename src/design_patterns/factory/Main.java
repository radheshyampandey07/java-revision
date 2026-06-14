package design_patterns.factory;

public class Main {

	public static void main(String[] args) {

		Shape s = ShapeFactory.getShape("square");
		s.getArea(2, 3);
	}

}
