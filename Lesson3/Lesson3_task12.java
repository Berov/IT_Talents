<<<<<<< HEAD

public class Lesson3_task12 {

	public static void main(String[] args) {

		for (int i = 100; i <= 999; i++) {
			int first = i / 100;
			int second = (i - first * 100) / 10;
			int third = (i - first * 100 - second * 10);

			if (first != second && first != third && second != third) {
				System.out.println(i);
			}

		}

	}

}
=======

public class Lesson3_task12 {

	public static void main(String[] args) {

		for (int i = 100; i <= 999; i++) {
			int first = i / 100;
			int second = (i - first * 100) / 10;
			int third = (i - first * 100 - second * 10);

			if (first != second && first != third && second != third) {
				System.out.println(i);
			}

		}

	}

}
>>>>>>> 4a969ad4eab46524680d1bbb6fef5d8299720e82
