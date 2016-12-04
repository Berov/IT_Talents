
public class Lesson6_task1 {

	public static void main(String[] args) {

		int[][] arr2d = {
				{ 2, 3, 8, -3, 5 },
				{ 9, 4, 2, 1, 10 },
				{ 7, 0, 0, -8, 1 },
				{ 2, 9, 11, 7, 1 },
				{ 5, 2, 9, 2, 13 },
				{ 1, 2, 3, 99, 5 }
				};
		
		int min = arr2d[0][0];
		int max = arr2d[0][0];

		for (int i = 0; i < arr2d.length; i++) {
			for (int ii = 0; ii < arr2d[i].length; ii++) {
				if (arr2d[i][ii] < min) {
					min = arr2d[i][ii];
				}
				if (arr2d[i][ii] > max) {
					max = arr2d[i][ii];
				}
			}
		}

		System.out.println("Най-малкото число в масива е " + min);
		System.out.println("Най-голямото число в масива е " + max);
	}

}
