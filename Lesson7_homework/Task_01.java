import java.util.Scanner;

/*Да се състави програма, чрез която се въвеждат два низа съдържащи
до 40 главни и малки букви.
Като резултат на екрана да се извеждат низовете само с главни и само
с малки букви.
*/
public class Task_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text1 = new String();
		String text2 = new String();

		do {
			System.out.println("Enter the first string (max 40 letters)");
			text1 = sc.nextLine();
			System.out.println("Enter the second string (max 40 letters)");
			text2 = sc.nextLine();
			if (text1.length() > 40 || text2.length() > 40) {
				System.out.println("Please enter strings less than 40 letters!");
			}
		} while (text1.length() > 40 || text2.length() > 40);

		System.out.print(text1.toLowerCase() + " ");
		System.out.println(text2.toLowerCase());
		System.out.print(text1.toUpperCase() + " ");
		System.out.println(text2.toUpperCase());

		sc.close();
	}
}
