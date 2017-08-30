package plamenTask;

import java.util.Scanner;

public class Country {
	private String name;
	private String continent;
	private String capital;
	private int capitalArea;

	public Country(String name, String capital, int capitalArea, String continent) {
		while (capital.isEmpty() || capital == null || capitalArea <= 0 || continent.isEmpty() || continent == null || name.isEmpty() || name == null) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a valide name of the country:");
			name = sc.nextLine();

			System.out.println("Enter a valide name of the capital of " + name + ":");
			capital = sc.nextLine();

			System.out.println("Enter a valide name of the continent of " + name + ":");
			continent = sc.nextLine();
			sc.reset();

			System.out.println("Enter a valide area of the " + name + "'s capital:");
			capitalArea = sc.nextInt();
			sc.reset();
		}
		this.name = name;
		this.capital = capital;
		this.capitalArea = capitalArea;
		this.continent = continent;
		System.out.println("There is a new country on the World - " + this.name);
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + ", capitalArea=" + capitalArea + "]";
	}

	public String getCapital() {
		return capital;
	}

	public double getCapitalArea() {
		return capitalArea;
	}

	public String getContinent() {
		return this.continent;
	}

	public String getName() {
		return this.name;
	}
}
