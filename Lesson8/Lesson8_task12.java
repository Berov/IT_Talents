import java.util.Scanner;

public class Lesson8_task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете едно число");
		int n = sc.nextInt();

		int[] arr2 = createArray(n);
		printArray(arr2);

		sc.close();
	}

	static int[] createArray(int m) {
		int[] arr = new int[m];
		for (int i = 1; i <= m; i++) {
			arr[i - 1] = i;
		}
		return arr;
	}

	static void printArray(int[] p) {
		System.out.println("Създаденият масив (разпечатан с нов метод) е:");
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] + " ");
		}
	}
}

