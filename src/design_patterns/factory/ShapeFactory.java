package design_patterns.factory;

public class ShapeFactory {

	public static Shape getShape(String type) {

		return switch (type.toUpperCase()) {
		case "SQUARE" -> new Square();
		case "RECTANGLE" -> new Rectangle();
		default -> throw new IllegalArgumentException("Unexpected value: " + type.toUpperCase());
		};
	}

}
