import java.util.Scanner;

/*По зададено число n, да се изведе на екрана таблица по следния начин:
	
Въведете n:		Въведете n:		Въведете n:		Въведете n:
1				2				3				4
0				11				222				3333
				33				444				5555
								666				7777
												9999
*/

public class Task_08_advanced {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a digit");
		int n = sc.nextInt();

		int maxNumber = (n - 1) + 2 * (n - 1);
		int maxBits = 0;
		do {
			maxNumber /= 10;
			maxBits++;
		} while (maxNumber != 0);

		for (int i = 1, step = n - 1; i <= n; i++, step += 2) {
			int numberBits = 0;
			int thisNumber = step;
			do {
				thisNumber /= 10;
				numberBits++;
			} while (thisNumber != 0);

			for (int j = 1; j <= n; j++) {
				System.out.print(step + " ");
				for (int j2 = 0; j2 < maxBits - numberBits; j2++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		sc.close();

	}

}
// The printed square is perfect always 
