import java.util.Scanner;

public class Lesson2_task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете едно число");
		int xNumber = sc.nextInt();
		System.out.println("Моля въведете друго число");
		int yNumber = sc.nextInt();
		if (xNumber == yNumber) {
			System.out.println("Нали помолих за ДРУГО число!!!");
		}
		if (xNumber > yNumber) {
			System.out.println(yNumber + "\n" + xNumber);
		}
		if (xNumber < yNumber) {
			System.out.println(xNumber + "\n" + yNumber);
		}

		sc.close();
	}

}
