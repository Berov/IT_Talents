
public class Lesson6_task5 {

	public static void main(String[] args) {
		int[][] arr2d = {
				{ 1, 8, 9, 1 },
				{ 1, 1, 1, 1 },
				{ 1, 1, 1, 1 },
				{ 1, 1, 1, 1 }
				};
		int sumRows = 0;
		int tempRows = 0;
		int sumCols = 0;
		int tempCols = 0;

		for (int i = 0; i < arr2d.length; i++) {
			for (int ii = 0; ii < arr2d[i].length; ii++) {
				tempRows = tempRows + arr2d[i][ii];
				if (sumRows < tempRows) {
					sumRows = tempRows;
				}
			}
			tempRows = 0;
		}

		for (int i = 0; i < arr2d[0].length; i++) {
			for (int ii = 0; ii < arr2d.length; ii++) {
				tempCols = tempCols + arr2d[ii][i];
				if (sumCols < tempCols) {
					sumCols = tempCols;
				}
			}
			tempCols = 0;
		}

		System.out.println("���-�������� ���� �� ������ � " + sumRows);
		System.out.println("���-�������� ���� �� ������ � " + sumCols);
		
		if (sumRows < sumCols) {
			System.out.print("������������ ���� �� ������ < �� ������������ ���� �� ������");
		} else if(sumRows > sumCols){
			System.out.print("������������ ���� �� ������ > �� ������������ ���� �� ������");
		} else if(sumRows == sumCols){
			System.out.print("������������ ���� �� ������ = �� ������������ ���� �� ������");
		}

	}

}
