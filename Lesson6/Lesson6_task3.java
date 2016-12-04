
public class Lesson6_task3 {

	public static void main(String[] args) {
		double[][] arr2d = {
				{ 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1 },
				{ 2, 1, 1, 1, 1, 1 }
				};
		double sum = 0;
		double med = 0;

		for (int i = 0; i < arr2d.length; i++) {
			for (int ii = 0; ii < arr2d[i].length; ii++) {
				sum = sum + arr2d[i][ii];
			}
		}

		System.out.println("Сумата от елементите на масива е " + sum);
		med = sum / (arr2d.length * arr2d[0].length);
		System.out.println("Средноаритметичното е " + med);

	}

}
