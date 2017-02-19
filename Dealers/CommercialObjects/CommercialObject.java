package CommercialObjects;

import java.util.Arrays;
import java.util.Random;

public abstract class CommercialObject {
	private static int ID = 0;
	private String address;
	private String workingTime;
	private int area;
	private int bulstat;

	private int tax;
	private String[] tradingObjectAddresses = { "ул. Бигла", "ул. Църноок", "бул. Скобелев", "пл. Славейков",
			"бул. Цар Борис" };

	public CommercialObject(int area, int tax) {
		this.address = tradingObjectAddresses[new Random().nextInt(tradingObjectAddresses.length)] + " №"
				+ (new Random().nextInt(200));
		this.workingTime = new Random().nextInt(12) + "-" + (new Random().nextInt(12) + 12);
		this.area = area;
		this.tax = tax;
		bulstat = ID;
		ID++;
	}

	public void printInfo() {
		System.out.println("Търговски обект - " + "булстат=" + this.getBulstat() + " адрес: " + this.address
				+ " раб. време: " + this.workingTime + " площ-" + this.getArea() + " данък-" + this.getTax());
	}

	@Override
	public String toString() {
		return "CommercialObject [address=" + address + ", workingTime=" + workingTime + ", area=" + area + ", bulstat="
				+ bulstat + ", tax=" + tax + ", tradingObjectAddresses=" + Arrays.toString(tradingObjectAddresses)
				+ "]";
	}

	public int getBulstat() {
		return bulstat;
	}

	public String getAddress() {
		return address;
	}

	public String getWorkingTime() {
		return workingTime;
	}

	public String[] getTradingObjectAddresses() {
		return tradingObjectAddresses;
	}

	public int getArea() {
		return area;
	}

	public int getTax() {
		return tax;
	}

}
