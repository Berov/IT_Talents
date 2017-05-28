import java.util.Scanner;

/*Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
ред.
*/

public class Task_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете цяло число!");
		int x = sc.nextInt();
		System.out.println("Въведете друго цяло число!");
		int y = sc.nextInt();
		System.out.println("Моля въведете и трето цяло число!");
		int z = sc.nextInt();

		if (x == y || y == z || z == x) {
			System.out.println("Има въведени еднакви числа! Помолихме да въведете различни числа!");
		}
		if (x > y && x > z && y > z) {
			System.out.println("Числата в низходящ ред:");
			System.out.println(x + "\n" + y + "\n" + z);
		}
		if (x > y && x > z && y < z) {
			System.out.println("Числата в низходящ ред:");
			System.out.println(x + "\n" + z + "\n" + y);
		}

		if (y > x && y > z && x > z) {
			System.out.println("Числата в низходящ ред:");
			System.out.println(y + "\n" + x + "\n" + z);
		}
		if (y > x && y > z && x < z) {
			System.out.println("Числата в низходящ ред:");
			System.out.println(y + "\n" + z + "\n" + x);
		}

		if (z > x && z > y && x > y) {
			System.out.println("Числата в низходящ ред:");
			System.out.println(z + "\n" + x + "\n" + y);
		}
		if (z > x && z > y && x < y) {
			System.out.println("Числата в низходящ ред:");
			System.out.println(z + "\n" + y + "\n" + x);
		}

		sc.close();
	}

}
