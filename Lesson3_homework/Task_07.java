import java.util.Scanner;

/*���������� �� 3, �� �� ������� �� ������ ������� n
����� ����� �� ����� �� 3. ������� �� �� ��������� ��� �������.
*/

public class Task_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.println("Enter a positive integer N");
			n = sc.nextInt();
		} while (n < 1);

		for (int i = 1, starter = 3; i <= n; i++, starter += 3) {
			System.out.print(starter);
			if (i < n) {
				System.out.print(",");
			}
		}

		sc.close();

	}

}
