import java.util.Scanner;

/*Да се прочете число от екрана(конзолата) и да се
изведе сбора на всички числа между 1 и въведеното число.
*/
public class Task_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int x = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= x; i++) {
			sum += i;
		}

		System.out.println(sum);

		sc.close();

	}

}
