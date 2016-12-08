<<<<<<< HEAD

public class Lesson2_task16 {

	public static void main(String[] args) {
		int abc = 947; // въведеното число от тип abc
		int a = abc / 100;
		int b = (abc - a * 100) / 10;
		int c = (abc - a * 100 - b * 10);

		if (a == b && b == c) {
			System.out.println("Цифрите са равни");
		} else if (a > b && b > c) {
			System.out.println("Цифрите са в низходящ ред");
		} else if (a < b && b < c) {
			System.out.println("Цифрите са във възходящ ред");
		} else {
			System.out.println("Цифрите са ненаредени");
		}

	}

}
=======

public class Lesson2_task16 {

	public static void main(String[] args) {
		int abc = 947; // въведеното число от тип abc
		int a = abc / 100;
		int b = (abc - a * 100) / 10;
		int c = (abc - a * 100 - b * 10);

		if (a == b && b == c) {
			System.out.println("Цифрите са равни");
		} else if (a > b && b > c) {
			System.out.println("Цифрите са в низходящ ред");
		} else if (a < b && b < c) {
			System.out.println("Цифрите са във възходящ ред");
		} else {
			System.out.println("Цифрите са ненаредени");
		}

	}

}
>>>>>>> 4a969ad4eab46524680d1bbb6fef5d8299720e82
