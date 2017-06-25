import java.util.Scanner;

/*Да се състави програма, която чете набор от думи разделени с
интервал.
Като резултат да се извеждат броя на въведените думи, както и броя
знаци в най-дългата дума.
Пример: asd fg hjkl
Изход: 3 думи, най-дългата е с 4 символа.
*/
public class Task_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;

		do {
			System.out.println("Enter a sentence");
			text = sc.nextLine().trim();
			if (!text.contains(" ")) {
				System.out.println("Please enter a sentence, not a word or something else! Come on again!");
			}
		} while (!text.contains(" "));

		String[] separatedText = text.split(" ");

		int longerLength = 0;
		for (int i = 0; i < separatedText.length; i++) {
			if (separatedText[i].length() > longerLength) {
				longerLength = separatedText[i].length();
			}
		}

		System.out.println("There are " + separatedText.length + " words.");
		System.out.println("The longer word has " + longerLength + " chars.");

		sc.close();
	}
}
