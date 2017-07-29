package InstanceOfTest;

public class Demo {

	public static void main(String[] args) {
		helper help = new helper();// създаваме обект от тип helper и метода е  достъпен

		Dostavchik Dostavchik = new NaDrebno("Гого - дребния", 23);

		help.checkEdroDrebno(Dostavchik);

		Dostavchik = new NaEdro("Шишо - едрото", 55);

		help.checkEdroDrebno(Dostavchik);

		staticHelper.checkEdroDrebno(Dostavchik); // метода е достъпен и без обект, понеже сме го направили static...

	}

	// static void checkEdroDrebno(Dostavchik d) {
	// if (d instanceof NaDrebno) {
	// System.out.println(d.name + " е доставчик на дребно..");
	// } else if (d instanceof NaEdro) {
	// System.out.println(d.name + " е доставчик на едро..");
	// }
	// }
}
