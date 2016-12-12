import java.util.Scanner;

public class Lesson8_task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете няколко думи разделени с интервал!");
		String initPhrase = sc.nextLine().trim();

		String[] phrases = initPhrase.split(" ");

		for (int i = 0; i < phrases.length; i++) {
			System.out.print(phrases[i].substring(0, 1).toUpperCase());
			for (int j = 1; j < phrases[i].length(); j++) {
				System.out.print(phrases[i].substring(j, j + 1).toLowerCase());
			}
			if (i < phrases.length - 1) {
				System.out.print(" ");
			}
		}

		sc.close();
	}
}
