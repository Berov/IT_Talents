/* Да се състави програма, която извежда всички
естествени трицифрени числа, които нямат еднакви цифри т.е.
100,101, 606 и т.н. не се извеждат. 
*/
public class Task_12 {

	public static void main(String[] args) {

		for (int i = 100; i <= 999; i++) {
			int firstDigit = i / 100;
			int secondDigit = i / 10 % 10;
			int thirdDigit = i % 10;

			if (firstDigit != secondDigit && firstDigit != thirdDigit && secondDigit != thirdDigit) {
				System.out.println(i);
			}
		}
	}
}
