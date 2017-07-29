package InstanceOfTest;

public class staticHelper {
	
	static void checkEdroDrebno(Dostavchik d) {
		if (d instanceof NaDrebno) {
			System.out.println(d.name + " е доставчик на дребно..");
		} else if (d instanceof NaEdro) {
			System.out.println(d.name + " е доставчик на едро..");
		}
	}

}
