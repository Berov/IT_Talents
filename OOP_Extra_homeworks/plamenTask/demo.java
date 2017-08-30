package plamenTask;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class demo {

/*
Информационна карта

Да се създаде информационна карта с правилно подбрана колекция!
Всяка карта има име на континент, списък с държавите в него и за
всяка държава се пази столицата и площта на столицата.

1)Да се създаде метод, който добавя континент, заедно с държавите,
столиците и площта на столиците
     ======= Поради промяна на идеята за реализация на задачата само с колекции - променям тази точка на:
          а) да има метод за добавяне на континент на картата
          б) да има метод(и) за добавяне на държава на картата


2)Цялата колекция да се презапише в TreeMap и да се изведе на екрана (какво се промени?)

3)Да се създаде метод, който приема име на континент и да се изведе на екрана
всички държави с техните столици в този континент
на екрана (подредени по име на столицата от Z до A)

4)Да се създаде метод, който приема име на държава и
премахва тази държава от колекцията
*/

	public static void main(String[] args) {

		HashMap<String, HashSet<Country>> world = new HashMap<>(); // The world
																	// map

		Country bulgaria = new Country("Bulgaria", "Sofia", -25, "Europe");

		world.put("Asia", new HashSet<>());
		System.out.println("The World map:\n   " + world);
		addContinent("Asia", world);
		addContinent("Europe", world);
		addContinent("Africa", world);
		System.out.println("===============1==============");

		System.out.println("The World map:\n   " + world);
		System.out.println("===============2==============");

		addCountry("Albania", world);
		System.out.println("The World map:\n   " + world);
		System.out.println("===============3==============");

		addCountry(bulgaria, world);
		System.out.println("The World map:\n   " + world);
		System.out.println("===============4==============");

	}

	static void addContinent(String continent, HashMap<String, HashSet<Country>> world) {
		if (world.containsKey(continent)) {
			System.out.println("That continent exists already!");
			return;
		}
		HashSet<Country> newContinent = new HashSet<Country>();
		world.put(continent, newContinent);
		System.out.println("On the World exists a new continent - " + continent);
	}

	static void addCountry(Country country, HashMap<String, HashSet<Country>> world) {
		// If that country exists on the world map - stop adding
		for (Entry<String, HashSet<Country>> e : world.entrySet()) {
			for (Country e2 : e.getValue()) {
				if (e2.getName().equals(country.getName())) {
					System.out.println("This country already exists on the World map! Can't add it! Sorry!");
					return;
				}
			}
		}

		// If the country's continent doesn't exist - create it
		boolean hasContinentOnTheWorld = false;
		for (Entry<String, HashSet<Country>> e : world.entrySet()) {
			if (e.equals(country.getContinent())) {
				hasContinentOnTheWorld = true;
				break;
			}
		}
		if (!hasContinentOnTheWorld) {
			addContinent(country.getContinent(), world);
		}

		// adding the country on the world map
		world.get(country.getContinent()).add(country);
	}

	static void addCountry(String country, HashMap<String, HashSet<Country>> world) {
		// If that country exists on the world map - stop adding
		for (Entry<String, HashSet<Country>> e : world.entrySet()) {
			for (Country e2 : e.getValue()) {
				if (e2.getName().equals(country)) {
					System.out.println("This country already exists on the World map! Can't add it! Sorry!");
					return;
				}
			}
		}

		// If the country doesn't exist - creates the country
		Country newCountry = new Country(country, "", 0, "");

		// If the country's continent doesn't exist - creates a new continent
		boolean hasContinentOnTheWorld = false;
		for (Entry<String, HashSet<Country>> e : world.entrySet()) {
			if (e.equals(newCountry.getContinent())) {
				hasContinentOnTheWorld = true;
				break;
			}
		}
		if (!hasContinentOnTheWorld) {
			addContinent(newCountry.getContinent(), world);
		}

		// adding the country on the world map
		world.get(newCountry.getContinent()).add(newCountry);
	}

	static void printContinent(String continent) {
		// TO DO
	}

	static void printWorldMap() {
		// TO DO
	}

	static void removeCountryFromMap() {
		// TO DO
	}
	
}
