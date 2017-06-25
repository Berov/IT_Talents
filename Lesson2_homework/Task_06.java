import java.util.Scanner;
/*Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
а3 да има старата стойност на а1.
*/

public class Task_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Моля въведете едно число A1");
		int a1 = sc.nextInt();
		System.out.println("Моля въведете друго число A2");
		int a2 = sc.nextInt();
		System.out.println("Моля въведете трето число A3");
		int a3 = sc.nextInt();

		int buffer = a1;

		a1 = a2;
		a2 = a3;
		a3 = buffer;

		System.out.println("Вече А1 = " + a1 + ", " + "A2 = " + a2 + " " + "и А3 = " + a3);

		sc.close();

	}

}
