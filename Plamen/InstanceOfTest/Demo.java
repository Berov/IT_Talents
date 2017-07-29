package InstanceOfTest;

public class Demo {

	public static void main(String[] args) {
		Dostavchik Dostavchik = new NaDrebno("Гого - дребния", 23);

		checkEdroDrebno(Dostavchik);
		Dostavchik = new NaEdro("Шишо - едрото", 55);
		checkEdroDrebno(Dostavchik);

	}

	static void checkEdroDrebno(Dostavchik d) {
		if (d instanceof NaDrebno) {
			System.out.println(d.name + " е доставчик на дребно..");
		} else if (d instanceof NaEdro) {
			System.out.println(d.name + " е доставчик на едро..");
		}
	}
}
