import java.util.Scanner;

/*Съставете програма, която по дадено трицифренo число проверява
дали числото се дели на всяка своя цифра. Във въведеното число да
няма цифра 0.
*/

public class Task_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете трицифрено число, в което няма цифра 0!");
		int number = sc.nextInt();
		int a = number / 100;
		int b = (number - a * 100) / 10;
		int c = number - (a * 100 + b * 10);

		if (a != 0 && b != 0 && c != 0 && number >= 100 && number <= 999) {
			if (number % a == 0 && number % b == 0 && number % c == 0) {
				System.out.println("Числото " + number + " се дели на всяка от цифрите си");
			} else {
				System.out.println("Числото " + number + " не се дели на всяка от цифрите си");
			}

		} else {
			System.out.println("Трябваше да въведете трицифрено число без 0 в него!");
		}

		sc.close();
	}

}
