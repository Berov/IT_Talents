import java.util.Scanner;

/*Да се състави програма, чрез която се въвежда число и се представя
като число в двоична бройна система.
Програмата, чрез масив, да изчислява последователно всички цифри
на въведеното естествено число в 2-ична бройна система.
Пример: 99
Изход: 1100011
*/
public class Task_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean negative = false;

		System.out.println("Enter a number");
		int n = sc.nextInt();
		if (n < 0) {
			negative = true;
			n *= -1;
		}

		int counter = 0;
		int helper = n;

		do {
			helper /= 2;
			counter++;
		} while (helper > 0);

		int[] arr = new int[counter];
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = n % 2;
			n /= 2;
		}

		if (negative) {
			System.out.print("-"); // can be represented by an extra bit - 1
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		sc.close();
	}
}
