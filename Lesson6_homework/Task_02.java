import java.util.Scanner;

/*Имате квадратен двумерен масив от естествени числа, чийто стойности
се въвеждат от конзолата. Да се отпечатат диагоналите на масива.

*/
public class Task_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Enter a length of a square array (must be a positive number)");
		do {
			n = sc.nextInt();
		} while (n < 1);

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter a number for array[" + i + "][" + j + "]");
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Your array is:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("The first diagonal is:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			System.out.println(arr[i][i] + " ");
		}

		System.out.println();
		System.out.println("The second diagonal is:");
		for (int i = 0, j = n - 1; i < arr.length; i++, j--) {
			for (int j2 = 0; j2 < j; j2++) {
				System.out.print("  ");
			}
			System.out.println(arr[i][j] + " ");
		}

		sc.close();
	}
}
