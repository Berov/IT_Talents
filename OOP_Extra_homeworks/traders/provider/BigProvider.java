package traders.provider;

public class BigProvider extends Provider {

	private static final int PROVIDER_DISCOUNT = 15;

	public BigProvider(String name, String address, String workingTime) {
		super(name, address, workingTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return PROVIDER_DISCOUNT;
	}

}
