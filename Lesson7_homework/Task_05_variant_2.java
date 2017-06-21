import java.util.Scanner;

/*Да се състави програма, чрез която се въвеждат 2 редици от знаци
(думи).
Ако в двете редици участва един и същи знак, да се изведе на екрана
първата редица хоризонтално, а втората вертикално, така че да се
пресичат в общия си знак.
Ако редиците нямат общ знак да се изведе само уведомително
съобщение.
Пример :
м
а
шапка
и
н
а
*/
public class Task_05_variant_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstWord, secondWord;

		do {
			System.out.println("Enter the first word");
			secondWord = sc.nextLine(); // ;) A little joke
			System.out.println("Enter the second word");
			firstWord = sc.nextLine(); // ;) Another little joke
			if (firstWord.contains(" ") || secondWord.contains(" ")) {
				System.out.println("Enter words but not sentences!");
			}
		} while (firstWord.contains(" ") || secondWord.contains(" "));

		int firstCharPosition = -1;
		int secondCharPosition = -1;

		for (int i = 0; i < secondWord.length(); i++) {
			if (firstWord.indexOf(secondWord.charAt(i)) > -1) {
				secondCharPosition = i;
				firstCharPosition = firstWord.indexOf(secondWord.charAt(i));
				break;
			}
		}

		if (firstCharPosition > -1) {
			for (int i = 0; i < firstWord.length(); i++) {
				for (int j = 0; j < secondWord.length(); j++) {
					if (i != firstCharPosition && j != secondCharPosition) {
						System.out.print(" ");
					} else if (i == firstCharPosition && j != secondCharPosition) {
						System.out.print(secondWord.charAt(j));
					} else if (i != firstCharPosition && j == secondCharPosition) {
						System.out.print(firstWord.charAt(i));
					} else if (i == firstCharPosition && j == secondCharPosition) {
						System.out.print(secondWord.charAt(j));
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("There are no matching letters!!!");
		}

		sc.close();
	}
}
