import java.util.Scanner;

public class Lesson8_task4 {

	public static void main(String[] args) {
		int firstSum = 0;
		int secondSum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете пълните имена на двама човека, разделени със запетая!");
		String imputNames = sc.nextLine();
		String[] names = imputNames.split(",");

		String firstName = names[0];
		String secondName = names[1];
		String firstNameTrimmed = firstName.trim();
		String secondNameTrimmed = secondName.trim();

		for (int i = 0; i < firstNameTrimmed.length(); i++) {
			firstSum += firstNameTrimmed.charAt(i);
		}
		for (int i = 0; i < secondNameTrimmed.length(); i++) {
			secondSum += secondNameTrimmed.charAt(i);
		}

		if (firstSum > secondSum) {
			System.out.println(firstNameTrimmed);
		} else if (firstSum < secondSum) {
			System.out.println(secondNameTrimmed);
		} else if (firstSum == secondSum) {
			System.out.println("Имената са еднакви бе!");
		}

		sc.close();
	}
}
