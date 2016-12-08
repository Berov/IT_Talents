<<<<<<< HEAD
import java.util.Scanner;

public class Lesson2_task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първо двуцифрено число");
		int firstNumber = sc.nextInt();
		System.out.println("Въведете второ двуцифрено число");
		int secondNumber = sc.nextInt();

		System.out.print("Произведението на двете числа е " + firstNumber*secondNumber+ " и последната му цифра е ");
		if( (firstNumber*secondNumber)%2==0){
			System.out.println("четна");
		} else {
			System.out.println("нечетна");
		}
		if(firstNumber<10 || firstNumber>99 || secondNumber<10 || secondNumber>99){
			System.out.println("Можехте все пак да напишете двуцифрено число... нищо, и така програмата работи ;)");
		}
		sc.close();
	}

}
=======
import java.util.Scanner;

public class Lesson2_task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първо двуцифрено число");
		int firstNumber = sc.nextInt();
		System.out.println("Въведете второ двуцифрено число");
		int secondNumber = sc.nextInt();

		System.out.print("Произведението на двете числа е " + firstNumber*secondNumber+ " и последната му цифра е ");
		if( (firstNumber*secondNumber)%2==0){
			System.out.println("четна");
		} else {
			System.out.println("нечетна");
		}
		if(firstNumber<10 || firstNumber>99 || secondNumber<10 || secondNumber>99){
			System.out.println("Можехте все пак да напишете двуцифрено число... нищо, и така програмата работи ;)");
		}
		sc.close();
	}

}
>>>>>>> 4a969ad4eab46524680d1bbb6fef5d8299720e82
