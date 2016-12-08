<<<<<<< HEAD
import java.util.Scanner;

public class Lesson3_task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете положително число N");
		int N = sc.nextInt();

		for (int x = 1, temp = (N - 1); x <= N; x++, temp += 2) {

			for (int y = 1; y <= N; y++) {
				System.out.print(temp + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
=======
import java.util.Scanner;

public class Lesson3_task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете положително число N");
		int N = sc.nextInt();

		for (int x = 1, temp = (N - 1); x <= N; x++, temp += 2) {

			for (int y = 1; y <= N; y++) {
				System.out.print(temp + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
>>>>>>> 4a969ad4eab46524680d1bbb6fef5d8299720e82
