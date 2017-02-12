package homework23;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some text in Latin letters please!");
		String myText = sc.nextLine();

		TreeMap<String, String> ts = new TreeMap<String, String>();

		for (int i = 0; i < myText.length(); i++) {
			// Works only with Latin letters!!!
			if (myText.substring(i, i + 1).toUpperCase().charAt(0) < 0X41
					|| myText.substring(i, i + 1).toUpperCase().charAt(0) > 0X5a) {
				continue;
			}
			String xx = new String();
			if (ts.get(myText.substring(i, i + 1).toUpperCase()) == null) {
				xx = "";
			} else {
				xx = ts.get(myText.substring(i, i + 1).toUpperCase());
			}
			ts.put(myText.substring(i, i + 1).toUpperCase(), xx + myText.substring(i, i + 1).toUpperCase());
		}

		TreeMap<String, String> tsSorted = new TreeMap<>();

		for (Iterator<Map.Entry<String, String>> it = ts.entrySet().iterator(); it.hasNext();) {
			Map.Entry<String, String> e = it.next();
			tsSorted.put((e.getValue().length() + e.getKey()), e.getValue());
		}

		Map<String, String> newMap = new TreeMap<String, String>(Collections.reverseOrder());
		newMap.putAll(tsSorted);

		System.out.println();
		System.out.println("Most common letters:");
		System.out.println();
		for (Map.Entry<String, String> entry : newMap.entrySet()) {
			String y = entry.getKey().substring(1, 2);
			String x = entry.getValue();
			System.out.print(y + ": " + x.length() + " ");
			for (int i = 0; i < 100 / myText.length() * x.length(); i++) {
				System.out.print("#");
			}
			if(100 / myText.length() * x.length()<1){
				System.out.println("< 1%");
			}
			System.out.println();
		}

		sc.close();
	}

}
