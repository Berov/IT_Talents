import java.util.Scanner;

/*Напишете програма, в която потребителя въвежда масив, след което
елементите на масива се обръщат в обратен ред (Целта не е масива да
се отпечата в обратен ред, ами първо да се обърне, след което да се
отпечата в нормален ред). Пробвайте да решите задачата първо с един
допълнителен масив и после без да използвате друг масив.
*/
public class Task_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrLength;

		do {
			System.out.println("Enter an array's length:");
			arrLength = sc.nextInt();
		} while (arrLength < 2); // to be an array must to have more than one element

		int[] arr1 = new int[arrLength];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter " + (i + 1) + "-th number:");
			arr1[i] = sc.nextInt();
		}

		// option one
		int[] arr2 = new int[arr1.length];
		for (int i = 0, ii = arr2.length - 1; i < arr2.length; i++, ii--) {
			arr2[i] = arr1[ii];
			System.out.print(arr2[i] + " ");
		}

		// option two
		System.out.println();

		for (int i = 0, ii = arr1.length - 1; i < arr1.length / 2; i++, ii--) {
			arr1[i] = arr1[i] + arr1[ii];
			arr1[ii] = arr1[i] - arr1[ii];
			arr1[i] = arr1[i] - arr1[ii];
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		sc.close();
	}
}
