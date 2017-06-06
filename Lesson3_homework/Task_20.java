/*Да се състави програма, чрез която се извежда квадрат от
цифри. Сумите от елементите на произволен ред или стълб са
равни на 45.
*/
public class Task_20 {

	public static void main(String[] args) {
		int temp = 1;

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(temp + " ");
				temp++;
				if (temp == 10) {
					temp = 0;
				}
			}
			System.out.println();
			temp++;
			if (temp == 10) {
				temp = 0;
			}
		}
	}
}
