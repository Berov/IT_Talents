import java.util.Scanner;

/* Да се състави програма, чрез която по въведено
естествено число от интервала [10..99] се извежда поредица
числа, при спазване на следните изисквания:
1) ако предходното число е четно се извежда 0.5*числото;
2) ако предходното число е нечетно се извежда 3*числото +1.
Извеждането продължава докато не се получи стойност 1
*/
public class Task_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.println("Enter a number (10-99)");
			n = sc.nextInt();
		} while (n < 10 || n > 99);
		int temp = n;

		while (n > 1) {
			if (temp % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			System.out.print(n + " ");
			temp = n;
		}

		sc.close();
	}

}
