import java.util.Scanner;

/*Да се състави програма, която въвежда естествено число от интервала
[0..24].
Програмата да изведе съответстващо съобщение съобразно въведения
час.
Периодите са:
[18..4] - Добър вечер;
[4..9] - Добро утро;
[9..18] - Добър ден
*/

public class Task_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Колко е часа (0-24)?");
		int time = sc.nextInt();

		if (time >= 4 && time < 9) {
			System.out.println("Добро утро!");
		}
		if (time >= 9 && time < 18) {
			System.out.println("Добър ден!");
		}
		if ((time >= 18 && time <= 24) || (time >= 0 && time < 4)) {
			System.out.println("Добър вечер!");
		}
		if (time < 0 || time > 24) {
			System.out.println("Интересен часовник!");
		}

		sc.close();
	}

}
