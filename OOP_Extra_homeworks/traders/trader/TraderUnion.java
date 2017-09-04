package traders.trader;

import java.util.ArrayList;
import traders.provider.Product;
import traders.provider.Provider;
import traders.shop.ITU_to;
import traders.shop.Shop;

public class TraderUnion extends Trader {
	public static final int MAX_NUMBER_OF_SHOPS = 10;
	public static final int MAX_NUMBER_OF_PROVIDERS = 15;
	ArrayList<Shop> shops = new ArrayList<>(); // 15 max
	ArrayList<Provider> providers = new ArrayList<>();
	ArrayList<Product> products = new ArrayList<>(); // 15 max

	public TraderUnion(String address, double money, String name) {
		super(address, money, name);
	}

	public boolean setShop(Shop shop) {
		if (this.shops.size() < MAX_NUMBER_OF_SHOPS) {
			if (shop instanceof ITU_to) {
				this.shops.add(shop);
				System.out.println("- Trader Union gets this shop!");
				return true;
			}
			System.out.println("- It's not a shop for big company like us!");
			return false;
		}
		System.out.println("- We have too many shops...");
		return false;
	}

	@Override
	public boolean setProvider(Provider provider) {
		if (this.providers.size() < 15) {
			providers.add(provider);
			System.out.println(this.name + " has a new provider - " + provider.getName());
			return true;
		}
		System.out.println(this.name + " has enough suppliers.");
		return false;
	}

	@Override
	public String toString() {
		System.out.println(this.name + " is TRADER UNION:");
		System.out.println("	Money - " + this.money);
		System.out.println("	Shops:");
		for (int i = 0; i < shops.size(); i++) {
			System.out.println("		" + (i + 1) + "-" + shops.get(i));
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
