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
		printFunction(x, y, x);
		sc.close();
	}

	// ----------end of main method
	static void printFunction(int x, int y, int z) {
		for (int i = x; i <= z; i++) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		if (!(z == y)) {
			printFunction(x, y, z + 1);
		}
	}
}
