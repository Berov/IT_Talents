import java.util.Scanner;

/*Да се състави програма, която чете от конзолата 4-цифренo
естествено число от интервала [1000.. 9999]. От това число се
формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
ново число e по-малко <, равно = или по-голямо от 2-то число.
*/

public class Task_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("моля въведете четирицифрено число в интервала 1000 - 9999!");
		int number = sc.nextInt();
		if (number >= 1000 || number <= 9999) {

			int a = number / 1000;
			int b = (number - a * 1000) / 100;
			int c = (number - a * 1000 - b * 100) / 10;
			int d = (number - a * 1000 - b * 100 - c * 10);

			int firstNumber = a * 10 + d;
			int secondNumber = b * 10 + c;

			if (firstNumber < secondNumber) {
				System.out.println(firstNumber + " е по-малко от " + secondNumber);
			}
			if (firstNumber > secondNumber) {
				System.out.println(firstNumber + " е по-голямо от " + secondNumber);
			}
			if (firstNumber == secondNumber) {
				System.out.println(firstNumber + " е равно на " + secondNumber);
			}
		} else {
			System.out.println("Въведеното число не е в дадения интервал!");
		}

		sc.close();
	}

}
