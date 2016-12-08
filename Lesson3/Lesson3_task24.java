import java.util.Scanner;

public class Lesson3_task24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число м/у 10 и 30000");
		int number = sc.nextInt();
		if (number >= 10 && number <= 30000) {

			int a = number / 10000;
			int b = (number - a * 10000) / 1000;
			int c = (number - a * 10000 - b * 1000) / 100;
			int d = (number - a * 10000 - b * 1000 - c * 100) / 10;
			int e = (number - a * 10000 - b * 1000 - c * 100 - d * 10);
			System.out.println(a + "-" + b + "-" + c + "-" + d + "-" + e);

			int numberInverted = e * 10000 + d * 1000 + c * 100 + b * 10 + a;

			System.out.println(numberInverted);

		} else {
			System.out.println("Потребителят е идиот!");
		}

		sc.close();
	}

}
