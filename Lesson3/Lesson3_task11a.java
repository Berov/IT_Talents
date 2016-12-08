<<<<<<< HEAD
import java.util.Scanner;

public class Lesson3_task11a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете положително число");
		int number = sc.nextInt();

		for (int i = 0; i <= number - 1; i++) {

			for (int ii = 1; ii < number - i; ii++) {
				System.out.print(" ");
			}
			for (int ii = 1; ii < i + 2; ii++) {

				if (ii == 1 || i == number - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int ii = 0; ii < i; ii++) {
				if (i < number - 1) {
					if (ii < i - 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
=======
import java.util.Scanner;

public class Lesson3_task11a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете положително число");
		int number = sc.nextInt();

		for (int i = 0; i <= number - 1; i++) {

			for (int ii = 1; ii < number - i; ii++) {
				System.out.print(" ");
			}
			for (int ii = 1; ii < i + 2; ii++) {

				if (ii == 1 || i == number - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int ii = 0; ii < i; ii++) {
				if (i < number - 1) {
					if (ii < i - 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
>>>>>>> 4a969ad4eab46524680d1bbb6fef5d8299720e82
