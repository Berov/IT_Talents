import java.util.Scanner;

/*�� �� ������� ��������, ����� ������� ������� 10 ���-�����
�����, ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ ��
�������� ���������� �����.
������� �� ��������, ������ � ������ ������� �����.
������ �����: ����� �� ��������� [1..999]
������: 1
�����: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14

����������� ����� while.
*/
public class Task_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int counter = 1;
		int iteratoins = 10; // how many numbers to be shown

		do {
			System.out.println("Enter a number (1-9999)");
			n = sc.nextInt();
		} while (n < 1 || n > 9999);

		while (counter <= iteratoins) {
			while (n % 2 != 0 && n % 3 != 0 && n % 5 != 0) {
				n++;
			}
			System.out.print(counter + ":" + n);
			if (counter < iteratoins) {
				System.out.print(", ");
			}
			counter++;
			n++;
		}

		sc.close();
	}

}
