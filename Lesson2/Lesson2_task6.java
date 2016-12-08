<<<<<<< HEAD
import java.util.Scanner;

public class Lesson2_task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете едно число A1");
		int a1Number = sc.nextInt();
		System.out.println("Моля въведете друго число A2");
		int a2Number = sc.nextInt();
		System.out.println("Моля въведете трето число A3");
		int a3Number = sc.nextInt();

		int bufferNumber = a1Number;
		
		a1Number = a2Number;
		a2Number = a3Number;
		a3Number = bufferNumber;
		
		System.out.println("Вече А1 = " + a1Number + "\n" + "A2 = " + a2Number + "\n" + "и А3 = " + a3Number);

		sc.close();

	}
=======
import java.util.Scanner;

public class Lesson2_task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете едно число A1");
		int a1Number = sc.nextInt();
		System.out.println("Моля въведете друго число A2");
		int a2Number = sc.nextInt();
		System.out.println("Моля въведете трето число A3");
		int a3Number = sc.nextInt();

		int bufferNumber = a1Number;
		
		a1Number = a2Number;
		a2Number = a3Number;
		a3Number = bufferNumber;
		
		System.out.println("Вече А1 = " + a1Number + "\n" + "A2 = " + a2Number + "\n" + "и А3 = " + a3Number);

		sc.close();

	}
>>>>>>> 4a969ad4eab46524680d1bbb6fef5d8299720e82
}