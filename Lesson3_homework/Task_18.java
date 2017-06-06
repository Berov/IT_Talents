import java.util.Scanner;

/*�� �� ������� ��������, ���� ����� �� ������� ��� ����� ��
��������� [1..9].
���������� �� ������� ��������� �� ���������.
������������ �������� �� ����������� � ���������� �� 2-��
�����.
*/
public class Task_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;

		do {
			System.out.println("Enter a number (1-9)");
			x = sc.nextInt();
			System.out.println("Enter another number (1-9)");
			y = sc.nextInt();
		} while (x < 1 || x > 9 || y < 1 || y > 9);

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				System.out.println(i + "*" + j + "=" + i * j + ";");
			}
			System.out.println();
		}

		sc.close();
	}

}
