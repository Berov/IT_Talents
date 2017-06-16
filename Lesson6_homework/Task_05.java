/*Да се състави програма, при която предварително са въведени
естествени числа в двумерен масив 4*4 елемента.
Програмата да извежда резултат от проверката какво е съотношението
на най-голямата сума по редове спрямо най-голямата сума по колони.
Пример:
1,2,3,4
5,6,7,8
9,10,11,12
13,14,15,16
Изход:
най-голяма сума по редове 58
най-голяма сума по колони 40
Максималната сума по редове е > от максималната сума по колони
*/
public class Task_05 {

	public static void main(String[] args) {
		int[][] arr = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 } 
				};
		int rowMax = 0;
		int colMax = 0;

		for (int i = 0; i < arr.length; i++) {
			int rowTemp = 0;
			for (int j = 0; j < arr[i].length; j++) {
				rowTemp += arr[i][j];
			}
			if (rowTemp > rowMax) {
				rowMax = rowTemp;
			}
		}
		for (int j = 0; j < arr[0].length; j++) {
			int colTemp = 0;
			for (int i = 0; i < arr.length; i++) {
				colTemp += arr[i][j];
			}
			if (colTemp > colMax) {
				colMax = colTemp;
			}
		}

		System.out.println("Maximum row's sum is " + rowMax);
		System.out.println("Maximum column's sum is " + colMax);

		if (rowMax > colMax) {
			System.out.print("Maximum row's sum is bigger than maximum column's sum");
		} else if (rowMax < colMax) {
			System.out.print("Maximum row's sum is smaller than maximum column's sum");
		} else {
			System.out.print("Maximum row's sum is equal to maximum column's sum");
		}
	}
}
