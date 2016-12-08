import java.util.Scanner;

public class Lesson3_task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първо число");
		int firstNumber = sc.nextInt();
		System.out.println("Въведете второ число");
		int secondNumber = sc.nextInt();

		if (secondNumber < firstNumber) {
			int temp = firstNumber;
			firstNumber = secondNumber;
			secondNumber = temp;
		}
		int sum = firstNumber;
		System.out.print(firstNumber);

		for (int x = firstNumber + 1; x <= secondNumber * 2; x++) {
			if (x % 3 == 0) {
				System.out.print(", skip");
			} else {
				if ((sum + x) > 200) {
					break;
				}
				System.out.print(", " + x);
				sum = sum + x;
			}

		}

		sc.close();
	}

}
