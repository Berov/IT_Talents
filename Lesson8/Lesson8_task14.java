import java.util.Scanner;

public class Lesson8_task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n;

		do {
			System.out.println("Моля въведете число N");
			n = sc.nextLong();
		} while (n <= 0);

		long factorial = createFactorial(n);
		System.out.println(n + "! = " + factorial);

		sc.close();
	}

	static long createFactorial(long g) {
		long sum = 1;
		for (int i = 2; i <= g; i++) {
			sum = sum * i;
		}
		return sum;
	}

}
