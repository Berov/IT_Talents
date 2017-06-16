/*Имате двумерен масив 6х5 от естествени числа, чийто стойности са
въведени предварително.
Да се състави програма, чрез която се извеждат елементите от масива
с най-малката и най-голямата стойност.
*/
public class Task_01 {

	public static void main(String[] args) {
		int[][] arr = { 
				{ 48, 72, 11, 14, 15 }, 
				{ 21, 22, 53, 24, 75 }, 
				{ 31, 57, 33, 34, 35 }, 
				{ 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 }, 
				{ 61, 69, 63, 64, 12 } 
				};

		int min = arr[0][0];
		int max = arr[0][0];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}

		System.out.println("The smallest number is " + min);
		System.out.println("The biggest number is " + max);
	}
}
