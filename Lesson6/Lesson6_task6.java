
public class Lesson6_task6 {

	public static void main(String[] args) {

		int[][] arr2d = {
				{ 1, 2, 3, 4, 5, 6 },
				{ 2, 3, 4, 5, 6, 7 },
				{ 0, 1, 2, 3, 4, 5 },
				{ 3, 4, 5, 6, 7, 8 },
				{ 2, 2, 2, 2, 2, 2 },
				{ 3, 3, 3, 3, 3, 3 }
				};
		int[] sum = { 0, 0, 0 };

		for (int i = 1, s = 0; i < arr2d.length; i += 2, s++) {
			for (int ii = 0; ii < arr2d[i].length; ii++) {
				System.out.print(arr2d[i][ii]);
				if (ii >= 0 && ii < arr2d[i].length - 1) {
					System.out.print(",");
				}
				sum[s] = sum[s] + arr2d[i][ii];
			}
			System.out.println(" сума - " + sum[s]);
		}

		System.out.println("Сума на елементите - " + (sum[0] + sum[1] + sum[2]));

	}

}
