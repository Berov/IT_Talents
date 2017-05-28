import java.util.Scanner;

/*Да се изведат съобщения към потребителя и да се прочетат 2 числа от
клавиатурата A и B (може да са с плаваща запетая – double).
После да се прочете 3-то число C и да се провери дали то е м/у A и B.
Да се изведе подходящо съобщение за това дали C е между A и B.
*/

public class Task_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Моля въведете едно число!");
		double a = sc.nextDouble();
		System.out.println("Моля въведете друго число!");
		double b = sc.nextDouble();
		System.out.println("Въведете и трето число!");
		double c = sc.nextDouble();
		
		if ((c > a && c < b) || (c > b && c < a)) {
			System.out.println("Третото въведено число: " + c + " се намира м/у " + a + " и " + b);
		} else {
			System.out.println("Третото въведено число не се намира м/у първите две числа!");
		}
		
		sc.close();
	}

}
