package company.restaurant.employee;

public abstract class Manager extends Employee {

	public Manager(String name, double salary) {
		super(name, salary);
	}

	public String getName() {
		return this.name;
	}
}
