import java.util.Scanner;

public class Lesson2_task3 {

	public static void main(String[] args) {
		System.out.println("���� �������� ����� ���� ����� X");
		Scanner sc = new Scanner(System.in);
		int xNumber = sc.nextInt();
		System.out.println("���� �������� ����� ���� ����� Y");
		int yNumber = sc.nextInt();

		if (xNumber == yNumber) {
			System.out.println("�� � ������! ������� �� ����� ���� �����, �������� �� �������... ���� ���� �� �� ���������  :(");
		} else {
			int zNumber = xNumber;
			xNumber = yNumber;
			yNumber = zNumber;
			System.out.println("���� ���� X = " + xNumber + " , a Y = " + yNumber);
		}

		sc.close();
	}

}
