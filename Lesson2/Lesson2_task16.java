
public class Lesson2_task16 {

	public static void main(String[] args) {
		int abc = 947; // ���������� ����� �� ��� abc
		int a = abc / 100;
		int b = (abc - a * 100) / 10;
		int c = (abc - a * 100 - b * 10);

		if (a == b && b == c) {
			System.out.println("������� �� �����");
		} else if (a > b && b > c) {
			System.out.println("������� �� � �������� ���");
		} else if (a < b && b < c) {
			System.out.println("������� �� ��� �������� ���");
		} else {
			System.out.println("������� �� ����������");
		}

	}

}
