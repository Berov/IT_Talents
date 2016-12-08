
public class Lesson3_task13 {

	public static void main(String[] args) {

		int number = 14; // дадено число

		for (int i = 100; i <= 999; i++) {
			int first = i / 100;
			int second = (i - first * 100) / 10;
			int third = i - first * 100 - second * 10;

			if (first + second + third == number) {
				System.out.println(i);
			}
		}

		if (number > 3 * 9) {
			System.out.println("Няма числа отговарящи на критерия");
		}

	}

}
