package demo;

import java.util.Random;

public class Util {
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

	public static String documentGenerator() {
		String[] name = { "Application", "Catch up", "Conviction", "Order", "Research", "Letter", "Request" };
		return name[r.nextInt(name.length)];
	}

}
