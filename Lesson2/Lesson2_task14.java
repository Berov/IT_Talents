import java.util.Scanner;

public class Lesson2_task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете позиция Х1");
		int x1 = sc.nextInt();
		System.out.println("Въведете позиция Y1");
		int y1 = sc.nextInt();
		System.out.println("Въведете позиция X2");
		int x2 = sc.nextInt();
		System.out.println("Въведете позиция Y2");
		int y2 = sc.nextInt();

		if ((x1 + y1) % 2 == (x2 + y2) % 2) {
			System.out.println("Квадратчетата са оцветени в еднакъв цвят");
		} else {
			System.out.println("Квадратчетата не са оцветени в еднакъв цвят");
		}
		sc.close();
	}

}
