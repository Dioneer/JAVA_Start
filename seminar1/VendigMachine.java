import java.util.List;

public class VendigMachine {
	private List<Product> product;

	public VendigMachine(List<Product> product) {
		this.product = product;
	}

	public BottleOfWater getBottleOfWater(String name, double volume) {
		for (Product item : product) {
			if (item instanceof BottleOfWater) {
				BottleOfWater bottleOfWater = (BottleOfWater) item;
				if (item.getName().equals(name) && bottleOfWater.getVolume() == volume) {
					return bottleOfWater;
				}
			}
		}
		return null;
	}
}