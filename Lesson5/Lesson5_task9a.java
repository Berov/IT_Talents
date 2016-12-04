import java.util.Scanner;

public class Lesson5_task9a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Дължина на масива?");
		int arrLength = sc.nextInt();
		int[] arr = new int[arrLength];

		for (int i = 0; i < arrLength; i++) {
			System.out.println("Въведете следващо число от масива");
			arr[i] = sc.nextInt();
		}

		for (int i = 0, y = arr.length - 1; i < arr.length / 2; i++, y--) {
			arr[i] = arr[i] + arr[y];
			arr[y] = arr[i] - arr[y];
			arr[i] = arr[i] - arr[y];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}

}
