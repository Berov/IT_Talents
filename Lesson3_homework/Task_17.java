import java.util.Scanner;

/*Да се състави програма, която извежда квадрат, чийто страни са
оформени със знака *, а вътрешността е запълнена със въведен
знак.
Входни данни b - дължина на страната число от интервала
[3..20], c - желан знак.
Програмата да използва цикъл for
*/

public class Task_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short x;
		char y;

		do {
			System.out.println("Enter a number (3-20)");
			x = sc.nextShort();
			System.out.println("Enter a char");
			y = sc.next().charAt(0);
		} while (x < 3 || x > 20);

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x; j++) {
				if (i == 1 || i == x || j == 1 || j == x) {
					System.out.print("*");
				} else {
					System.out.print(y);
				}
			}
			System.out.println();
		}

		sc.close();
	}

}
