import java.util.Scanner;

/*Да се състави програма, чрез която се въвеждат последователно две
редици от символи без интервали.
Програмата да извежда съобщение за резултата от сравнението им по
позиции.
Пример: хипопотам, хипопотук
Изход:
Двата низа са с равна дължина.
Разлика по позиции:
8 а-у
9 м-к
*/
public class Task_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text1, text2, helper = "";

		do {
			System.out.println("Enter the first word/sentence with no spaces");
			text1 = sc.nextLine();
			System.out.println("Enter the second word/sentence with no spaces");
			text2 = sc.nextLine();

			if (text1.contains(" ") || text2.contains(" ")) {
				System.out.println("No spaces!!! Come on again!");
			}
		} while (text1.contains(" ") || text2.contains(" "));

		if (text1.length() > text2.length()) {
			System.out.println("The first string is longer than second one");
			for (int i = text2.length(); i < text1.length(); i++) {
				helper = helper.concat(" ");
			}
			text2 = text2.concat(helper);
		} else if (text1.length() < text2.length()) {
			System.out.println("The second string is longer than first one");
			for (int i = text1.length(); i < text2.length(); i++) {
				helper = helper.concat(" ");
			}
			text1 = text1.concat(helper);
		} else {
			System.out.println("Both string are with the same length");
		}

		for (int i = 0; i < text1.length(); i++) {
			if (text1.charAt(i) != text2.charAt(i)) {
				System.out.println((i + 1) + " " + text1.charAt(i) + "-" + text2.charAt(i));
			}
		}

		sc.close();
	}
}
