import java.util.Scanner;

public class Lesson5_task3 {

	public static void main(String[] args) {
		System.out.println("Please enter a nuber");
		Scanner sc = new Scanner(System.in);
		int enteredNumber = sc.nextInt();
		int[] newArr = new int[10];

		for (int i = 0; i < 10; i++) {
			if (i <= 1) {
				newArr[i] = enteredNumber;
			} else {
				newArr[i] = newArr[i - 2] + newArr[i - 1];
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(newArr[i]);
		}

		sc.close();
	}

}
