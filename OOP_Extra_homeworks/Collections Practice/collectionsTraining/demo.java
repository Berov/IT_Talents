package collectionsTraining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public class demo {

	public static void main(String[] args) {

		// ArrayList====================================================================
		ArrayList<Person> al = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			Person person = new Person(Util.nameGenerator(), Util.intGenerator(20, 80));
			al.add(person);
		}

		// for (Iterator iterator = al.iterator(); iterator.hasNext();) {
		// Person person = (Person) iterator.next();
		// System.out.println(person.getName() + ", "+ person.getAge() + " years
		// old, EGN:"+ person.getEGN());
		// }

		// for (Person person : al) {
		// System.out.println(person.getName() + ", "+ person.getAge() + " years
		// old, EGN:"+ person.getEGN());
		// }

		// Iterator<Person> it = al.iterator();
		// while (it.hasNext()) {
		// Person person = it.next();
		// System.out.println(person.getName() + ", " + person.getAge() + "
		// years old, EGN:" + person.getEGN());
		// }

		// al.sort(new Comparator<Person>() {
		//
		// @Override
		// public int compare(Person o1, Person o2) {
		// if (o1.getAge() != o2.getAge()) {
		// return o1.getAge() - o2.getAge();
		// }
		// if (!o1.getName().equals(o2.getName())) {
		// return o1.getName().compareTo(o2.getName());
		// }
		// return o1.getEGN() - o2.getEGN();
		// }
		// });

		// printArrayList(al);
		// Collections.sort(al);
		// System.out.println("===collections.sort===");
		// printArray(al);

		// ALinkedList====================================================================
		LinkedList<Person> ll = new LinkedList();
		for (int i = 0; i < 20; i++) {
			Person person = new Person(Util.nameGenerator(), Util.intGenerator(20, 80));
			ll.add(person);
		}

		// Person gosho = new Person("Гошо Дебелия", 99);
		// ll.add(gosho);
		// System.out.println(ll.getLast());
		//
		// // printLinkedList(ll);
		// System.out.println(ll);
		// System.out.println(ll.indexOf(gosho));

		// HashSet===========TreeSet=========================================================
		HashSet<Person> hs = new HashSet<>();
		for (int i = 0; i < 20; i++) {
			Person person = new Person(Util.nameGenerator(), Util.intGenerator(20, 80));
			hs.add(person);
		}

		// for (Iterator iterator = hs.iterator(); iterator.hasNext();) {
		// Person person = (Person) iterator.next();
		// System.out.println(person);
		// }

		// Iterator it = hs.iterator();
		// while (it.hasNext()) {
		// Person person = (Person) it.next();
		// System.out.println(person);
		// }

		// TreeSet<Person> ts = new TreeSet<Person>(new Comparator<Person>() {
		//
		// @Override
		// public int compare(Person o1, Person o2) {
		// if (o1.getAge() != o2.getAge()) {
		// return o1.getAge() - o2.getAge();
		// }
		// return o1.getName().compareTo(o2.getName());
		// }
		// });
		// for (Person person : hs) {
		// ts.add(person);
		// }
		//
		// // System.out.println(ts);
		// for (Iterator iterator = ts.iterator(); iterator.hasNext();) {
		// Person person = (Person) iterator.next();
		// System.out.println(person);
		// }

		// HashMap===========TreeMap=========================================================
		HashMap<String, Person> hm = new HashMap();
		for (Iterator<Person> iterator = al.iterator(); iterator.hasNext();) {
			Person person = iterator.next();
			hm.put(person.getName(), person);
		}

		// for (String k : hm.keySet()) {
		// System.out.println(k);
		// }

		TreeMap<Integer, Person> tm = new TreeMap<>();
		for (Entry<String, Person> e : hm.entrySet()) {
			tm.put(e.getValue().getAge(), e.getValue());
		}
		System.out.println("TreeMap - sorted by age:	" + tm.size());
		for (Entry<Integer, Person> e : tm.entrySet()) {
			System.out.println("	Key: " + e.getKey() + "   Value:" + e.getValue());
		}

		TreeMap<Integer, Person> tmByEGN = new TreeMap<>();
		for (Iterator<Entry<Integer, Person>> iterator = tm.entrySet().iterator(); iterator.hasNext();) {
			Person person = iterator.next().getValue();
			tmByEGN.put(person.getEGN(), person);
		}

		System.out.println("Sorted by EGN	" + tm.size());
		for (Entry<Integer, Person> e : tm.entrySet()) {
			System.out.println("EGN: " + e.getKey() + "  Value: " + e.getValue());
		}

		
		
		Map um = Collections.unmodifiableMap(tmByEGN);
		System.out.println("unmodifiableMap:  " + um.size());
		// (3, new Person("Gogo", 3));
		for (Iterator<Entry<Integer, Person>> iterator = um.entrySet().iterator(); iterator.hasNext();) {
			Person person = iterator.next().getValue();
			System.out.println(person);
		}

		//System.out.println(um);
		// -----------END---------------
	}

	private static void printArrayLIst(ArrayList<Person> al) {
		for (Iterator<Person> iterator = al.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			System.out.println(person.getName() + ", " + person.getAge() + " years old, EGN:" + person.getEGN());
		}
	}

	private static void printLinkedList(LinkedList<Person> ll) {
		for (Iterator<Person> iterator = ll.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			System.out.println(person.getName() + ", " + person.getAge() + " years old, EGN:" + person.getEGN());
		}
	}
}
