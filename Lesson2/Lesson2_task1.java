import java.util.Scanner;

public class Lesson2_task1 {

	public static void main(String[] args) {
		System.out.println("Моля въведете първо цяло число ");
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		System.out.println("Моля въведете второ цяло число ");
		int secondNumber = sc.nextInt();
		System.out.println("Бихте ли въвели и трето цяло число ");
		int thirdNumber = sc.nextInt();
		if ((thirdNumber > firstNumber && thirdNumber < secondNumber) || (thirdNumber < firstNumber && thirdNumber > secondNumber)) {
			System.out.println("Числото " + thirdNumber + " е между " + firstNumber + " и " + secondNumber);
		} else {
			System.out.println(
					"Съжалявам, но числото " + thirdNumber + " не е между " + firstNumber + " и " + secondNumber);
		}
		
		sc.close();
	}

}

