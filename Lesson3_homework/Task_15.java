import java.util.Scanner;

/* �� �� ������� ��������, ����� �� ������� ������ ��
������ ����� �� 1 �� �������� ����� N.
����������� ����� do-while.
*/
public class Task_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		long sum = 0;
		int counter = 1;

		do {
			System.out.println("Enter a positive number");
			n = sc.nextInt();
		} while (n < 1);

		do {
			sum += counter;
			counter++;
		} while (counter <= n);

		System.out.println("The sum of 1 to " + n + " is " + sum);

		sc.close();
	}

}
