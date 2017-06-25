import java.util.Scanner;

/*Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
3 литра и ги ползвате едновременно.
Да се състави програма, която по даден обем извежда как ще прелеете
течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
кофите. Кофите не могат да се ползват с частично количество вода.
Входни данни: естествено число от интервала [10..9999].
*/

public class Task_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете обем на резервоара м/у 10 и 9999 литра");
		int capacity = sc.nextInt();

		if (capacity >= 10 && capacity <= 9999) {

			int count = capacity / 5;
			int rest = capacity % ((capacity / 5) * 5);

			if (rest == 0) {
				System.out.println(count + " пъти от 2 литра");
				System.out.println("+");
				System.out.println(count + " пъти по 3 литра");
			}
			if (rest == 1) {
				System.out.println(count - 1 + " пъти по 2 литра");
				System.out.println("+");
				System.out.println(count + 1 + " пъти по 3 литра");
			}
			if (rest == 2) {
				System.out.println(count + 1 + " пъти по 2 литра");
				System.out.println("+");
				System.out.println(count + " пъти по 3 литра");
			}
			if (rest == 3) {
				System.out.println(count + " пъти по 2 литра");
				System.out.println("+");
				System.out.println(count + 1 + " пъти по 3 литра");
			}
			if (rest == 4) {
				System.out.println(count + 2 + " пъти по 2 литра");
				System.out.println("+");
				System.out.println(count + " пъти по 3 литра");
			}

			System.out.println("-------------------------");
			System.out.println("Резервоар от " + capacity + " литра");
		} else {
			System.out.println("Този резервоар е със странни размери!");
		}

		sc.close();
	}

}
