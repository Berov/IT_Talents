/*Да се състави програма, която чрез цикъл while извежда
таблицата за умножение, но без повторение.
Т.е. ако е изведено 4*5 не се извежда 5*4. 
*/
public class Task_23 {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;

		while (y <= 9) {
			while (x <= 9) {
				System.out.print(y + "*" + x + "; ");
				x++;
			}
			System.out.println();
			y++;
			x = y;
		}
	}
}
