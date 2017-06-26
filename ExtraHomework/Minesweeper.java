
import java.util.Scanner;

/*Write a method that fills the matrix of the game “Minesweeper” with the
proper values in each cell. The method takes a matrix of pixels N*N that is filled with
character “*” on random coordinates. The method must fill all cells of the matrix with
numbers corresponding to the number of mines that exist right next to each cell. Write
a program that creates the array, prompts the user to input the coordinates of 10 different
mines, inserts them in the array (put the symbol '*' in the cell that has a mine), then
uses the method to fill the array with the proper numbers and then prints the array in
the console in a readable and understandable way.
*/
public class Minesweeper {

	public static void main(String[] args) {
		char[][] minesArea = { 
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', } 
				};
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < minesArea.length; i++) {
			int x, y;
			do {
				System.out.println("Enter x-coordinate for mine-" + i + " (0-9)");
				y = sc.nextInt();
				System.out.println("Enter y-coordinate for mine-" + i + " (0-9)");
				x = sc.nextInt();
				if (x < 0 || y < 0 || x > 9 || y > 9 || minesArea[x][y] == '*') {
					System.out.println("Come on again!");
				} else {
					minesArea[x][y] = '*';
				}
			} while (!(x < 0 || y < 0 || x > 9 || y > 9 || minesArea[x][y] == '*'));
		}

		createMinesNumbers(minesArea);
		printArr(minesArea);

		sc.close();
	}

	static void printArr(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void createMinesNumbers(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == '*') {
					if ((i - 1 >= 0) && (j - 1) >= 0 && arr[i - 1][j - 1] != '*') {
						check(arr, i - 1, j - 1);
					}
					if ((i + 1 < arr.length) && (j + 1) < arr[i].length && arr[i + 1][j + 1] != '*') {
						check(arr, i + 1, j + 1);
					}
					if ((i - 1 >= 0) && arr[i - 1][j] != '*') {
						check(arr, i - 1, j);
					}
					if ((j - 1) >= 0 && arr[i][j - 1] != '*') {
						check(arr, i, j - 1);
					}
					if ((i + 1 < arr.length) && (j - 1) >= 0 && arr[i + 1][j - 1] != '*') {
						check(arr, i + 1, j - 1);
					}
					if ((i - 1 >= 0) && (j + 1) < arr[i].length && arr[i - 1][j + 1] != '*') {
						check(arr, i - 1, j + 1);
					}
					if ((j + 1) < arr[i].length && arr[i][j + 1] != '*') {
						check(arr, i, j + 1);
					}
					if ((i + 1 < arr.length) && arr[i + 1][j] != '*') {
						check(arr, i + 1, j);
					}
				}
			}
		}
	}

	static void check(char[][] arr, int i, int j) {
		if (arr[i][j] == ' ') {
			arr[i][j] = '1';
		} else {
			arr[i][j]++;
		}
	}
}
// :)