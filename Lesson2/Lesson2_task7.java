import java.util.Scanner;

public class Lesson2_task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� ������ ���");
		int hour = sc.nextInt();
		System.out.println("K���� ���� � �������� �����?");
		double sum = sc.nextDouble();
		System.out.println("����� �� �� ��� ��������? (����� = true/ ��� = false)");
		boolean health = sc.nextBoolean();
		
		System.out.println("������ ������ ����:");
		if(health!=true && sum>=10){
			System.out.println("�� ��������� ����� � ��� ���� �� �����!");
		}
		if(health!=true && sum<10){
			System.out.println("��� ������� ����� �� - ����� � ���� �� ����!");
		}
		if(health==true && sum>=10){
			System.out.println("����� �� ���� ���. ����� �� ���� � ����� ��������!");
		}
		if(health==true && sum<10){
			System.out.println("����� ��. ��� ���� �����!");
		}
		if(hour<8 || hour>22){
			System.out.println("�� �� ��� �� ����� �� - �� ���� ����� ����� ���-����� � �� �� �����");
		}
		if(hour<0 || hour>24){
			System.out.println("�� ���� �� ��������...");
		}
		
		
		sc.close();
	}

}
