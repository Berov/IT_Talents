import java.util.Scanner;

/*Да се въведе число, след което да се създаде масив с 10
елемента по следния начин:
Първите 2 елемента на масива са въведеното число.
Всеки следващ елемент на масива е равен на сбора от
предишните 2 елемента в масива.
След това изведете масива .
*/

public class Task_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			if (i < 2) {
				arr[i] = n;
			} else {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();

	}

}
