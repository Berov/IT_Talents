/*Да се състави програма, чрез която по въведени начална и крайна
цифра се извеждат на всеки нов ред следната последователност
(триъгълник от знаци):
Пример: 1, 9
Изход:
1
1 2
1 2 3
... до
1 2 3 4 5 6 7 8 9
Използвайте рекурсия
*/
public class Task_04 {

	public static void main(String[] args) {
		int start = 16;
		int end = 25;
		triangle(start, end, 0);

	}

	static void triangle(int start, int end, int index) {
		for (int i = start; i < start + index; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		if (index <= end - start) {
			triangle(start, end, index + 1);
		}
	}

}
