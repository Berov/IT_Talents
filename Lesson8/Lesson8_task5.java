import java.util.Scanner;

public class Lesson8_task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете първа дума");
		String firstWord = sc.nextLine();
		System.out.println("Моля въведете втора дума");
		String secondWord = sc.nextLine();
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
			System.out.println("Думите нямат съвпадащи букви!");
		}

		sc.close();
	}
}

//It was terrible!!!