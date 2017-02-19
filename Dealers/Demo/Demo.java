package Demo;

import java.util.ArrayList;

import java.util.Random;
import CommercialObjects.CommercialObject;
import CommercialObjects.MallStore;
import CommercialObjects.MarketStand;
import CommercialObjects.StreetStand;
import Dealers.Dealer;
import Dealers.StreetVendor;
import Deliverers.Deliverer;

public class Demo {
	public static ArrayList<CommercialObject> comercialObjects = new ArrayList<>();
	public static ArrayList<Deliverer> deliverers = new ArrayList<>();

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) { // създаваме 10 доставчика
			deliverers.add(new Deliverer(new Random().nextBoolean()));
			// deliverers.get(i).printDelivererInfo();
			// TODO да се промени изписването на слагане в колекция!!
		}

		for (int i = 0; i < 20; i++) { // създаваме 20 търговски обекта
			comercialObjects.add(new MallStore());
			// comercialObjects.get(i).printInfo();
			// Да се промени изписването в слагане в колекция
		}

		Dealer vendor = new StreetVendor("Гошо ЕТ", "София, ул Гутгулят 24", 200.0);
		vendor.addCommercialObject(null);
		 System.out.println(vendor);

		for (int i = 0; i < comercialObjects.size(); i++) {
			comercialObjects.get(i).printInfo();
		}

	}

}
