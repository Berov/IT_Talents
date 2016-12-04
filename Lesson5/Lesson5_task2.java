import java.util.Arrays;
import java.util.Scanner;

public final class Lesson5_task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете дължина на масива");
		int arrLength = sc.nextInt();
		int arr[] = new int[arrLength];
		for (int i = 0; i < arrLength; i++) {
			System.out.println("Въведете елемент " + (i + 1) + " от масива");
			arr[i] = sc.nextInt();
		}

		int middle = arr.length / 2;

		for (int i = 0, ii = arr.length - 1; i < arr.length; i++, ii--) {
			if (i >= middle) {
				arr[i] = arr[ii];
			}
		}

		System.out.println(Arrays.toString(arr));

		sc.close();
	}

}
