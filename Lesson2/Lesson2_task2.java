import java.util.Scanner;

public class Lesson2_task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� ���� �����");
		int first = sc.nextInt();
		System.out.println("���� �������� ����� ���� �����");
		int second = sc.nextInt();

		int xAddition = first + second;
		int xSubstraction = first - second;
		int xMultiplication = first * second;
		int xModulus = first % second;
		int xDevision = first / second;

		System.out.println("������ �� ������ ����� � " + xAddition);
		System.out.println("��������� �� ������ ����� � " + xSubstraction);
		System.out.println("�������������� �� ������ ����� � " + xMultiplication);
		if (first < second) {
			System.out.println("������� �� ����� � ��-����� �� �������, ���� �� ���� ������� ��� �������");
		} else {
			System.out.println("��������� �� ����������� ������� �� ������ ����� � " + xModulus);
		}
		if (first < second) {
			System.out.println("������� �� ����� � ��-����� �� �������, ���� �� ���� ����������� �������");
		} else {
			System.out.println("������������� ������� �� ������ ����� � " + xDevision);
		}

		
		//System.out.println();
		//System.out.println("���� �������� ����� � ��������� �������");
		//double firstDouble = sc.nextDouble();
		//System.out.println("���� �������� ����� ����� � ��������� �������");
		//double secondDouble = sc.nextDouble();

		//double xAdditionDouble = firstDouble + secondDouble;
		//double xSubstractionDouble = firstDouble - secondDouble;
		//double xMultiplicationDouble = firstDouble * secondDouble;
		//double xModulusDouble = firstDouble % secondDouble;
		//double xDevisionDouble = firstDouble / secondDouble;

		//System.out.println("������ �� ������ ����� � " + xAdditionDouble);
		//System.out.println("��������� �� ������ ����� � " + xSubstractionDouble);
		//System.out.println("�������������� �� ������ ����� � " + xMultiplicationDouble);
		//System.out.println("������� �� � ������� �������, ���� �� ���� ������� ��� ������! ������� ���� (�� ���� ����) ��������� % �� �������  "+ xModulusDouble);
		//System.out.println("��������� �� ������ ����� � " + xDevisionDouble);
		
		// ���� � ��������� ������� � �����! ����� ���� ���� ������� ���������. �������������� ���� ����� ���� �� ��������� �������. ������� ��� ��-������ ���������
		
		sc.close();
	}
}
