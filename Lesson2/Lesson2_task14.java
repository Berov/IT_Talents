import java.util.Scanner;

public class Lesson2_task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������� �1");
		int x1 = sc.nextInt();
		System.out.println("�������� ������� Y1");
		int y1 = sc.nextInt();
		System.out.println("�������� ������� X2");
		int x2 = sc.nextInt();
		System.out.println("�������� ������� Y2");
		int y2 = sc.nextInt();

		if ((x1 + y1) % 2 == (x2 + y2) % 2) {
			System.out.println("������������� �� �������� � ������� ����");
		} else {
			System.out.println("������������� �� �� �������� � ������� ����");
		}
		sc.close();
	}

}
