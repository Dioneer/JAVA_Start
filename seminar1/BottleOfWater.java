public class BottleOfWater extends Product {
	private double volume;

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		checkVolume(volume);
	}

	public BottleOfWater(String name, String brand, double price, double volume) {
		super(name, brand, price);
		checkVolume(volume);
	}

	private void checkVolume(double volume) {
		if (volume > 0 || volume < 100) {
			this.volume = volume;
		} else {
			this.volume = 1;
		}
	}

	@Override
	public String displayInfo() {
		return String.format("%s - %s - %s - %.2f - %.1f", this.getClass().getSimpleName(), super.getName(),
				super.getBrand(), super.getPrice(), this.getVolume());
	}
}
