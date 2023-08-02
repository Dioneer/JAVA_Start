package OOP;

public class Track extends Transport {
	private boolean isLoaded;
	public Engine engine = new Engine(false, 1000);

	public Track(float weight, String name) {
		super(weight, name);
	}

	public Track(float weight, String name, boolean loaded) {
		super(weight, name);
		this.isLoaded = loaded;
	}

	public void setValues(float speed, float weight, String name, String color, byte[] coord, boolean loaded) {
		super.setValues(speed, weight, name, color, coord);
		System.out.println("Second");
	}

	@Override
	public void moveSpeed(float speed) {
		System.out.println(speed);
	}

	@Override
	public boolean toStop() {
		return true;
	}

	@Override
	public String toString() {
		String string = super.toString();
		System.out.println(string + " " + this.isLoaded);
		return string;
	}

	public void setLoaded(boolean loaded) {
		this.isLoaded = loaded;
	}

	public String getLoaded() {
		if (this.isLoaded == true) {
			return "Loaded";
		} else {
			return "Unloaded";
		}
	}
}
