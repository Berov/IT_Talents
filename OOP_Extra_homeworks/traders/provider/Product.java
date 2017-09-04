package traders.provider;

public class Product implements Comparable<Product> {

	private double price;
	private String name;

	public Product(double price, String name) {
		if (price < 0 || name.isEmpty() || name == null) {
			name = "auto generated product";
			price = 2.2;
			// TO DO validate it with a scanner...
		}
		this.price = price;
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Product o) {
		if (this.price > o.price) {
			return 1;
		}
		if (this.price < o.price) {
			return -1;
		}
		return this.name.compareTo(o.name);
	}

}
