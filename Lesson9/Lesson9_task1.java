
public class Lesson9_task1 {

	public static void main(String[] args) {
		int n = 30;
		int x = fibonacci(n);
		System.out.println(x);
	}

	// ---------------------end of mine method
	static int fibonacci(int n) {
		if (n == 0) {
			return 0; // първо дъно
		}
		if (n == 1) {
			return 1; // второ дъно
		}
		// System.out.println(n);
		return (fibonacci(n - 1) + fibonacci(n - 2)); // стъпка
	}
}
