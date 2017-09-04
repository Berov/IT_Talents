package enums;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Random;

public class demo {

	enum Vid {

		WEDDING("сватбена", 35), KID("детска", 15), SPECIAL("специална", 55), CADET("за \'кадети\'", 124);

		private String s;
		private int price;

		Vid(String s, int price) {
			this.s = s;
			this.price = price;
		}

		public int getPrice() {
			return this.price;
		}

		public String getVid() {
			return this.s;
		}
	};

	enum Type {
		SIROPIRANA(4, "сиропирана"), GLAZIRANA(9, "глазирана"), SHOCOLADE(13,"шоколадова");
		int overPrice;
		String type;

		Type(int overPrice, String type) {
			this.overPrice = overPrice;
			this.type = type;
		}

		public int getPrice() {
			return this.overPrice;
		}

		public String getType() {
			return this.type;
		}
	};

	public static void main(String[] args) {

		HashMap<Vid, HashMap<Type, LinkedList<Torta>>> nalichnost = new HashMap<>();// склад(витрина)
		HashMap<Vid, HashMap<Type, Torta>> catalog = new HashMap<>(); // каталог-торти

		// създаваме торти
		for (int i = 0; i < 50; i++) {
			Torta torta = new Torta(Vid.values()[new Random().nextInt(Vid.values().length)],
					Type.values()[new Random().nextInt(Type.values().length)]);
			// добавяне в наличността/склада/витрината
			if (!nalichnost.containsKey(torta.getVid())) {
				nalichnost.put(torta.getVid(), new HashMap<Type, LinkedList<Torta>>());
			}
			if (!(nalichnost.get(torta.getVid()).containsKey(torta.getType()))) {
				nalichnost.get(torta.getVid()).put(torta.getType(), new LinkedList<Torta>());
			}
			nalichnost.get(torta.getVid()).get(torta.getType()).add(torta);

			// добавяме в каталога - ако липсва такава
			if (!catalog.containsKey(torta.getVid())) {
				catalog.put(torta.getVid(), new HashMap<Type, Torta>());
			}
			if (!catalog.get(torta.getVid()).containsKey(torta.getType())) {
				catalog.get(torta.getVid()).put(torta.getType(), torta);
			}

		}

		printCatalog(catalog);
		printNalichnost(nalichnost);

	}

	static void printCatalog(HashMap<Vid, HashMap<Type, Torta>> catalog) {
		System.out.println("КАТАЛОГА НИ С ТОРТИ:");
		System.out.println("----начало на каталога----");
		for (Entry<Vid, HashMap<Type, Torta>> e : catalog.entrySet()) {
			System.out.println(e.getKey().getVid() + ":");
			for (Entry<Type, Torta> e2 : e.getValue().entrySet()) {
				System.out.println("   " + e2.getKey().getType() + " - " + e2.getValue().getPrice() + " лв.");
			}
		}
		System.out.println("-----край на каталога-----");
		System.out.println();
	}

	static void printNalichnost(HashMap<Vid, HashMap<Type, LinkedList<Torta>>> nalichnost) {
		System.out.println("ТОРТИТЕ В НАЛИЧНОСТ:");
		System.out.println("----начало на наличност----");
		for (Entry<Vid, HashMap<Type, LinkedList<Torta>>> e : nalichnost.entrySet()) {
			System.out.println(e.getKey().getVid() + ":");
			for (Entry<Type, LinkedList<Torta>> e2 : e.getValue().entrySet()) {
				System.out.println("   " + e2.getKey().getType() + " - " + e2.getValue().size() + " бр.");
			}
		}
		System.out.println("-----край на наличност-----");
		System.out.println();
	}

}
