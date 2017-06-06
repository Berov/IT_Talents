import java.util.Scanner;

/*Дадено е наредено тесте карти.
Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама,
Поп, Асо.
Наредбата по цвят на картите е: спатия, каро, купа, пика.
Да се създаде програма, чрез която се въвежда N - число от
интервала [1..51] и се извеждат въведения номер карта и
останалите по-големи карти от тестето. 

Пример: 47.
Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо купа, Асо пика

*/

/*
my helper
 _______ ___ ___ 
|     K♠| D♠| J♠|
|       |   |   |
|       |   |   |
|       |   |   |
|♠K_____|___|___|

*/

public class Task_21_advanced {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int card = 1;

		do {
			System.out.println("Enter a card index (1-51)");
			n = sc.nextInt();
		} while (n < 1 || n > 51);

		System.out.print(" ____");
		for (int j2 = n; j2 <= 52; j2++) {
			System.out.print("___ ");
		}
		System.out.print("\n|    ");

		for (int i = 1; i <= 13; i++) { // cards
			for (int j = 1; j <= 4; j++) { // colors
				if (card >= n) {
					switch (i) {
					case 1:
						System.out.print(" 2");
						break;
					case 2:
						System.out.print(" 3");
						break;
					case 3:
						System.out.print(" 4");
						break;
					case 4:
						System.out.print(" 5");
						break;
					case 5:
						System.out.print(" 6");
						break;
					case 6:
						System.out.print(" 7");
						break;
					case 7:
						System.out.print(" 8");
						break;
					case 8:
						System.out.print(" 9");
						break;
					case 9:
						System.out.print("10");
						break;
					case 10:
						System.out.print(" J");
						break;
					case 11:
						System.out.print(" D");
						break;
					case 12:
						System.out.print(" K");
						break;
					case 13:
						System.out.print(" A");
						break;
					}

					switch (j) {
					case 1:
						System.out.print("♣|");
						break;
					case 2:
						System.out.print("♦|");
						break;
					case 3:
						System.out.print("♥|");
						break;
					case 4:
						System.out.print("♠|");
						break;
					}
				}
				card++;
			}
		}

		for (int j3 = 1; j3 < 4; j3++) {
			System.out.print("\n|    ");
			for (int j2 = n; j2 <= 52; j2++) {
				System.out.print("   |");
			}
		}

		System.out.print("\n|____");
		for (int j2 = n; j2 <= 52; j2++) {
			System.out.print("___|");
		}

		sc.close();
	}
}

/*
 * Смятам, че дадения в условието пример не отговаря на самото условие и бих
 * решил задачата по друг начин.
 */
