/* �� �� ������� ��������, ����� ������� ������
���������� ���������� �����, ����� ����� ������� ����� �.�.
100,101, 606 � �.�. �� �� ��������. 
*/
public class Task_12 {

	public static void main(String[] args) {

		for (int i = 100; i <= 999; i++) {
			int firstDigit = i / 100;
			int secondDigit = i / 10 % 10;
			int thirdDigit = i % 10;

			if (firstDigit != secondDigit && firstDigit != thirdDigit && secondDigit != thirdDigit) {
				System.out.println(i);
			}
		}
	}
}
