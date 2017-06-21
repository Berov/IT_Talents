import java.util.Scanner;

/*Да се състави програма, чрез която от клавиатурата се въвеждат
последователно две думи с дължина 10-20 знака.
Програмата да размени първите им 5 знака и да изведе дължината на
по-дългата, както и новото им съдържание.
Пример: uchilishe uchenik
Изход: 9 uchenishe
*/
public class Task_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text1 = new String();
		String text2 = new String();
		boolean flag;

		do {
			flag = false;
			System.out.println("Enter the first word (6-20 letters)");
			text1 = sc.nextLine();
			System.out.println("Enter the second word(6-20 letters)");
			text2 = sc.nextLine();

			if (text1.contains(" ") || text2.contains(" ")) {
				System.out.println("Must to be a word not a sentence!");
				flag = true;
			}
			if (text1.length() < 6 || text1.length() > 20 || text2.length() < 6 || text2.length() > 20) {
				System.out.println("Must to be 6-20 letters!!! Come on again!");
			}
		} while (text1.length() < 6 || text1.length() > 20 || text2.length() < 6 || text2.length() > 20 || flag);

		System.out.println("The longer's word length is: " + (text1.length() > text2.length() ? text1.length() : text2.length()) + " letters");

		System.out.print("The new word is: ");
		if (text1.length() > text2.length()) {
			System.out.println(text2.substring(0, 5) + text1.substring(5));
		} else {
			System.out.println(text1.substring(0, 5) + text2.substring(5));
		}

		sc.close();
	}
}
