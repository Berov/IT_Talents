import java.util.Scanner;

public class Lesson2_task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� � ����� �� �������?");
		int obem = sc.nextInt();
		int broi = obem / 5;
		int ostatak = obem - broi * 5;
		if (ostatak == 0) {
			System.out.println("�� � ���������� " + broi + " ���� �� �� ������ ������ �� 2 � 3 �����");
		}
		if (ostatak == 1) {
			System.out.println("�� � ���������� " + (broi - 1) + " ���� �� �� ����� ������ �� 2 ����� � " + (broi+1) + " ���� �� �� ����� ������ �� ��� �����");
		}
		if (ostatak == 2) {
			System.out.println("�� � ���������� " + (broi + 1) + " ���� �� �� ����� ������ �� 2 ����� � " + broi + " ���� �� �� ����� ������ �� ��� �����");
		}
		if (ostatak == 3) {
			System.out.println("�� � ���������� " + broi + " ���� �� �� ����� ������ �� 2 ����� � " + (broi + 1) + " ���� �� �� ����� ������ �� ��� �����");
		}
		if (ostatak == 4) {
			System.out.println("�� � ���������� " + (broi+2) + " ���� �� �� ����� ������ �� 2 ����� � " + broi + " ���� �� �� ����� ������ �� ��� �����");
		}
		
		sc.close();
	}

}
