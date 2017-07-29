package InstanceOfTest;

public class NaEdro extends Dostavchik {
	private int otstupka = 15;

	public NaEdro(String name, int age) {
		super(name, age);
		System.out.println(name + " е доставчик на едро и има отстъпка " + otstupka);
	}
}
