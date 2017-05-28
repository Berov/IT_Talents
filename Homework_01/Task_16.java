import java.util.Scanner;

/*Въведено е трицифрено естествено число от вида abc.
Трябва да се провери дали:
ако a = b = c - Изход: цифрите са равни;
ако a>b>c - Изход: цифрите са във възходящ ред;
ако a<b<c цифрите са в низходящ ред;
и изход: цифрите са ненаредени, за неописаните случаи.
Да се състави програма, която извежда резултата от проверката за
наредба на цифрите в числото.
*/

public class Task_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете трицифрено число");
		int abc = sc.nextInt();
		int a = abc / 100;
		int b = (abc - a * 100) / 10;
		int c = (abc - a * 100 - b * 10);

		if (abc >= 100 && abc <= 999) {
			if (a == b && b == c) {
				System.out.println("Цифрите са равни");
			} else if (a > b && b > c) {
				System.out.println("Цифрите са в низходящ ред");
			} else if (a < b && b < c) {
				System.out.println("Цифрите са във възходящ ред");
			} else {
				System.out.println("Цифрите са ненаредени");
			}
		} else {
			System.out.println("Казахме трицифрено число...");
		}

		sc.close();
	}

}
