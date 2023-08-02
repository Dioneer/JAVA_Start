package OOP;

public class Main {
	public static void main(String[] args) {
		// Car bmw = new Car(300f, 2f, "spring", "red", new byte[] { 0, 0, 0 });
		Track truck = new Track(8f, "strong", false);
		truck.engine.info();
		truck.setValues(300f, 2f, "spring", "red", new byte[] { 0, 0, 0 }, true);
		truck.setLoaded(true);
		truck.getLoaded();
		System.out.println(truck.toString());
	}
}
