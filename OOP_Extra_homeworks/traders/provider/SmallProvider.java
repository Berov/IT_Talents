package traders.provider;

public class SmallProvider extends Provider {

	public SmallProvider(String name, String address, String workingTime) {
		super(name, address, workingTime);
	}

	@Override
	public double getDiscount() {
		return 0;
	}

}
