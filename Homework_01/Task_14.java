import java.util.Scanner;

/*Да се състави програма, която по въведени координати на 2 позиции
от шахматната дъска извежда отговор дали са оцветени в еднакъв или
различен цвят.
Шахматната дъска е квадратна.
Въвеждат се две двойки числа от интервала [1..8].
*/

public class Task_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете позиция Х1");
		int x1 = sc.nextInt();
		System.out.println("Въведете позиция Y1");
		int y1 = sc.nextInt();
		System.out.println("Въведете позиция X2");
		int x2 = sc.nextInt();
		System.out.println("Въведете позиция Y2");
		int y2 = sc.nextInt();
		boolean flag = true;

		if (x1 < 1 || x1 > 8 || x2 < 1 || x2 > 8 || y1 < 1 || y1 > 8 || y2 < 1 || y2 > 8) {
			System.out.println("На шахматната дъска няма такива позиции!");
			flag = false;
		}
		if (flag) {
			if ((x1 + y1) % 2 == (x2 + y2) % 2) {
				System.out.println("Позициите са оцветени в еднакъв цвят");
			} else {
				System.out.println("Позициите не са оцветени в еднакъв цвят");
			}
		}
		
		sc.close();
	}

}
