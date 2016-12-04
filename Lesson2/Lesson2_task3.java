import java.util.Scanner;

public class Lesson2_task3 {

	public static void main(String[] args) {
		System.out.println("Моля въведете първо цяло число X");
		Scanner sc = new Scanner(System.in);
		int xNumber = sc.nextInt();
		System.out.println("Моля въведете друго цяло число Y");
		int yNumber = sc.nextInt();

		if (xNumber == yNumber) {
			System.out.println("Не е честно! Помолих за ДРУГО цяло число, различно от първото... Сега няма да ги смятаааам  :(");
		} else {
			int zNumber = xNumber;
			xNumber = yNumber;
			yNumber = zNumber;
			System.out.println("Сега вече X = " + xNumber + " , a Y = " + yNumber);
		}

		sc.close();
	}

}
