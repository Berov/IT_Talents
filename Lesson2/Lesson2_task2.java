import java.util.Scanner;

public class Lesson2_task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете цело число");
		int first = sc.nextInt();
		System.out.println("Моля въведете друго цяло число");
		int second = sc.nextInt();

		int xAddition = first + second;
		int xSubstraction = first - second;
		int xMultiplication = first * second;
		int xModulus = first % second;
		int xDevision = first / second;

		System.out.println("Сумата на Вашите числа е " + xAddition);
		System.out.println("Разликата на Вашите числа е " + xSubstraction);
		System.out.println("Произведението на Вашите числа е " + xMultiplication);
		if (first < second) {
			System.out.println("Първото Ви число е по-малко от второто, така че няма остатък при деление");
		} else {
			System.out.println("Остатакът от целочислено деление на Вашите числа е " + xModulus);
		}
		if (first < second) {
			System.out.println("Първото Ви число е по-малко от второто, така че няма целочислено деление");
		} else {
			System.out.println("Целочисленото деление на Вашите числа е " + xDevision);
		}

		
		//System.out.println();
		//System.out.println("Моля въведете число с десетична запетая");
		//double firstDouble = sc.nextDouble();
		//System.out.println("Моля въведете друго число с десетична запетая");
		//double secondDouble = sc.nextDouble();

		//double xAdditionDouble = firstDouble + secondDouble;
		//double xSubstractionDouble = firstDouble - secondDouble;
		//double xMultiplicationDouble = firstDouble * secondDouble;
		//double xModulusDouble = firstDouble % secondDouble;
		//double xDevisionDouble = firstDouble / secondDouble;

		//System.out.println("Сумата на Вашите числа е " + xAdditionDouble);
		//System.out.println("Разликата на Вашите числа е " + xSubstractionDouble);
		//System.out.println("Произведението на Вашите числа е " + xMultiplicationDouble);
		//System.out.println("Числата са с плаваща запетая, така че няма остатък при делене! Въпреки това (не знам защо) функцията % ми изкарва  "+ xModulusDouble);
		//System.out.println("Делението на Вашите числа е " + xDevisionDouble);
		
		// Това с плаващата запетая е гадно! Много пъти дава неточни стойности. Произведението също много пъти се разминава жестоко. Особено при по-големи стойности
		
		sc.close();
	}
}
