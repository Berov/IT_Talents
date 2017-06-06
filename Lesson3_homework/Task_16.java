import java.util.Scanner;

/*�� �� ������� ��������, ���� ����� �� �������� 2 ����������
����� N, M �� ��������� [10..5555].
����������, ���� ����� for, �� ������� ������ ����� ��
���������, ����� �� ������ �� 50 � �������� ���.
*/
public class Task_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		boolean noNumbers = true;

		do {
			System.out.println("Enter a number m (10-5555)");
			m = sc.nextInt();
			System.out.println("Enter a number n (10-5555)");
			n = sc.nextInt();
		} while (n < 10 || n > 5555 || m < 10 || m > 5555);

		if (m > n) {
			m = m + n; // can be swapped with third temp variable
			n = m - n;
			m = m - n;
		}

		for (int i = n; i >= m; i--) {
			if (i % 50 == 0) {
				System.out.print(i);
				if (i - 50 >= m) {
					System.out.print(",");
				}
				noNumbers = false;
			}
		}

		if (noNumbers) {
			System.out.println("In this range (" + n + "-" + m + ") no numbers divided to 50");
		}

		sc.close();
	}

}
