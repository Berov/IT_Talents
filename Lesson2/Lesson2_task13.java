import java.util.Scanner;

public class Lesson2_task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� � ������������� �����?");
		int temperature = sc.nextInt();
		if (temperature < -20) {
			System.out.println("����� � ������� ����");
		}
		if (temperature >= -20 && temperature < 0) {
			System.out.println("����� �� � �������");
		}
		if (temperature >= 0 && temperature < 15) {
			System.out.println("����� � ���������");
		}
		if (temperature >= 15 && temperature < 25) {
			System.out.println("����� �, �?");
		}
		if (temperature >= 25) {
			System.out.println("������ ������ ����, ����� ������ �� ������!");
		}
		
		sc.close();
	}

}
