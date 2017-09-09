package order;

import java.util.Random;

public class OrdinaryOrder extends Order {

	private int time; // min

	public OrdinaryOrder(double price, int tableNumber, int numberOfClients, int minutes) {
		super(price, tableNumber, numberOfClients);
		if (minutes < 1) {
			minutes = new Random().nextInt(120) + 1;
		}
		this.time = minutes;
	}

}
