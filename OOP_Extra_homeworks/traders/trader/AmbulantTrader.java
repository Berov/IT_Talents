package traders.trader;

import java.util.ArrayList;

import traders.provider.Product;
import traders.provider.Provider;
import traders.provider.SmallProvider;

public class AmbulantTrader extends Trader {
	SmallProvider provider;
	ArrayList<Product> products = new ArrayList<>();

	public AmbulantTrader(String address, double money, String name) {
		super(address, money, name);
	}

	public SmallProvider getProvider() {
		return provider;
	}

	@Override
	public boolean setProvider(Provider provider) {
		if (this.provider == null) {
			if (provider instanceof SmallProvider) {
				this.provider = (SmallProvider) provider;
				System.out.println(this.name + " has a new provider - " + this.provider.getName());
				return true;
			}
			System.out.println("This is not a small provider!");
			return false;
		}
		System.out.println(this.name + " already has a provider.");
		return false;
	}

	@Override
	public String toString() {
		System.out.println(this.name + " is AMBULANT TRADER:");
		System.out.println("	Money - " + this.money);
		System.out.println("	Shops: never in my life!");
		System.out.println("	Providers:");
		if (provider != null) {
			System.out.println("		" + provider);
		}
		System.out.println("	Products:");
		for (int i = 0; i < products.size(); i++) {
			System.out.println("		" + products.get(i));
		}

		return "";
	}

}
