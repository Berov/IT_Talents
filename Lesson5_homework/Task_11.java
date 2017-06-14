import java.util.Scanner;

/*Да се състави програма, която въвежда от клавиатурата 7 цели числа
в едномерен масив
Програмата да изведе всички числа кратни на 5, но по големи от 5.
Пример: -23, -55, 17, 75, 56, 105, 134
Изход: 75,105 - 2 числа
*/
public class Task_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		int counter = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number " + (i + 1));
			arr[i] = sc.nextInt();
		}

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > 5 && arr[j] % 5 == 0) {
				if (counter > 0) {
					System.out.print(", ");
				}
				System.out.print(arr[j]);
				counter++;
			}
		}

		if (counter > 0) {
			System.out.println(" - " + counter + " numbers");
		} else {
			System.out.println("There is no numbers divided by 5 and greater than 5");
		}

		sc.close();
	}
}
