package inner_class.member_inner_class;

public class Car {

	private String model;

	private boolean isEngineOn;

	public Car(String model) {
		this.model = model;
		isEngineOn = false;
	}

	class Engine {

		void start() {
			//member inner class has access of private members of
			// its parent class
			if (!isEngineOn) {
				isEngineOn = true;
				System.out.println(model + " is started on.");
			} else {
				System.out.println(model + " is already on.");
			}
		}

		void stop() {
			if (isEngineOn) {
				isEngineOn = false;
				System.out.println(model + " is turned off.");
			} else {
				System.out.println(model + " is already off.");
			}
		}

	}

}
