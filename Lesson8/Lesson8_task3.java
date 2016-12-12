import java.util.Scanner;

public class Lesson8_task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String firstText;
		String secondText;
		String helpText = "";

		do {
			System.out.println("Моля въведете първи стринг без интервали");
			firstText = sc.nextLine();
			System.out.println("Моля въведете втори стринг без интервали");
			secondText = sc.nextLine();
		} while (firstText.contains(" ") || secondText.contains(" "));

		if (firstText.length() == secondText.length()) {
			System.out.println("Двата низа са с еднаква дължина");
			helpText = secondText;
		} else if (firstText.length() > secondText.length()) {
			System.out.println("Първият низ е с по-голяма дължина");
			helpText = secondText;
			for (int i = 0; i < firstText.length() - secondText.length(); i++) {
				helpText = helpText.concat(" ");
			}

		} else if (firstText.length() < secondText.length()) {
			System.out.println("Вторият низ е с по-голяма дължина");
			helpText = firstText;
			for (int i = 0; i < secondText.length() - firstText.length(); i++) {
				helpText = helpText.concat(" ");
			}
		}

		System.out.println("Разлика по позиции:");
		if (firstText.length() >= secondText.length()) {
			for (int i = 0; i < firstText.length(); i++) {
				if (firstText.charAt(i) != helpText.charAt(i)) {
					System.out.println("" + (i + 1) + " " + firstText.charAt(i) + "-" + helpText.charAt(i));
				}
			}
		} else {
			for (int i = 0; i < secondText.length(); i++) {
				if (secondText.charAt(i) != helpText.charAt(i)) {
					System.out.println("" + (i + 1) + " " + helpText.charAt(i) + "-" + secondText.charAt(i));
				}
			}
		}

		sc.close();
	}
}

