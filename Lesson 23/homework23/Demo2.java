package homework23;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo2 {

	public static void main(String[] args) {
		int charCounter = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some text in Latin letters please!");
		String myText = sc.nextLine();

		TreeMap<String, String> rawStringToMap = new TreeMap<String, String>();

		for (int i = 0; i < myText.length(); i++) {
			// Works only with Latin letters!!!
			if (charOutOfRange(myText, i)) {
				continue;
			}
			charCounter++;
			String buildingString = new String();
			if (rawStringToMap.get(charAtMyText(myText, i)) == null) {
				buildingString = "";
			} else {
				buildingString = rawStringToMap.get(charAtMyText(myText, i));
			}
			rawStringToMap.put(charAtMyText(myText, i), buildingString + charAtMyText(myText, i));
		}

		TreeMap<String, String> ascendingSortedMap = new TreeMap<>();

		for (Iterator<Map.Entry<String, String>> it = rawStringToMap.entrySet().iterator(); it.hasNext();) {
			Map.Entry<String, String> e = it.next();
			ascendingSortedMap.put((e.getValue().length() + e.getKey()), e.getValue());
		}

		Map<String, String> descendingSortedMap = new TreeMap<String, String>(Collections.reverseOrder());
		descendingSortedMap.putAll(ascendingSortedMap);

		System.out.println();
		System.out.println("Most common letters:");
		System.out.println();
		for (Map.Entry<String, String> entry : descendingSortedMap.entrySet()) {
			String y = entry.getKey().substring(1, 2);
			String x = entry.getValue();
			System.out.print(y + ": " + x.length() + " ");
			for (int i = 0; i < 100 / charCounter * x.length(); i++) {
				System.out.print("#");
			}
			if (100 / charCounter * x.length() < 1) {
				System.out.println("< 1%");
			}
			System.out.println();
		}

		sc.close();
	}

	private static boolean charOutOfRange(String txt, int i) {
		int maxAsciiCode = 90;
		int minAsciiCode = 65;
		if (charAtMyText(txt, i).charAt(0) < minAsciiCode || charAtMyText(txt, i).charAt(0) > maxAsciiCode) {
			return true;
		}
		return false;
	}

	private static String charAtMyText(String txt, int i) {
		return txt.substring(i, i + 1).toUpperCase();
	}
}
