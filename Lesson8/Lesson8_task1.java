import java.util.Scanner;

public class Lesson8_task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String firstText;
		String secondText;
		
		do {
			System.out.println("Моля въведете първи стринг");
			firstText = sc.nextLine();
			System.out.println("Моля въведете втори стринг");
			secondText = sc.nextLine();
		} while (firstText.length() >= 40 || secondText.length() >=40);

		System.out.println("Първи стринг с малки букви: " + firstText.toLowerCase());
		System.out.println("Първи стринг с големи букви: " + firstText.toUpperCase());
		System.out.println("Втори стринг с малки букви: " + secondText.toLowerCase());
		System.out.println("Втори стринг с големи букви: " + secondText.toUpperCase());

		sc.close();
	}
}
