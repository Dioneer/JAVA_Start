package OOP;

public abstract class Transport {
	private float speed, weight;
	private String name;
	private String color;
	private byte[] coord;

	class Engine {
		private boolean isReady;
		private int km;

		public Engine(boolean isReady, int km) {
			this.isReady = isReady;
			this.km = km;
		}

		public void info() {
			if (isReady) {
				System.out.println("Ready");
			} else {
				System.out.println("not ready");
			}
		}
	}

	public String toString() {
		return String.format("%.0f, %.0f, %s, %s", speed, weight, name, color);
	}

	public void setValues(float speed, float weight, String name, String color, byte[] coord) {
		this.speed = speed;
		this.weight = weight;
		this.name = name;
		this.color = color;
		this.coord = coord;
	}

	public Transport(float speed, float weight, String name, String color, byte[] coord) {
		// setValues(speed, weight, name, color, coord);
	}

	public Transport(float weight, String name) {
		// setValues(speed, weight, name, color, coord);
	}

	public abstract void moveSpeed(float speed);

	public abstract boolean toStop();

	// public String getValues() {
	// StringBuilder string = new StringBuilder();
	// string.append("Object speed: ");
	// string.append(speed + ",");
	// string.append(" weight: ");
	// string.append(weight + ",");
	// string.append(" color: ");
	// string.append(color + ",");
	// string.append(" coord: ");
	// for (int i = 0; i < coord.length; i++) {
	// if (i < coord.length - 1) {
	// string.append(coord[i] + ":");
	// } else {
	// string.append(coord[i]);
	// }
	// }
	// return string.toString();
	// }
}
