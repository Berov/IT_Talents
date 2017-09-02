package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class demo {

	public static void main(String[] args) {

		
		Proba.doSome();
		
		// String text = "Пробичка";
		// try {
		// Files.write(Paths.get("D:/my-file.txt"), (text +
		// System.lineSeparator()).getBytes());
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		//
		// text = "Пак проба...";
		// try {
		// Files.write(Paths.get("D:/my-file.txt"), (text +
		// System.lineSeparator()).getBytes(),
		// StandardOpenOption.APPEND);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// ------------------------------WORKS-------------------------------------------
		// File file = new File("D:/my-file.txt");
		// Path path = Paths.get("MyText.txt");
		//
		// if (Files.exists(Paths.get(path.toString()))) {
		// try {
		// Files.write(Paths.get(path.toString()), (text +
		// System.lineSeparator()).getBytes(),
		// StandardOpenOption.APPEND);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// } else {
		// try {
		// Files.write(Paths.get(path.toString()), (text +
		// System.lineSeparator()).getBytes());
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }
		// --------------------END WORKS---------------------------------
		ArrayList<String> myFirstList = new ArrayList();
		List list = myFirstList;

		myFirstList.add("Анелия");
		myFirstList.add("Гергана");
		myFirstList.add("Виктория");
		myFirstList.add("Яна");
		myFirstList.add("Петра");
		myFirstList.add("Ирина");
		myFirstList.add("Боряна");

		// ------------WORKS IF HAS THE FILE CREATED-------------------------
		// try {
		// Files.write(Paths.get(path.toString()), ((list.toString()) +
		// System.lineSeparator()).getBytes(),
		// StandardOpenOption.APPEND);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// ------------------------------END-------------------------------------------

		System.out.println(myFirstList);
		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);
		myFirstList.add(2, "ВТОРИ");
		System.out.println(list);
		if (myFirstList.contains("ВТОРИ")) {
			System.out.println("Съдържа ВТОРИ");
		}
		System.out.println(myFirstList.set(1, "ПЪРВИ"));
		System.out.println(list);
		myFirstList.remove(0);
		System.out.println(list);
		myFirstList.remove("ПЪРВИ");
		System.out.println(list);
		myFirstList.remove("ПЪРВИ");
		System.out.println(list.isEmpty());
		ArrayList second = (ArrayList) myFirstList.clone();
		list.clear();
		System.out.println(second);
		System.out.println(myFirstList);
		System.out.println(second.subList(0, 5));
		list.add("Ирина");
		list.add("Гергана");
		list.add("Виктория");
		list.add("Пенка");
		list.add("Виктория");

		System.out.println("Mahame" + second.retainAll(list));

		System.out.println(second);
		System.out.println(myFirstList);
		myFirstList.addAll(second);
		System.out.println(myFirstList);

		myFirstList.sort(new ComparatorByName());
		System.out.println(myFirstList);

		System.out.println("Sortiiiiiiiiiiiiiiiiiiiiiiiing");
		Collections.sort(myFirstList);
		System.out.println(myFirstList);
		Collections.swap(myFirstList, 0, 7);
		System.out.println(myFirstList);
		Collections.unmodifiableList(list);

		// -------------LinkedList---------------
		System.out.println("============================================");

		TreeSet<String> ts = new TreeSet();
		ts.add("Ирина");
		ts.add("Гергана");
		ts.add("Виктория");
		ts.add("Пенка");
		ts.add("Виктория");
		System.out.println(ts);

		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("====================HASH MAP========================");

		HashMap<Integer, String> hm = new LinkedHashMap();
		hm.put(1, "Мария");
		hm.put(5, "Елена");
		hm.put(34, "Станислава");
		hm.put(12, "Елена");
		hm.put(2, "Диана");
		hm.put(99, "Петра");
		hm.put(8, "Глория");
		hm.put(7, "Феодосия");
		hm.put(6, "Кунка");
		hm.put(3, "Цикория");
		hm.put(33, "Яна");
		System.out.println(hm);
		Iterator<Entry<Integer, String>> it2 = hm.entrySet().iterator();
		while (it2.hasNext()) {
			Entry<Integer, String> e = it2.next();
			System.out.println(e.getKey() + "--->" + e.getValue());
		}

		System.out.println("====================TREE MAP========================");
		TreeMap<String, String> tm = new TreeMap<>();
		tm.put("01", "Мария");
		tm.put("08", "Елена");
		tm.put("07", "Станислава");
		tm.put("12", "Елена");
		tm.put("14", "Диана");
		tm.put("01", "Петра");
		tm.put("21", "Глория");
		tm.put("41", "Феодосия");
		tm.put("06", "Кунка");
		tm.put("01", "Цикория");
		tm.put("33", "Яна");

		Map x = Collections.unmodifiableMap(tm);

		System.out.println(tm);
		// Iterator<Entry<String, String>> it3 = tm.entrySet().iterator();
		for (Iterator iterator = tm.entrySet().iterator(); iterator.hasNext();) {
			Iterator<Entry<String, String>> it4 = iterator;
			System.out.println(it4.next());
		}

		for (Entry<String, String> e : tm.entrySet()) {

			System.out.println(e.getValue() + " е на " + e.getKey() + "-во място");
		}

		LinkedList<String> ll = new LinkedList();
		
		

	}

}
