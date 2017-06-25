import java.util.Scanner;

/*Да се състави програма, чрез която по въведен низ съдържащ букви,
цифри, знак минус '-' се извежда сборът на въведените числа като се
отчита знакът '-' пред съответното число.
Вход: asd-12sdf45-56asdf100
Изход:
-12
45
-56
100
Сума = 77
*/
public class Task_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String initialString;
		boolean hasNoNumbers = true;
		boolean isPositive = true;
		int sum = 0;
		int tempNumber = 0;

		System.out.println("Enter a string with letters and numbers");
		initialString = sc.nextLine();

		for (int i = 0; i < initialString.length(); i++) {

			if (initialString.charAt(i) > 47 && initialString.charAt(i) < 58) {
				hasNoNumbers = false;
				tempNumber = initialString.charAt(i) - 48;
				if (i > 0) {
					if (initialString.charAt(i - 1) == '-') {
						isPositive = false;
					}
				}
				while ((i + 1 < initialString.length()) && (initialString.charAt(i + 1) > 47 && initialString.charAt(i + 1) < 58)) {
					tempNumber = tempNumber * 10 + (initialString.charAt(i + 1) - 48);
					i++;
				}
			}
			if (!isPositive) {
				tempNumber *= -1;
			}
			if (tempNumber != 0) {
				System.out.println(tempNumber);
			}
			sum += tempNumber;
			isPositive = true;
			tempNumber = 0;
		}

		if (hasNoNumbers) {
			System.out.println("There are no numbers in this string");
		} else {
			System.out.println("The sum of the numbers in the string is " + sum);
		}

		sc.close();
	}
}
//Може да бъде решена и по по-лесен начин, но това е решение в рамките на взетия материал