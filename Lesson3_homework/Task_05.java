import java.util.Scanner;

/* �� �� ������� �� ����������� 2 �����. � �� ��
������� �� ������ ������ ����� �� ��-������� �� ��-��������.
*/

public class Task_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		int y;

		do {
			System.out.println("Enter a number");
			x = sc.nextInt();

			System.out.println("Enter another number");
			y = sc.nextInt();
		} while (x == y);

		if (x > y) {
			x = x + y;
			y = x - y;
			x = x - y;
		}

		for (int i = x; i <= y; i++) {
			System.out.println(i);
		}

		sc.close();

	}

}
