package OOP;

public class Car extends Transport {
	public Engine engine = new Engine(false, 1000);

	public Car(float speed, float weight, String name, String color, byte[] coord) {
		super(speed, weight, name, color, coord);
	}

	@Override
	public void moveSpeed(float speed) {
		System.out.println(speed);
	}

	@Override
	public boolean toStop() {
		return true;
	}
}
