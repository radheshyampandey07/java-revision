package inner_class.member_inner_class;

public class TestInnerClass {

	public static void main(String[] args) {

		Car car = new Car("Alto 800");
		Car.Engine engine =  car.new Engine();
		engine.start();
		engine.stop();
		
		
	}

}
