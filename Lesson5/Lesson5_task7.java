import java.util.Scanner;

public class Lesson5_task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrLength;
		do {
			System.out.println("Въведете дължина на масива > 3:");
			arrLength = sc.nextInt();
		} while (arrLength < 3);
		int[] arr = new int[arrLength];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Въведете " + (i + 1) + " елемент от масива");
			arr[i] = sc.nextInt();
		}

		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			if (i == 0 || i == arr.length - 1) {
				arr2[i] = arr[i];
			} else {
				arr2[i] = arr[i - 1] + arr[i + 1];
			}

		for (int i = 0; i < arr2.length; i++)
			System.out.println(arr2[i] + " ");
		sc.close();

	}

}
