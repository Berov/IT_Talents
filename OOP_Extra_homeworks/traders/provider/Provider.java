package traders.provider;

public abstract class Provider {
	String name;
	String address;
	String workingTime;

	public abstract double getDiscount();

	public Provider(String name, String address, String workingTime) {
		if (name.isEmpty() || name == null || address.isEmpty() || address == null || workingTime.isEmpty()
				|| workingTime == null) {

			name = "auto generated provider";
			address = "Slaveikov sq. 1";
			workingTime = "09:00-18:00";

			// TO DO -validate them better way
		}

		this.name = name;
		this.address = address;
		this.workingTime = workingTime;
	}

	@Override
	public String toString() {
		return "Provider [name=" + name + ", address=" + address + ", working time=" + workingTime + "]";
	}

	public String getName(){
		return this.name;
	}
}
