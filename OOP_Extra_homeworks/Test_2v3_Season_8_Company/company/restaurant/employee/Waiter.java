package company.restaurant.employee;

public abstract class Waiter extends Employee {
	protected int numberOfOrders = 0;
	protected int numberOfErrors = 0;

	public Waiter(String name, double salary) {
		super(name, salary);
	}

	public abstract void doOrders(); //parameter???
}
