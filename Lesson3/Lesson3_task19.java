import java.util.Scanner;

public class Lesson3_task19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число от 10 до 99");
		int number = sc.nextInt();
		int tempNumber = number;
		if (number >= 10 && number <= 99) {

			while (number > 1) {

				if ((tempNumber) % 2 == 0) {
					number = number / 2;
				} else {
					number = number * 3 + 1;
				}
				System.out.print(number + " ");
				tempNumber = number;
			}

		} else {
			System.out.println("Потребителят е идиот!");
		}

		sc.close();

	}

}
