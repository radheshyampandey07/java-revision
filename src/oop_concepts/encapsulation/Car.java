package oop_concepts.encapsulation;

public class Car {

	private String name;

	private String model;

	private int speed;

	void accelarte(int n) {
		speed += n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", speed=" + speed + "]";
	}
	
	

}
