
public class Lesson9_task3 {

	public static void main(String[] args) {
		int x = 101; // entered number for check

		boolean y = primeNumberCheck(x, x);
		if (y) {
			System.out.println("Числото " + x + " е просто число");
		} else {
			System.out.println("Числото " + x + " не е просто число");
		}
	}

	// -----------------------------end of main method
	static boolean primeNumberCheck(int y, int x) {
		if (y == 2) { // дъно
			return true;
		}
		if (x % (y - 1) == 0) {
			return false;
		}
		return primeNumberCheck(y - 1, x); // стъпка
	}
}
