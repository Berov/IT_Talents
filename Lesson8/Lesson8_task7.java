import java.util.Scanner;

public class Lesson8_task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете няколко думи разделени с интервал!");
		String initPhrase = sc.nextLine().trim();
		int longestWordCounter = 0;
		int tempCounter = 0;

		String[] phrases = initPhrase.split(" ");

		for (int i = 0; i < phrases.length; i++) {
			tempCounter = 0;
			for (int j = 0; j < phrases[i].length(); j++) {
				tempCounter++;
				if (tempCounter > longestWordCounter) {
					longestWordCounter = tempCounter;
				}
			}
		}

		System.out.println(phrases.length + " думи, най дългата е с " + longestWordCounter + " символа");

		sc.close();
	}
}
