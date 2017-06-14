import java.util.Scanner;

/*Да се състави програма, чрез която се въвеждат 7 цели числа в
едномерен масив.
Програмата да изведе числото, което е най-близко до средната
стойност на въведените числа.
Пример: 1,2,3,4,5,6,7
Изход: средна стойност 4, най-близка стойност 4
*/
public class Task_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		int sum = 0;
		int average = 0;
		int distance;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number " + (i + 1));
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		average = sum / arr.length;

		int averageNumberIndex = 0;
		distance = arr[0] - average;
		if (distance < 0) {
			distance *= -1;
		}

		for (int i = 1; i < arr.length; i++) {
			int tempDistance = arr[i] - average;
			if (tempDistance < 0) {
				tempDistance *= -1;
			}
			if (tempDistance < distance) {
				distance = tempDistance;
				averageNumberIndex = i;
			}
		}

		System.out.println("Average is " + average);
		System.out.println("Closest number is " + arr[averageNumberIndex]);

		sc.close();
	}
}
