import java.util.Scanner;

/*Да се състави програма, която да отгатне колко е студено/топло по
въведената температура t в градус Целзий.
Температурните интервали са:
под -20 ледено студено;
между 0 и -20 - студено;
между 15 и 0 - хладно;
между 25 и 15 - топло;
над 25 – горещо.
Входни данни: цяло число от интервала [-100..100].
*/

public class Task_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Моля въведете температурата в градуси по Целзий:");
		int t = sc.nextInt();

		if (t < -100 || t > 100) {
			System.out.println("Е няма такава температура!");
		}
		if (t >= -100 && t <= -20) {
			System.out.println("Навън е кучешки студ");
		}
		if (t > -20 && t <= 0) {
			System.out.println("Навън си е студено");
		}
		if (t > 0 && t <= 15) {
			System.out.println("Навън е хладничко");
		}
		if (t > 15 && t <= 25) {
			System.out.println("Топличко е, а?");
		}
		if (t > 25 && t <= 100) {
			System.out.println("Слънце весело пече, хайде всички на мореее!");
		}

		sc.close();
	}

}
