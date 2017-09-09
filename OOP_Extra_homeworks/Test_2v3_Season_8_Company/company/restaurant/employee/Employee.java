package company.restaurant.employee;

import company.Company.RegionalManager;
import company.Company.StuffManager;

public abstract class Employee {
	private static int ID=0;
	protected int personalID;
	protected String name;
	protected double salary; //month salary
	protected double cash;

	public Employee(String name, double salary) {
		// TO DO validate!
		this.name = name;
		this.salary = salary;
		this.personalID=ID++;
	}

	public abstract void printReport();

	public abstract void printProfit();

	@Override
	public String toString() {
		System.out.print("			" + name + ", month salary=" + salary);
		if (this instanceof SeniorWaiter) {
			System.out.println(" - senior waiter");
			return "";
		}
		if (this instanceof NormalWaiter) {
			System.out.println(" - waiter");
			return "";
		}
		if (this instanceof JuniorWaiter) {
			System.out.println(" - junior waiter");
			return "";
		}
		
		if (this instanceof StuffManager) {
			System.out.println(" - Stuff Manager");
			return "";
		}

		if (this instanceof RegionalManager) {
			System.out.println(" - Regional Manager");
			return "";
		}

		System.out.println(" - unknown stuff position");
		return "";
	}

}
