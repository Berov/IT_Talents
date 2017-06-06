import java.util.Scanner;

/* Да се състави програма, която извежда всички
естествени трицифрени числа, които имат сбор на цифрите равен
на дадено число.
*/
public class Task_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum;
		boolean comma = false;
		do {
			System.out.println("Enter a number (1-27)");
			sum = sc.nextInt();
		} while (sum < 1 || sum > 27);

		for (int i = 100; i <= 999; i++) {
			if ((i / 100 + i / 10 % 10 + i % 10) == sum) {
				if (comma) {
					System.out.print(", ");
				}
				System.out.print(i);
				comma = true;
			}
		}

		sc.close();
	}

}
