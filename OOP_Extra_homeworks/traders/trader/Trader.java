package traders.trader;

import java.util.ArrayList;

import traders.provider.Product;
import traders.provider.Provider;

public abstract class Trader implements ITrader {
	String name;
	String address;
	double money;

	public Trader(String address, double money, String name) {
		// TO DO Validate them!!!!
		this.address = address;
		this.money = money;
		this.name = name;
	}

	@Override
	public ArrayList<Product> makeOrder(double sum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getDaylyTurnover() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void payTaxes() {
		// TODO Auto-generated method stub

	}

	public abstract boolean setProvider(Provider provider);
}
