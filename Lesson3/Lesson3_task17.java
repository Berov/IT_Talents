import java.util.Scanner;

public class Lesson3_task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������ �� �������� (3..20)");
		int b = sc.nextInt();
		System.out.println("�������� ����� ����");
		char c = sc.next().charAt(0); // ���� �� ��� �� �����, �� �� ������ ������� � �������� ����� � ��������...

		if (b >= 3 && b <= 20) {
			for (int i = 1; i <= b; i++) {
				for (int ii = 1; ii <= b; ii++) {
					if (ii > 1 && ii < b && i > 1 && i < b) {
						System.out.print(c);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("������������ � �����!");
		}
		sc.close();
	}
}
