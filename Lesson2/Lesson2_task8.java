import java.util.Scanner;

public class Lesson2_task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете четирицифрено число");
		int bigNumber = sc.nextInt();

		// a,b,c и d, са разрядите на числото

		int a = bigNumber / 1000;
		int b = (bigNumber - a * 1000) / 100;
		int c = (bigNumber - a * 1000 - b * 100) / 10;
		int d = (bigNumber - a * 1000 - b * 100 - c * 10);

		int aNumber = a * 10 + d;
		int bNumber = b * 10 + c;

		if (aNumber < bNumber) {
			System.out.println(aNumber + " е по-малко от " + bNumber);
		}
		if (aNumber > bNumber) {
			System.out.println(aNumber + " е по-голямо от " + bNumber);
		}
		if (aNumber == bNumber) {
			System.out.println(aNumber + " е еднакво с " + bNumber);
		}

		sc.close();

	}

}
