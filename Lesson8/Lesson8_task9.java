import java.util.Scanner;

public class Lesson8_task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете буквено-цифров низ!");
		String initPhrase = sc.nextLine().trim();
		int tempCounter = 0;
		int tempSum = 0;
		int flag = 1;
		int sum = 0;

		for (int i = 0; i < initPhrase.length(); i++) {
			if (initPhrase.charAt(i) >= 48 && initPhrase.charAt(i) <= 57) {
				if (i > 0 && initPhrase.charAt(i - 1) == '-') {
					flag = -1;
					System.out.print("-");
				} else {
					flag = 1;
				}

				for (int j = i; initPhrase.charAt(j) <= 57 && initPhrase.charAt(j) >= 48 && j < initPhrase.length(); j++) {
					System.out.print(initPhrase.charAt(j));
					
					if (initPhrase.charAt(j - 1) <= 57 && initPhrase.charAt(j - 1) >= 48) {
						tempCounter = tempCounter * 10 + (initPhrase.charAt(j) - 48);
					} else {
						tempCounter = (initPhrase.charAt(j) - 48);
					}
					sum = sum + tempCounter * flag;
					tempCounter = 0;
					i++;
				}
				System.out.println();
			}
		}
		System.out.println("Сумата на числата в стринга е " + sum);
		sc.close();
	}
}

// Unfinished!!! Doesn't work in all cases!!!