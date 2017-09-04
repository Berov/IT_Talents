package traders.demo;

import java.util.ArrayList;
import java.util.Random;

import traders.provider.BigProvider;
import traders.provider.Provider;
import traders.provider.SmallProvider;
import traders.shop.MallShop;
import traders.shop.PavilionShop;
import traders.shop.Shop;
import traders.shop.stallShop;
import traders.trader.AmbulantTrader;
import traders.trader.Trader;
import traders.trader.TraderET;
import traders.trader.TraderUnion;

public class demo {

	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Trader> traders = new ArrayList<>();
		ArrayList<Provider> providers = new ArrayList<>();
		ArrayList<Shop> shops = new ArrayList<>();
		int random;
		// Point 1 - Create 10 random providers
		for (int i = 0; i < 10; i++) {
			Provider provider;
			if (new Random().nextBoolean()) {
				provider = new SmallProvider(Util.providerNames(), Util.streetGenerator(), Util.workingTimeGenerator());
			} else {
				provider = new BigProvider(Util.providerNames(), Util.streetGenerator(), Util.workingTimeGenerator());
			}
			providers.add(provider);
		}

		// print created providers
		System.out.println("CREATED PROVIDERS:");
		for (int i = 0; i < providers.size(); i++) {
			System.out.print(" " + providers.get(i));
			if (providers.get(i) instanceof SmallProvider) {
				System.out.println("====> small provider");
			}
			if (providers.get(i) instanceof BigProvider) {
				System.out.println("====> big provider");
			}
		}
		System.out.println();

		// Point 2 - Create 20 random trading objects(shops)
		for (int i = 0; i < 20; i++) {
			Shop shop = null;
			switch (new Random().nextInt(3)) {
			case 0:
				shop = new MallShop(Util.streetGenerator(), Util.workingTimeGenerator(), new Random().nextInt(90) + 10);
				break;
			case 1:
				shop = new PavilionShop(Util.streetGenerator(), Util.workingTimeGenerator(),
						new Random().nextInt(2) + 4);
				break;
			case 2:
				shop = new stallShop(Util.streetGenerator(), Util.workingTimeGenerator(), new Random().nextInt(8) + 2);
				break;
			}
			shops.add(shop);
		}

		// print created shops
		System.out.println("CREATED SHOPS:");
		for (int i = 0; i < shops.size(); i++) {
			System.out.print(" " + shops.get(i));
			if (shops.get(i) instanceof stallShop) {
				System.out.println("===> stall shop");
			}
			if (shops.get(i) instanceof PavilionShop) {
				System.out.println("===> pavilion");
			}
			if (shops.get(i) instanceof MallShop) {
				System.out.println("===> Mall");
			}
		}
		System.out.println();

		// Point 3 Create amublant trader-100lv, ET-500lv, chain store-3000lv
		AmbulantTrader pesho = new AmbulantTrader(Util.streetGenerator(), 100.0, "Pesho");
		traders.add(pesho);

		TraderET etGosho = new TraderET(Util.streetGenerator(), 500.0, "Gosho ET");
		traders.add(etGosho);

		TraderUnion jumbo = new TraderUnion(Util.streetGenerator(), 3000.0, "Jumbo");
		traders.add(jumbo);

		// add supliers to the traders
		System.out.println("WHO WONTS TO BE A TRADER:");
		do {
			addProviderToTrader(pesho, providers);
		} while (pesho.getProvider() == null);

		random = r.nextInt(TraderET.MAX_NUMBER_OF_PROVIDERS);
		do {
			for (int i = 0; i < random; i++) {
				addProviderToTrader(etGosho, providers);
			}
		} while (etGosho.getProvidersList().size() <= 0);

		random = r.nextInt(TraderUnion.MAX_NUMBER_OF_PROVIDERS);
		for (int i = 0; i < random; i++) {
			addProviderToTrader(jumbo, providers);
		}
		System.out.println();
		
		// print created traders
		System.out.println("CREATED TRADERS:");
		for (int i = 0; i < traders.size(); i++) {
			System.out.println(traders.get(i));
		}

		// Point 4 - Offers shops at random
		System.out.println("========== STATE SHOPS AUCTION STARTS ==========");
		while (etGosho.getShop() == null) {
			Shop shopForSale = shops.get(new Random().nextInt(shops.size()));
			System.out.println("The country offers to ET the shop: " + shopForSale);
			if (etGosho.setShop(shopForSale)) {
				shops.remove(shopForSale);
			}
		}
		int stateDecision = r.nextInt((shops.size() - 2) + 2); // :)
		for (int i = 0; i < stateDecision; i++) {
			Shop shopForSale = shops.get(new Random().nextInt(shops.size()));
			System.out.println("The state offers to Trader Union the shop: " + shopForSale);
			if (jumbo.setShop(shopForSale)) {
				shops.remove(shopForSale);
			}
		}
		System.out.println("===== FINALLY =====");
		for (int i = 0; i < traders.size(); i++) {
			System.out.println(traders.get(i));
		}
		System.out.println("The state has " + shops.size() + " shops more for vending...");
		System.out.println("========== END OF STATE SHOP AUCTION ==========");

		// Point 5 - work
		work(traders);

	}

	private static void addProviderToTrader(Trader trader, ArrayList<Provider> providers) {

		if (trader instanceof AmbulantTrader) {
			trader.setProvider(providers.get(new Random().nextInt(providers.size())));
		}
		if (trader instanceof TraderET) {
			trader.setProvider(providers.get(new Random().nextInt(providers.size())));
		}
		if (trader instanceof TraderUnion) {
			trader.setProvider(providers.get(new Random().nextInt(providers.size())));
		}
	}

	private static void work(ArrayList<Trader> traders) {
		/*
		 * Всеки търговец може да изпълнява следните действия: • да прави
		 * поръчка на определена стойност към доставчик. Поръчката не може да
		 * надвишава 50% от капитала на търговеца. Ако доставчика направи
		 * отстъпка, разликата в парите да се върне обратно на търговеца. При
		 * поръчка на стоки от доставчик, търговеца приема в търговския обект
		 * списък с произволно генериран брой продукти, като всеки продукт има
		 * наименование и произволна цена между 5 и 15 лева. Общата цена на
		 * продуктите представлява стойността на доставката. • да прибира оборот
		 * от търговския обект – 130% от стойността на поръчаните стоки.
		 * (дефакто търговците имат 30% надценка). Оборотът представлява
		 * печалбата от произволен брой продадени артикули. • да плаща данъци на
		 * държавата за съответния търговски обект.
		 */

		// ◦ поръчка на стоки от доставчик за всеки търговски обект. Да се
		// извежда
		// на екрана списъка със стоки, сортиран по цена в нарастващ ред.

		// ◦ прибиране на оборот от всеки търговски обект – да се извежда на
		// екрана общата сума на печалбата. След продажба списъкът с
		// останалите стоки в магазина трябва отново да е сортиран по цена.

		// ◦ плащане на месечен данък към държавата за всеки търговски обект.

	}
}
