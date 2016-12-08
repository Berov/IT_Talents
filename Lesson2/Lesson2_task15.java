<<<<<<< HEAD
import java.util.Scanner;

public class Lesson2_task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Колко е часът?");
		int hour = sc.nextInt();

		if (hour > 4 && hour <= 9) {
			System.out.println("Добро утро");
		}

		if (hour > 9 && hour <= 18) {
			System.out.println("Добър Ден");
		}

		if (hour >= 0 && hour <= 4 || hour > 18 && hour <= 24) {
			System.out.println("Добър Вечер");
		}
		sc.close();
	}

}
=======
import java.util.Scanner;

public class Lesson2_task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Колко е часът?");
		int hour = sc.nextInt();

		if (hour > 4 && hour <= 9) {
			System.out.println("Добро утро");
		}

		if (hour > 9 && hour <= 18) {
			System.out.println("Добър Ден");
		}

		if (hour >= 0 && hour <= 4 || hour > 18 && hour <= 24) {
			System.out.println("Добър Вечер");
		}
		sc.close();
	}

}
>>>>>>> 4a969ad4eab46524680d1bbb6fef5d8299720e82
