import java.util.Scanner;

public class Lesson3_task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете положително число N");
		long n = sc.nextInt();
		long sum = 0;
		long counter = 1;

		if (n > 0) {

			do {
				sum = sum + counter;
				counter++;
			} while (counter <= n);
			System.out.println("Сумата е " + sum);
		} else {
			System.out.println("Потребителят е идиот!");
		}

		sc.close();
	}

}
