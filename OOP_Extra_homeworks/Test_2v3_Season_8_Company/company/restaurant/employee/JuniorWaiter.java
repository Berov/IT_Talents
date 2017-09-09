package company.restaurant.employee;

import order.Order;

public class JuniorWaiter extends Waiter {

	public JuniorWaiter(String name, double salary) {
		super(name, salary);
	}

	public void transferOrderToOther() { // argument?
		// TO DO
	}



	@Override
	public void printReport() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printProfit() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean doOrder(Order order) {
		// TODO Auto-generated method stub
		
		System.out.println(this.name +" accept the order - "+ order.getName());
		return true;
	}

}
