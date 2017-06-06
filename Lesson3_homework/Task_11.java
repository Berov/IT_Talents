import java.util.Scanner;

/*Въведете число N чрез конзолата и изкарайте като
резултат следния триъгълник с височина N:
					  *
					 ***
					*****
				.................
Кaто допълнително упражнение – нарисувайте същия
триъгълник, но незапълнен.
*/

public class Task_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("Enter a positive number");
			n = sc.nextInt();
		} while (n < 1);

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 2; j < (i + 2) * 2 - 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Additional exercise
		System.out.println("\n\n");

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 2; j < (i + 2) * 2 - 3; j++) {
				if (j == 2 || j == (i + 2) * 2 - 4 || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		sc.close();

	}

}
