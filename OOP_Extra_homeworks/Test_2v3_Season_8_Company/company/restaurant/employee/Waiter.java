package company.restaurant.employee;

import java.util.HashSet;

import order.Order;

public abstract class Waiter extends Employee {
	// protected int numberOfOrders = 0;
	// protected int numberOfErrors = 0;

	protected HashSet<Order> wrongOrders = new HashSet<Order>();
	protected HashSet<Order> finishedOrders = new HashSet<Order>();
	protected HashSet<Order> newOrders = new HashSet<Order>();

	public Waiter(String name, double salary) {
		super(name, salary);
	}

	public abstract boolean doOrder(Order order); // parameter???
	
	
}
