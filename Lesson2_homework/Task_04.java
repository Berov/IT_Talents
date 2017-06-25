import java.util.Scanner;

/*Въведете 2 различни числа от конзолата и ги разпечатайте в
нарастващ ред.
*/

public class Task_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Моля въведете цяло число!");
		int x = sc.nextInt();
		System.out.println("Моля въведете друго цяло число!");
		int y = sc.nextInt();

		System.out.print("Числата в нарастващ ред са: ");
		if (x < y) {
			System.out.print(x + ", " + y);
		} else {
			System.out.print(y + ", " + x);
		}

		if (x == y) {
			System.out.println(" <--- тъпо,а! Помолихме да въведете различни числа...");
		}

		sc.close();
	}

}
