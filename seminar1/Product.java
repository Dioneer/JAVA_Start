public class Product {
	private String name;
	private String brand;
	private double price;

	public String displayInfo() {
		return String.format("%s - %s - %.2f", name, brand, price);
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		checkName(name);
	}

	public void setBrand(String brand) {
		checkBrand(brand);
	}

	public void setPrice(double price) {
		checkPrice(price);
	}

	public Product(String name, String brand, double price) {

		checkName(name);
		checkBrand(brand);
		checkPrice(price);
	}

	public Product() {
		this("Noname");
	}

	public Product(String name) {
		this(name, "Noname");
	}

	public Product(String name, String brand) {
		this(name, brand, 100);
	}

	private void checkName(String name) {
		if (name == null || name.length() < 3) {
			this.name = "Noname";
		} else {
			this.name = name;
		}
	}

	private void checkBrand(String brand) {
		if (brand == null || brand.length() < 3) {
			this.brand = "Noname";
		} else {
			this.brand = brand;
		}
	}

	private void checkPrice(Double price) {
		if (price < 100) {
			throw new RuntimeException("incorrect price, must be greater than or equal to 100");
		} else {
			this.price = price;
		}
	}
}
