import java.util.Scanner;

public class Lesson3_task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число м/у 1 и 9");
		int a = sc.nextInt();
		System.out.println("въведете друго число м/у 1 и 9");
		int b = sc.nextInt();

		if (a >= 1 && a <= 9 && b >= 1 && b <= 9) {
			for (int i = 1; i <= a; i++) {
				for (int ii = 1; ii <= b; ii++) {
					System.out.println(i + "*" + ii + "=" + i * ii);
				}
			}
		} else {
			System.out.println("Потребителят е идиот!");
		}

		sc.close();
	}

}
