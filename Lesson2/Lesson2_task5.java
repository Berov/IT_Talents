import java.util.Scanner;

public class Lesson2_task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете едно число");
		int xNumber = sc.nextInt();
		System.out.println("Моля въведете друго число");
		int yNumber = sc.nextInt();
		System.out.println("Моля въведете трето число");
		int zNumber = sc.nextInt();

		if (xNumber == yNumber || xNumber == zNumber || yNumber == zNumber) {
			System.out.println("Не ме прецаквай с еднакви числа, моля!!!");
		}

		if (xNumber > yNumber && xNumber > zNumber && yNumber > zNumber) {
			System.out.println(xNumber + "\n" + yNumber + "\n" + zNumber);
		}
		if (xNumber > yNumber && xNumber > zNumber && yNumber < zNumber) {
			System.out.println(xNumber + "\n" + zNumber + "\n" + yNumber);
		}

		if (yNumber > xNumber && yNumber > zNumber && xNumber > zNumber) {
			System.out.println(yNumber + "\n" + xNumber + "\n" + zNumber);
		}
		if (yNumber > xNumber && yNumber > zNumber && xNumber < zNumber) {
			System.out.println(yNumber + "\n" + zNumber + "\n" + xNumber);
		}

		if (zNumber > xNumber && zNumber > yNumber && xNumber > yNumber) {
			System.out.println(zNumber + "\n" + xNumber + "\n" + yNumber);
		}
		if (zNumber > xNumber && zNumber > yNumber && xNumber < yNumber) {
			System.out.println(zNumber + "\n" + yNumber + "\n" + xNumber);
		}

		sc.close();

	}
}

//Ох майко!