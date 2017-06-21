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
public class Task_05_variant_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstWord, secondWord;
		int firstCrossIndex = -1, secondCrossIndex = -1;
		boolean flag = false;

		do {
			System.out.println("Enter the first word");
			firstWord = sc.nextLine();
			System.out.println("Enter the second word");
			secondWord = sc.nextLine();
			if (firstWord.contains(" ") || secondWord.contains(" ")) {
				System.out.println("Enter words but not sentences!");
			}
		} while (firstWord.contains(" ") || secondWord.contains(" "));

		for (int i = 0; i < firstWord.length(); i++) {
			for (int j = 0; j < secondWord.length(); j++) {
				if (firstWord.charAt(i) == secondWord.charAt(j)) {
					firstCrossIndex = j;
					secondCrossIndex = i;
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}

		if (flag) {
			char[][] arr = new char[secondWord.length()][firstWord.length()];
			for (int i = 0; i < firstWord.length(); i++) {
				arr[firstCrossIndex][i] = firstWord.charAt(i);
			}
			for (int i = 0; i < secondWord.length(); i++) {
				arr[i][secondCrossIndex] = secondWord.charAt(i);
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		} else {
			System.out.println("There are no matching letters!!!");
		}

		sc.close();
	}
}
