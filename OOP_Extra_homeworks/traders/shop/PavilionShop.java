package traders.shop;

public class PavilionShop extends Shop implements ITU_to, IETt_to{

	public PavilionShop(String address, String workingTime, int shopArea) {
		super(address, workingTime, shopArea, 50);
	}

}
