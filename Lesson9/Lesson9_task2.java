import java.util.Scanner;

public class Lesson9_task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		do {
			System.out.println("Въведете две числа по-големи от 2!");
			x = sc.nextInt();
			y = sc.nextInt();
		} while (x < 2 || y < 2);

		System.out.println(myCalcFunc(x, y));

		sc.close();
	}

	// --------------------------------------------end of mine method
	static int myCalcFunc(int x, int y) {
		if (x == 2) { // дъно
			return y + y;
		}
		return myCalcFunc(x - 1, y) + y; // стъпка
	}
}

// :)))))))