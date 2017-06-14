/*Имате предварително въведен едномерен масив, съдържащ реални
числа.
Да се състави програма, чрез която се избират само елементи от
масива със стойности от интервала [-2.99..2.99] и се отпечатват в нов
масив. Новият масив да се извежда на екрана.
Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
Изход: 0.2; 0.99; 1.4; 1.2
*/
public class Task_14 {

	public static void main(String[] args) {
		double[] arr = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2 };
		int counter = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > -2.99 && arr[i] < 2.99) {
				counter++;
			}
		}

		double[] newArr = new double[counter];
		counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > -2.99 && arr[i] < 2.99) {
				newArr[counter] = arr[i];
				if (counter > 0) {
					System.out.print("; ");
				}
				System.out.print(newArr[counter]);
				counter++;
			}
		}
	}
}
