
public class Lesson6_task7 {

	public static void main(String[] args) {

		int[][] arr2d = {
				{ 9, 2, 3, 4, 5, 6 },
				{ 2, 3, 4, 5, 6, 7 },
				{ 0, 1, 2, 3, 4, 5 },
				{ 3, 4, 5, 6, 7, 8 },
				{ 2, 2, 2, 2, 2, 2 },
				{ 3, 3, 3, 3, 3, 3 }
				};

		int[] sum = new int[arr2d.length];

		for (int i = 0; i < arr2d.length; i++) {
			if (i == 0 || i == 2 || i == 4) {
				sum[i] = arr2d[i][0] + arr2d[i][2] + arr2d[i][4];
				System.out.print(arr2d[i][0] + "," + arr2d[i][2] + "," + arr2d[i][4] + " - сума от елементите на реда:"
						+ sum[i]);
			} else {
				sum[i] = arr2d[i][1] + arr2d[i][3] + arr2d[i][5];
				System.out.print(arr2d[i][1] + "," + arr2d[i][3] + "," + arr2d[i][5] + " - сума от елементите на реда:"
						+ sum[i]);
			}
			System.out.println();
		}

		System.out.println("Сума на елементите - " + (sum[0] + sum[1] + sum[2] + sum[3] + sum[4] + sum[5]));

	}

}
