/*Имате двумерен масив от числа, чийто стойности са въведени
предварително. Да се отпечатат сумата на елементите на масива,
както и средноаритметичното на тези числа.
*/
public class Task_03 {

	public static void main(String[] args) {
		int[][] arr = { 
				{ 48, 72, 11, 14, 15 }, 
				{ 21, 22, 53, 1 }, 
				{ 31, 57, 33, 34, 35 }, 
				{ 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 }, 
				{ 61, 69, 63, 64, 12 } 
				};

		int sum = 0;
		int counter = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				counter++; // Made with counter because the array may be not a matrix!!!
			}
		}

		System.out.println("The sum of the array's values is " + sum);
		System.out.println("The average is " + (double) sum / counter);

	}
}
