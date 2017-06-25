import java.util.Scanner;

/*Да се състави програма, чрез която се въвежда ред от символи
(стринг, низ).
Програмата да изведе на екрана дали въведения стринг е палиндром,
т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
*/
public class Task_08_variant_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word;
		System.out.println("Enter a word");
		do {
			word = sc.nextLine();
			if (word.contains(" ")) {
				System.out.println("Enter a word, not a sentence!");
			}
		} while (word.contains(" "));

		String invertedWord = "";
		for (int j = word.length() - 1; j >= 0; j--) {
			invertedWord = invertedWord.concat(word.substring(j, j + 1));
		}

		if (word.equals(invertedWord)) {
			System.out.println("The word \"" + word + "\" is palindrome");
		} else {
			System.out.println("The word \"" + word + "\" is not palindrome");
		}

		sc.close();
	}
}
