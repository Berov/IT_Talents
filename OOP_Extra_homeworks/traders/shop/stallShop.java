package traders.shop;

import java.util.ArrayList;
import traders.provider.Product;

public class stallShop extends Shop implements IETt_to {
	

	public stallShop(String address, String workingTime, int shopArea) {
		super(address, workingTime, shopArea, 50);
	}

}
