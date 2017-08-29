package mostCommonLetters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

/*Да се напише конзолно приложение, което показва списък с най-често срещаните букви
в даден текст, въведен от потребителя. Програмата да извежда статистическа
информация за честотата на срещане на буквите, като не се прави разлика между
големи и малки букви. Буквите да са подредени по честотата на срещане в текста. На
всеки ред да се изписва буквата, броя на срещанията, както и графика, която да
илюстрира процента на срещания (чрез символа „#”).
*/

public class demo {

	public static void main(String[] args) {
		String enteredString;
		String editedString = "";
		Scanner sc = new Scanner(System.in);

		// Enter a phrase and validate it
		do {System.out.println("Enter a valide string with characters:");
			enteredString = sc.nextLine().trim().toUpperCase();
		} while (enteredString == null || enteredString.isEmpty() || !(enteredString.matches(".*[A-Z].*") || enteredString.matches(".*[А-Я].*")));

		// Cleaning from unwonted characters
		for (int i = 0; i < enteredString.length(); i++) {
			if (enteredString.substring(i, i + 1).matches("[A-Z]") || enteredString.substring(i, i + 1).matches("[А-Я]")) {
				editedString = editedString + enteredString.substring(i, i + 1);
			}
		}

		// put chars in a collection (HashMap???)
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < editedString.length(); i++) {
			Character ch = editedString.charAt(i);
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}

		// put old collection in a new one - ArrayList<Entry>
		ArrayList<Entry<Character, Integer>> al = new ArrayList<Entry<Character, Integer>>();
		Iterator<Entry<Character, Integer>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Character, Integer> temp = it.next();
			al.add(temp);
		}

		// Sort list
		Collections.sort(al, new Comparator<Entry<Character, Integer>>() {
			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				if (o1.getValue() == o2.getValue()) {
					return o1.getKey().compareTo(o2.getKey());
				}
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		// Print list with percents
		int percent = editedString.length() / 100;
		if (editedString.length() <= 100) {
			percent = 100 / editedString.length();
		}

		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i).getKey() + ": " + al.get(i).getValue() + " ");
			for (int j = 0; j < al.get(i).getValue() * percent; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

		sc.close();
	}

}
