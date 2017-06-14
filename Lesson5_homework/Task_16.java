/*Да се състави програма, чрез която предварително въведени 10
реални числа от интервала се обработват по следния начин:
1. Извежда съществуващите числа.
2. Всички елементи със стойност по-малки от -0.231 се заменят със
сумата от квадрата на поредния им номер + числото 41.25, а всички
останали елементи се заменят с произведението между самия елемент
и неговият пореден номер. Поредният номер на първият елемент е 1.
3. Да се изведат елементите от началния и новообразувания масив.
Пример: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
Изход: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25
*/
public class Task_16 {

	public static void main(String[] args) {
		float[] arr = { -1.12f, -2.43f, 3.1f, 4.2f, 0f, 6.4f, -7.5f, 8.6f, 9.1f, -4f };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
			if (arr[i] < -0.231) {
				arr[i] = (float) ((i + 1) * (i + 1) + 41.25);
			} else {
				arr[i] = arr[i] * (i + 1);
			}
		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
	}
}
