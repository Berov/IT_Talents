package traders.shop;

import java.util.ArrayList;

import traders.provider.Product;

public abstract class Shop {

	String address;
	String workingTime;
	int shopArea;
	double tax;
	double money;
	ArrayList<Product> products;

	public Shop(String address, String workingTime, int shopArea, double tax) {
		// TO DO validate them!!!
		this.address = address;
		this.workingTime = workingTime;
		this.shopArea = shopArea;
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Shop [address: " + address + ", working time: " + workingTime + ", shop area=" + shopArea + ", taxes-" + tax
				+ ", shop money=" + money + "]";
	}

}
