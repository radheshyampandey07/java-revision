package oop_concepts.encapsulation;

public class TestCar {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.setName("Verna");
		c.setModel("2026");
		c.setSpeed(100);
		System.out.println(c.toString());
		
		c.accelarte(20);
		System.out.println(c.getSpeed());
	}

}
