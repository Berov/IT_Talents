package order;

import java.util.Random;

public abstract class Order {
	private static int ID = 0;
	private int orderName;
	private double price;
	private int tableNumber;
	private int numberOfClients; // 1-30

	public Order(double price, int tableNumber, int numberOfClients) {
		if (price < 0 || tableNumber < 1 || numberOfClients < 1) {
			price = new Random().nextDouble() * 50 + 5;
			tableNumber = new Random().nextInt(20) + 1;
			numberOfClients = new Random().nextInt(30) + 1;
			this.orderName = ID++;
		}
		this.price = price;
		this.tableNumber = tableNumber;
		this.numberOfClients = numberOfClients;
	}

	public int getName() {
		return this.orderName;
	}

}
