<<<<<<< HEAD
import java.util.Scanner;

public class Lesson3_task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първо число");
		int firstNumber = sc.nextInt();
		System.out.println("Въведете еторо число");
		int secondNumber = sc.nextInt();

		if (firstNumber > secondNumber) {
			int tempNumber = firstNumber;
			firstNumber = secondNumber;
			secondNumber = tempNumber;
		}

		while (firstNumber <= secondNumber) {
			System.out.println(firstNumber);
			firstNumber++;
		}
		sc.close();
	}

}
=======
import java.util.Scanner;

public class Lesson3_task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първо число");
		int firstNumber = sc.nextInt();
		System.out.println("Въведете еторо число");
		int secondNumber = sc.nextInt();

		if (firstNumber > secondNumber) {
			int tempNumber = firstNumber;
			firstNumber = secondNumber;
			secondNumber = tempNumber;
		}

		while (firstNumber <= secondNumber) {
			System.out.println(firstNumber);
			firstNumber++;
		}
		sc.close();
	}

}
>>>>>>> 4a969ad4eab46524680d1bbb6fef5d8299720e82
