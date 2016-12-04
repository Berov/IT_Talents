import java.util.Scanner;

public class Lesson2_task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Колко е температурата навън?");
		int temperature = sc.nextInt();
		if (temperature < -20) {
			System.out.println("Навън е кучешки студ");
		}
		if (temperature >= -20 && temperature < 0) {
			System.out.println("Навън си е студено");
		}
		if (temperature >= 0 && temperature < 15) {
			System.out.println("Навън е хладничко");
		}
		if (temperature >= 15 && temperature < 25) {
			System.out.println("Топло е, а?");
		}
		if (temperature >= 25) {
			System.out.println("Слънце весело пече, хайде всички на мореее!");
		}
		
		sc.close();
	}

}
