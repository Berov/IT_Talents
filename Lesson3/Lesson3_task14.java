<<<<<<< HEAD
import java.util.Scanner;

public class Lesson3_task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете числото N (10..200)");
		int n = sc.nextInt();
		if (n >= 10 && n <= 200) {

			for (int i = n; i >= 1; i--) {

				if (i % 7 == 0) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Потребителят е идиот!");
		}

		sc.close();
	}

}
=======
import java.util.Scanner;

public class Lesson3_task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете числото N (10..200)");
		int n = sc.nextInt();
		if (n >= 10 && n <= 200) {

			for (int i = n; i >= 1; i--) {

				if (i % 7 == 0) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Потребителят е идиот!");
		}

		sc.close();
	}

}
>>>>>>> 4a969ad4eab46524680d1bbb6fef5d8299720e82
