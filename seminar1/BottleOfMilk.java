public class BottleOfMilk extends Product {
	private int fat;

	public int getFat() {
		return fat;
	}

	public void setVolume(int fat) {
		checkVolume(fat);
	}

	public BottleOfMilk(String name, String brand, double price, int fat) {
		super(name, brand, price);
		checkVolume(fat);
	}

	private void checkVolume(int fat) {
		if (fat > 0 || fat < 100) {
			this.fat = fat;
		} else {
			this.fat = 1;
		}
	}

	@Override
	public String displayInfo() {
		return String.format("%s - %s - %s - %.2f - %d%%", this.getClass().getSimpleName(), super.getName(),
				super.getBrand(), super.getPrice(), this.getFat());
	}
}