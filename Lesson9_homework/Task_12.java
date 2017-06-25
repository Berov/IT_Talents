import java.util.Scanner;

/*Да се създаде метод, който приема за входни данни число N и
връща масив от числа с дължина N, който съдържа всички числа
от 1 до N.
*/
public class Task_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.println("Enter a positive integer");
			n = sc.nextInt();
		} while (n < 1);

		int[] arr = createArr(n);
		printIntArray(arr);

		sc.close();
	}

	static int[] createArr(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

	static void printIntArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}
}
