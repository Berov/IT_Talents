import java.util.Scanner;

public class Lesson9_task4 {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Въведете начално число!");
			x = sc.nextInt();
			System.out.println("Въведете крайно число > от началното!");
			y = sc.nextInt();
		} while (x > y);
		printFunction(x, y, 1);
		sc.close();
	}

	// ----------end of main method
	static void printFunction(int x, int y, int z) {
		for (int i = 0; i < z; i++) {
			System.out.print(x);

			for (int j = 0; j <= (y + "").length() - (x + "").length(); j++) { //<--It's my best code for the moment!!! :)
				System.out.print(" ");
			}
		}
		System.out.println();
		if (!(x == y)) {
			printFunction(x + 1, y, z + 1);
		}
	}
}
