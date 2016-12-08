<<<<<<< HEAD
import java.util.Scanner;

public class Lesson3_task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число по-голямо от 3");
		int number = sc.nextInt();
		boolean flag = false;

		for (int x = 3; x <= number; x++) {
			if (x % 3 == 0) {
				System.out.print(x);
				flag = true;
			}
			if ((x < number) && ((x + 1 < number) && (x + 1) % 3 == 0 || ((x + 2) <= number) && (x + 2) % 3 == 0)
					&& flag == true) {
				System.out.print(", ");
				flag = false;
			}
		}

		sc.close();
	}

}
=======
import java.util.Scanner;

public class Lesson3_task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число по-голямо от 3");
		int number = sc.nextInt();
		boolean flag = false;

		for (int x = 3; x <= number; x++) {
			if (x % 3 == 0) {
				System.out.print(x);
				flag = true;
			}
			if ((x < number) && ((x + 1 < number) && (x + 1) % 3 == 0 || ((x + 2) <= number) && (x + 2) % 3 == 0)
					&& flag == true) {
				System.out.print(", ");
				flag = false;
			}
		}

		sc.close();
	}

}
>>>>>>> 4a969ad4eab46524680d1bbb6fef5d8299720e82
