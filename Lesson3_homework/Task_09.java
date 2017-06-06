import java.util.Scanner;

/*�� �� �������� 2 ����� �� ������������ � � �.
�� �� ������� ������ ����� �� � �� � �� ������ 2(��������� �
�������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� ��
������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
������������) ����� ��-������ �� 200, �� �� �������� �����������.
*/

public class Task_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		do {
			System.out.println("Enter a number");
			a = sc.nextInt();
			System.out.println("Enter a bigger number");
			b = sc.nextInt();
		} while (a >= b);

		int sum = 0;

		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.print("skip 3, ");
			} else {
				System.out.print(i * i);
				sum += i * i;

				if (sum > 200) {
					break;
				} else {
					System.out.print(", ");
				}
			}
		}

		sc.close();

	}

}
