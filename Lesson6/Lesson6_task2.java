import java.util.Scanner;

public class Lesson6_task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������ �� ����������� �������");
		int matrixSize = sc.nextInt();
		int[][] arr2d = new int[matrixSize][matrixSize];

		for (int i = 0; i < matrixSize; i++) {
			for (int ii = 0; ii < matrixSize; ii++) {
				System.out.println("�������� ������� [" + i + "][" + ii + "] �� ���������");
				arr2d[i][ii] = sc.nextInt();
			}
		}

		System.out.println("���������� ����� ����������� ��������:");
		for (int i = 0; i < arr2d.length; i++) {
			for (int ii = 0; ii < arr2d[i].length; ii++) {
				if (ii > 0 & ii < arr2d.length) {
					System.out.print('\t');
				}
				System.out.print(arr2d[i][ii]);
			}
			System.out.println();
		}

		System.out.print("������ �������� �� ��������� �:");
		for (int i = 0; i < arr2d.length; i++) {
			System.out.print(arr2d[i][i] + " ");
		}

		System.out.println();

		System.out.print("������� �������� �� ��������� �:");
		for (int i = 0, ii = arr2d.length - 1; i < arr2d.length; i++, ii--) {
			System.out.print(arr2d[i][ii] + " ");
		}

		sc.close();

	}

}
