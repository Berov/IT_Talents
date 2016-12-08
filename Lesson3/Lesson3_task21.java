import java.util.Scanner;

public class Lesson3_task21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете номер на карта 1...51");
		int number = sc.nextInt();
		int card = 1;
		boolean end = false;

		for (int ii = 2; ii < 15; ii++) {
			for (int i = 1; i < 5; i++) {
				if (ii == 14 && i == 4) {
					end = true;
				}

				if (number <= card) {
					switch (ii) {
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
					case 8:
					case 9:
					case 10:
						System.out.print(ii + "-");
						break;
					case 11:
						System.out.print("Вале-");
						break;
					case 12:
						System.out.print("Дама-");
						break;
					case 13:
						System.out.print("Поп-");
						break;
					case 14:
						System.out.print("Асо-");
						break;

					}
					switch (i) {
					case 1:
						System.out.print("Спатия");
						if (end != true) {
							System.out.print(", ");
						}
						break;
					case 2:
						System.out.print("Каро");
						if (end != true) {
							System.out.print(", ");
						}
						break;
					case 3:
						System.out.print("Купа");
						if (end != true) {
							System.out.print(", ");
						}
						break;
					case 4:
						System.out.print("Пика");
						if (end != true) {
							System.out.print(", ");
						}
						break;
					}
				}

				card++;

			}

		}

		sc.close();

	}

}
