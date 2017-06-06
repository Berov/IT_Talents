import java.util.Scanner;

/* �� �� ������� ��������, ����� �� ��������
���������� ����� N �� ��������� [10..200] ������� � �������
��� ������ �����, ����� �� ������ �� 7 � �� ��-����� �� N.
*/
public class Task_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.println("Enter a number (10-200)");
			n = sc.nextInt();
		} while (n < 10 || n > 200);

		for (int i = n; i > 0; i--) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
