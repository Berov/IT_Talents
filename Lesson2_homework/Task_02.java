import java.util.Scanner;

/*Въведете 2 различни цели числа от конзолата. Запишете тяхната сума,
разлика, произведение, остатък от деление и целочислено деление в
отделни променливи и разпечатайте тези резултати в конзолата.
Опитайте същото с числа с плаваща запетая.
*/

public class Task_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете цяло число!");
		int a = sc.nextInt();
		System.out.println("Въведете друго цяло число!");
		int b = sc.nextInt();

		int sum = a + b;
		int substraction = a - b;
		int multiplication = a * b;
		int division = a / b;
		int modulus = a % b;

		System.out.println("Сумата на числата е " + sum);
		System.out.println("Разликата на числата е " + substraction);
		System.out.println("Произведението на числата е " + multiplication);
		System.out.println("При целочислено деление се получава " + division);
		System.out.println("Остатъкът при целочислено деление на числата е " + modulus);
		
		System.out.println();
		System.out.println();

		System.out.println("Въведете число с десетична запетая!");
		double a2 = sc.nextDouble();
		System.out.println("Въведете друго число с десетична запетая!");
		double b2 = sc.nextDouble();

		double sum2 = a2 + b2;
		double substraction2 = a2 - b2;
		double multiplication2 = a2 * b2;
		double division2 = a2 / b2;
		double modulus2 = a2 % b2;

		System.out.println("Сумата на числата е " + sum2);
		System.out.println("Разликата на числата е " + substraction2);
		System.out.println("Произведението на числата е " + multiplication2);
		System.out.println("При деление се получава " + division2);
		System.out.println("Остатъкът при целочислено деление на числата е " + modulus2); // What happens?

		sc.close();

	}

}
