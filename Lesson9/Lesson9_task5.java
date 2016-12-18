import java.util.Scanner;

public class Lesson9_task5 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете естествено число!");
		x = sc.nextInt();

		palindromeFunction(x, -1, x);
		sc.close();

	}

	// ----------end of main method

	static void palindromeFunction(int x, int z, int y) {
		if ((x + "").length() == 1 && z == -1) {
			System.out.println("Числото е едноцифрено!");
			return;
		}
		if (z == -1 && (x + "").length() > 1) {
			palindromeFunction(x / 10, x % 10, y);
		}
		if ((x + "").length() > 1 && z != -1) {
			palindromeFunction(x / 10, z * 10 + x % 10, y);
		}
		if ((x + "").length() == 1) {
			z = z * 10 + x;
			System.out.print(z);
			if (z == y) {
				System.out.println(" - Числото е палиндром");
				return;
			} else {
				System.out.println(" - Числото не е палиндром");
				return;
			}
		}
	}
}
