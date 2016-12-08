import java.util.Scanner;

public class Lesson3_task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете страна на квадрата (3..20)");
		int b = sc.nextInt();
		System.out.println("Въведете желан знак");
		char c = sc.next().charAt(0); // това не сме го учили, но не открих вариант и потърсих помощ в интернет...

		if (b >= 3 && b <= 20) {
			for (int i = 1; i <= b; i++) {
				for (int ii = 1; ii <= b; ii++) {
					if (ii > 1 && ii < b && i > 1 && i < b) {
						System.out.print(c);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("Потребителят е идиот!");
		}
		sc.close();
	}
}
