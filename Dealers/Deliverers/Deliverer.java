package Deliverers;

import java.util.Random;

public class Deliverer {
	private static int ID = 0;
	private int PersonalNumber;
	private String name;
	private String address;
	private String workingTime;
	private int discount = 0;
	private boolean isABigDealer;
	//private Stock[] stocks;

	private String[] delivererNames = { "Кака Радка", "Млекокомбина Дядо Пешо", "Татко готви сладко",
			"Месокомбинат Цеца", "Парфюми Лора" };
	private String[] delivererAddresses = { "ул. Бигла", "ул. Църноок", "бул. Скобелев", "пл. Славейков",
			"бул. Цар Борис" };

	public Deliverer(boolean isABigDealer) {
		this.name = delivererNames[new Random().nextInt(delivererNames.length)] + " - " + ID;
		this.address = delivererAddresses[new Random().nextInt(delivererAddresses.length)] + " №"
				+ new Random().nextInt(120);
		this.workingTime = new Random().nextInt(12) + "-" + (new Random().nextInt(12) + 12);
		if (isABigDealer) {
			this.discount = 15;
		}
		this.isABigDealer = isABigDealer;
		this.PersonalNumber = Deliverer.ID;
		ID++;
	}

	// TODO премахни този метод!!!
	public void printDelivererInfo() {
		System.out.print("Доставчик ID=" + this.PersonalNumber + " - " + this.name + ", Адрес:" + this.address
				+ " раб. време:" + this.workingTime + " отстъпка:" + discount + "%");
		if (isABigDealer) {
			System.out.println(" - доставчик на едро");
		} else {
			System.out.println(" - доставчик на дребно");

		}
		
		//generate stocks?
	}
}
