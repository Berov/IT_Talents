import java.util.Scanner;

public class Lesson3_task22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число от 1 до 999");
		int n = sc.nextInt();
		int flag = 1;
		int counter = n + 1;

		if (n >= 1 && n <= 999) {

			while (flag <= 10) {
				if (counter % 2 == 0 || counter % 3 == 0 || counter % 5 == 0) {
					if (flag != 1) {
						System.out.print(", ");
					}
					System.out.print(flag + ":" + counter);
					flag++;
				}
				counter++;
			}

		} else {
			System.out.println("Потребителят е идиот!");
		}

		sc.close();
	}

}
