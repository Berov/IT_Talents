import java.util.Scanner;

public class Lesson5_task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Дължина на масива?");
		int arrLength = sc.nextInt();
		int[] arr = new int[arrLength];
		int[] arr2 = new int[arr.length];

		for (int i = 0; i < arrLength; i++) {
			System.out.println("Въведете следващо число от масива");
			arr[i] = sc.nextInt();
		}

		for (int i = 0, ii = arr.length - 1; i < arr.length; i++, ii--) {
			arr2[i] = arr[ii];
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		sc.close();
	}

}
