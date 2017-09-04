package traders.demo;

import java.util.Random;

public abstract class Util {
	static Random r = new Random();

	public static String providerNames() {
		String[] names = { "Kaka Siyka Ltd.", "Gosho Inc.", "Pena & fans.", "Home Cleaning", "Metal Construction Ltd.",
				"Pri Bate Pesho", "Sladka Radka corp.", "Dvete Kaki", "Master Trichko.", "Hamallia", "Bachkanie" };
		return names[r.nextInt(names.length)] + "-" + (r.nextInt(2017 - 1991) + 1991);
	}

	public static String streetGenerator() {
		String[] streetNames = { "Baba Tonka str.", "Vitosha bul.", "Skobelev bul.", "Lale str.", "Bregalnitca str.",
				"Dondukov bul.", "Vasil Levski bul.", "Slivnitsa bul.", "Pozitano str.", "Alabin str.",
				"Han Asparuh str." };
		return streetNames[r.nextInt(streetNames.length)] + " №" + (r.nextInt(150) + 1);
	}

	public static String workingTimeGenerator() {
		return r.nextInt(12) + ":00-" + (r.nextInt(12) + 12) + ":00";
	}
}
