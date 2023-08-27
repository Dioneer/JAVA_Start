import java.util.ArrayList;
import java.util.List;

public class Programm {
	public static void main(String[] args) {
		Product product = new Product("Snikers", "Mars", 100);
		System.out.println(product.displayInfo());
		Product product1 = new Product(null, "asdasd", 200);
		System.out.println(product1.displayInfo());
		Product product2 = new Product("");
		System.out.println(product2.displayInfo());
		BottleOfWater bottleOfWater = new BottleOfWater("Svyatoy", "Istochnik", 105, 1.5);
		System.out.println(bottleOfWater.displayInfo());
		BottleOfMilk bottleOfMilk = new BottleOfMilk(null, "V_derevne", 105, 25);
		System.out.println(bottleOfMilk.displayInfo());
		// ===============================================================================
		Product bottleOfMilk2 = new BottleOfMilk(null, null, 100, 3);
		Product bottleOfMilk1 = new BottleOfMilk("Milk", "Milk", 200, 6);
		Product bottleOfWater1 = new BottleOfWater("Voda", "Reka", 100, 1);
		Product bottleOfWater2 = new BottleOfWater(null, null, 100, 3);
		Product bottleOfWater3 = new BottleOfWater("Rich", "Rich", 100, 2);

		List<Product> list = new ArrayList<Product>();
		list.add(bottleOfMilk1);
		list.add(bottleOfMilk2);
		list.add(bottleOfWater1);
		list.add(bottleOfWater2);
		list.add(bottleOfWater3);

		VendigMachine vendigMachine = new VendigMachine(list);
		BottleOfWater bottleOfWaterRes = vendigMachine.getBottleOfWater("Voda", 1);
		if (bottleOfWaterRes != null) {
			System.out.println("Take your:");
			System.out.println(bottleOfWaterRes.displayInfo());
		} else {
			System.out.println("There is not water in the vendingmachine");
		}
	}
}
