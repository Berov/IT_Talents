import java.util.Scanner;

public class Lesson8_task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете низ");
		String originalString = sc.nextLine();
		String correctedString = originalString;

		for (int i = 0; i < originalString.length(); i++) {
			int letter = originalString.charAt(i) + 5;
			correctedString = correctedString.replace(originalString.charAt(i), (char) letter);
		}
		System.out.println(correctedString);

		sc.close();
	}
}
