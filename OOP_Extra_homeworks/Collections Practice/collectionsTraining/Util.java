package collectionsTraining;

import java.util.Random;

public abstract class Util {

	static Random r = new Random();

	public static String nameGenerator() {
		String[] firstName = { "George", "Steven", "Michael", "Jim", "John", "Thomas", "Garry", "Marvin", "Tim",
				"Peter", "Walter", "Carl", "Harold", "Joe", "Justin", "Terry", "Samuel", "Brandon", "Harry", "Billy",
				"Jeremy", "Randy", "Carlos", "Martin", "Todd", "Craig", "Alan", "Sean", "Danny" };
		String[] secondName = { "Thomas", "Jones", "Harris", "Young", "Nelson", "Morgan", "Rogers", "Murphy",
				"Peterson", "Foster", "Griffin", "Jordan", "West", "Hamilton", "Gomez", "Gibson", "Simpson", "Daniels",
				"Hudson", "Spencer", "Ray", "Watkins", "Olson", "Bradley", "Fox", "J", "Junior" };
		return firstName[r.nextInt(firstName.length)] + " " + secondName[r.nextInt(secondName.length)];
	}

	public static int intGenerator(int min, int max) {
		return r.nextInt(max - min + 1) + min;
	}

	public static double doubleGenerator(double min, double max) {
		double d;
		do {
			d = r.nextDouble() * (max - min) + min;
		} while (d < min && d > max);
		return r.nextDouble() * (max - min) + min;
	}

	public static boolean trueGenerator() {
		return r.nextBoolean();
	}

	public static String streetGenerator() {
		String[] streetNames = { "Baba Tonka str.", "Vitosha bul.", "Skobelev bul.", "Lale str.", "Bregalnitca str.",
				"Dondukov bul.", "Vasil Levski bul.", "Slivnitsa bul.", "Pozitano str.", "Alabin str.",
				"Han Asparuh str." };
		return streetNames[r.nextInt(streetNames.length)] + " №" + (r.nextInt(150) + 1);
	}

	public static String cityGenerator() {
		String[] cityNames = { "Sofia", "Teteven", "Varna", "Burgas", "Elin Pelin", "Plovdiv", "Etropole", "Gabrovo",
				"Polski Trambezh", "Kiten", "Lovech" };
		return cityNames[r.nextInt(cityNames.length)];
	}

	public static String countryGenerator() {
		String[] countryNames = { "Bulgaria", "Albania", "Serbia", "Italia", "France", "USA", "Canada", "Turkey",
				"Russia", "Monte Negro", "Pakistan" };
		return countryNames[r.nextInt(countryNames.length)];
	}

	
	
	
	
	
	
	
	
}
