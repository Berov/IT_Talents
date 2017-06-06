import java.util.Scanner;

/* �� �� ������� ��������, ���� ����� �� ��������
���������� ����� �� ��������� [10..99] �� ������� ��������
�����, ��� �������� �� �������� ����������:
1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
����������� ���������� ������ �� �� ������ �������� 1
*/
public class Task_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.println("Enter a number (10-99)");
			n = sc.nextInt();
		} while (n < 10 || n > 99);
		int temp = n;

		while (n > 1) {
			if (temp % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			System.out.print(n + " ");
			temp = n;
		}

		sc.close();
	}

}
