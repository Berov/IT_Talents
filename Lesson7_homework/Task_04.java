import java.util.Scanner;

/*Да се състави програма, чрез която по въведени трите имена на двама
човека разделени със запетая, се извежда чие име има по-голям сбор
от ASCII кодовете на съставящите името букви.
Пример: Anna Dosewa Asenowa, Iwo Peew Peew
Изход: Anna Dosewa Asenowa
*/
public class Task_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String names;
		int sum1 = 0, sum2 = 0;

		do {
			System.out.println("Please enter two man's names separated by a comma");
			names = sc.nextLine();
		} while (!names.contains(","));

		String[] separatedNames = names.split(",");

		for (int i = 0; i < separatedNames[0].length(); i++) {
			if (separatedNames[0].charAt(i) != ' ') {
				sum1 += separatedNames[0].charAt(i);
			}
		}
		for (int i = 0; i < separatedNames[1].length(); i++) {
			if (separatedNames[1].charAt(i) != ' ') {
				sum2 += separatedNames[1].charAt(i);
			}
		}

		if (sum1 == sum2) {
			System.out.println("Both names are with the same sum of ascii-codes!");
		} else if (sum1 > sum2) {
			System.out.println(separatedNames[0].trim());
		} else {
			System.out.println(separatedNames[1].trim());
		}

		sc.close();
	}
}
