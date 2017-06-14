import java.util.Scanner;

/*Да се състави програма, която въвежда в едномерен масив реални
числа.
Като изход: програма извежда онези 3 различни числа, чиято
абсолютна стойност формира максималната обща сума.
Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
Изход: 5.1; 6.34; 7.13
*/
public class Task_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrLength;

		do {
			System.out.println("Enter a length for the array");
			arrLength = sc.nextInt();
		} while (arrLength < 3);

		double[] arr = new double[arrLength];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter next number");
			arr[i] = sc.nextDouble();
		}

		double[] helpArr = new double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				helpArr[i] = arr[i] * -1;
			} else {
				helpArr[i] = arr[i];
			}
		}

		int firstNumIndex = 0, secondNumIndex = 1, thirdNumIndex = 2;

		for (int i = 0; i < helpArr.length; i++) {
			if (helpArr[i] > helpArr[firstNumIndex]) {
				thirdNumIndex = secondNumIndex;
				secondNumIndex = firstNumIndex;
				firstNumIndex = i;
			} else if (helpArr[i] < helpArr[firstNumIndex] && helpArr[i] > helpArr[secondNumIndex]) {
				thirdNumIndex = secondNumIndex;
				secondNumIndex = i;
			} else if (helpArr[i] < helpArr[secondNumIndex] && helpArr[i] > helpArr[thirdNumIndex]) {
				thirdNumIndex = i;
			}
		}

		System.out.println(arr[thirdNumIndex] + "; " + arr[secondNumIndex] + "; " + arr[firstNumIndex]);

		sc.close();
	}
}
