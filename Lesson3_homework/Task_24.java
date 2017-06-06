import java.util.Scanner;

/*Едно число X е палиндром, aко се чете еднакво отпред назад и
отзад напред.
Да се състави програма, която проверява дали въведено число е
палиндром.
Входни данни: N - естествено число от интервала [10 .. 30000].
Пример: 17571
Изход: числото е палиндром
Използвайте цикъл do-while.
*/
public class Task_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int reminder;

		do {
			System.out.println("Enter a number (10-30000)");
			n = sc.nextInt();
		} while (n < 10 || n > 30000);

		int tempVariable = n;
		int reverseNumber = 0;

		do {
			reminder = tempVariable % 10;
			reverseNumber = reverseNumber * 10 + reminder;
			tempVariable = tempVariable / 10;
		} while (tempVariable > 0);

		if (n == reverseNumber) {
			System.out.println(n + " is a palindrome");
		} else {
			System.out.println(n + " is not a palindrome");
		}

		sc.close();
	}
}
