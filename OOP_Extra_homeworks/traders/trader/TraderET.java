package traders.trader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import traders.provider.Product;
import traders.provider.Provider;
import traders.provider.SmallProvider;
import traders.shop.IETt_to;
import traders.shop.Shop;

public class TraderET extends Trader {

	public static final int MAX_NUMBER_OF_PROVIDERS = 5;
	Shop shop;
	ArrayList<SmallProvider> providers = new ArrayList<>();
	ArrayList<Product> products = new ArrayList<>();

	public TraderET(String address, double money, String name) {
		super(address, money, name);
	}

	public Shop getShop() {
		return shop;
	}

	public List<SmallProvider> getProvidersList() {
		return Collections.unmodifiableList(providers);
	}

	public boolean setShop(Shop shop) {
		if (this.shop == null) {
			if (shop instanceof IETt_to) {
				this.shop = shop;
				System.out.println("- ET-trader gets this shop! :)");
				return true;
			} else {
				System.out.println("- This shop is not for an ET-trader!");
				return false;
			}
		}
		System.out.println("- I have allready a shop!");
		return false;
	}

	@Override
	public boolean setProvider(Provider provider) {
		if (this.providers.size() < MAX_NUMBER_OF_PROVIDERS) {
			if (provider instanceof SmallProvider) {
				providers.add((SmallProvider) provider);
				System.out.println(this.name + " has a new provider - " + provider.getName());
				return true;
			}
			System.out.println("This is not a small provider.");
			return false;
		}
		System.out.println(this.name + " has enough suppliers.");
		return false;
	}

	@Override
	public String toString() {
		System.out.println(this.name + " is TRADER-ET:");
		System.out.println("	Money - " + this.money);
		System.out.println("	Shop:");

		if (shop != null) {
			System.out.println("		1-" + shop);
		}

		System.out.println("	Providers:");
		for (int i = 0; i < providers.size(); i++) {
			System.out.println("		" + providers.get(i));
		}
		System.out.println("	Products:");
		for (int i = 0; i < products.size(); i++) {
			System.out.println("		" + products.get(i));
		}

		return "";
	}

}
