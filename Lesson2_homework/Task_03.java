import java.util.Scanner;

/*Въведете 2 различни числа от конзолата и разменете стойността им.
Разпечатайте новите стойности
*/

public class Task_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете цяло число - А");
		int a = sc.nextInt();
		System.out.println("Въведете друго цяло число - Б");
		int b = sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("След малка магия вече А = " + a + ", а Б = " + b);

		/*
		 Разбира се може да се ползва и класическия вариант с трета променлива: 
		 int c = a; 
		 a = b; 
		 b = c;
		 */

		if (a == b) {
			System.out.println("Все пак помолихме да въведете различни числа...");
		}

		sc.close();
	}

}
