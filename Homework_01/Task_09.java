import java.util.Scanner;

/*Да се състави програма, която чете от конзолата 2 естествени
двуцифрени числа a,b.
Програмата да изведе в конзолата дали последната цифра от
произведението на двете числа е четна, както и самата цифра.
Входни данни: a,b - естествени числа от интервала [10..99].
*/

public class Task_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Моля въведете двуцифрено число!");
		int a = sc.nextInt();
		System.out.println("Моля въведете друго двуцифрено число!");
		int b = sc.nextInt();

		if (a < 10 || a > 99 || b < 10 || b > 99) {
			System.out.println("Има число, което не е двуцифрено!");
		} else if ((a * b) % 2 == 0) {
			System.out.println("Произведението на " + a + " и " + b + " е " + (a * b) + " и е четно");
			System.out.println("Последната цифра на " + a * b + " е " + ((a * b) % (a * b / 10)) + " и също е четна");

		} else {
			System.out.println("Произведението на " + a + " и " + b + " е " + (a * b) + " и е нечетно");
			System.out.println("Последната цифра на " + a * b + " е " + ((a * b) % (a * b / 10)) + " и също е нечетна");
		}

		sc.close();
	}

}
