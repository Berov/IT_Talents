import java.util.Scanner;

public class Lesson8_task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете дума!");
		String initPhrase = sc.nextLine().trim();
		boolean flag = false;

		for (int i = 0, j = initPhrase.length(); i < initPhrase.length() / 2; i++, j--) {
			if (!initPhrase.substring(i, i + 1).equals(initPhrase.substring(j - 1, j))) {
				System.out.println("Думата не е пaлиндром!");
				flag = false;
				break;
			} else {
				flag = true;
			}
		}

		if (flag) {
			System.out.println("Думата е пaлиндром :)");
		}

		sc.close();
	}
}
