import java.util.Scanner;

/*Да се състави програма, чрез която се въвежда изречение с отделни
думи.
Като резултат на екрана да се извежда същия текст, но всяка отделна
дума да започва с главна буква, а следващите я букви да са малки.
Пример: супер яката задача
Изход: Супер Яката Задача
*/
public class Task_06 {

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

		for (int i = 0; i < separatedText.length; i++) {
			System.out.print(separatedText[i].substring(0, 1).toUpperCase());
			for (int j = 1; j < separatedText[i].length(); j++) {
				System.out.print(separatedText[i].substring(j, j + 1).toLowerCase());
			}
			if (i < separatedText.length) {
				System.out.print(" ");
			}
		}

		sc.close();
	}
}
