import java.util.Scanner;

public class Lesson8_task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String firstWord;
		String secondWord;

		do {
			System.out.println("Моля въведете първа дума (7-20 букви)");
			firstWord = sc.nextLine();
			System.out.println("Моля въведете втора дума (7-20 букви)");
			secondWord = sc.nextLine();
		} while (firstWord.length() > 20 || secondWord.length() > 20 || firstWord.length() < 7 || secondWord.length() < 7);

		int wordLength = (firstWord.length() > secondWord.length() ? firstWord.length() : secondWord.length());

		String subFirstWord = firstWord.replace(firstWord.substring(0, 5), secondWord.substring(0, 5));
		String subSecondWord = secondWord.replace(secondWord.substring(0, 5), firstWord.substring(0, 5));

		System.out.println("По-дългата дума е " + wordLength + " знака");
		System.out.println(subFirstWord);
		System.out.println(subSecondWord);

		sc.close();
	}
}
