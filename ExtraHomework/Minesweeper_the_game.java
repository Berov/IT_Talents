import java.util.Random;
import java.util.Scanner;

public class Minesweeper_the_game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char difficulty;
		int mines = 0, markedMines = 0;
		int[] clearedMines = new int[1];
		int userX, userY;
		int areaLength, areaWidth;
		char[][] minesArea = null, mask = null;
		boolean boom = false;

		clearScreen();

		// level choice
		do {
			System.out.println("1 - Beginner     ( 8  X  8, 10 mines)");
			System.out.println("2 - Intermediate ( 16 X 16, 49 mines)");
			System.out.println("3 - Expert       ( 30 X 16, 99 mines)");
			System.out.println("4 - Custom       ( 30 X 30, you choice the nuber of mines)");
			System.out.println("Enter a level:");
			difficulty = sc.nextLine().charAt(0);
			clearScreen();
		} while (difficulty != '1' && difficulty != '2' && difficulty != '3' && difficulty != '4');
		clearScreen();

		// creates areas
		switch (difficulty) {
		case '1':
			mines = 10;
			areaLength = 8;
			areaWidth = 8;
			clearedMines[0] = areaLength * areaWidth;
			minesArea = new char[areaLength][areaWidth];
			mask = new char[areaLength][areaWidth];
			createGameAreas(minesArea, mask, mines);
			break;
		case '2':
			mines = 49;
			areaLength = 16;
			areaWidth = 16;
			clearedMines[0] = areaLength * areaWidth;
			minesArea = new char[areaLength][areaWidth];
			mask = new char[areaLength][areaWidth];
			createGameAreas(minesArea, mask, mines);
			break;
		case '3':
			mines = 99;
			areaLength = 16;
			areaWidth = 30;
			clearedMines[0] = areaLength * areaWidth;
			minesArea = new char[areaLength][areaWidth];
			mask = new char[areaLength][areaWidth];
			createGameAreas(minesArea, mask, mines);
			break;
		case '4':
			do {
				clearScreen();
				System.out.println("How many mines you want to have? (1-400)");
				mines = sc.nextInt(); // to do - make it unbreakable for stupid
										// users!!!!! Validate string to digit!
			} while (mines < 1 && mines > 400);
			clearScreen();
			areaLength = 30;
			areaWidth = 30;
			clearedMines[0] = areaLength * areaWidth;
			minesArea = new char[areaLength][areaWidth];
			mask = new char[areaLength][areaWidth];
			createGameAreas(minesArea, mask, mines);
			break;
		}

		// The real game
		char userAnswer;
		while (true) {
			printUserScreen(minesArea, mask, mines, markedMines);

			do {
				System.out.println("  Sweep or mark?");
				userAnswer = sc.next().charAt(0);
				if (userAnswer != 'S' && userAnswer != 's' && userAnswer != 'С' && userAnswer != 'с'
						&& userAnswer != 'M' && userAnswer != 'm' && userAnswer != 'М' && userAnswer != 'м') {
					printUserScreen(minesArea, mask, mines, markedMines);
				}
			} while (userAnswer != 'S' && userAnswer != 's' && userAnswer != 'С' && userAnswer != 'с'
					&& userAnswer != 'M' && userAnswer != 'm' && userAnswer != 'М' && userAnswer != 'м');

			if (userAnswer == 'S' || userAnswer == 's' || userAnswer == 'С' || userAnswer == 'с') {
				// begin of sweeping--------------------------------------
				printUserScreen(minesArea, mask, mines, markedMines);
				do {
					System.out.println("Enter x (1-" + minesArea[0].length + "):");
					userX = sc.nextInt();
					if (userX < 1 || userX > minesArea[0].length + 1) {
						printUserScreen(minesArea, mask, mines, markedMines);
					}
				} while (userX < 1 || userX > minesArea[0].length);

				printUserScreen(minesArea, mask, mines, markedMines);
				do {
					System.out.println("Enter y (1-" + minesArea.length + "):");
					userY = sc.nextInt();
					if (userX < 1 || userY > minesArea.length + 1) {
						printUserScreen(minesArea, mask, mines, markedMines);
					}
				} while (userY < 1 || userY > minesArea.length);

				userX--;
				userY--;

				if (minesArea[userY][userX] == '*') {
					minesArea[userY][userX] = '@';
					boom = true;
				} else {
					clearMask(minesArea, mask, userY, userX, clearedMines);
					printUserScreen(minesArea, mask, mines, markedMines);
				}
				// end of sweeping----------------------------------------
			} else {
				// begin marking----------------------
				printUserScreen(minesArea, mask, mines, markedMines);
				do {
					System.out.println("Enter x (1-" + minesArea[0].length + "):");
					userX = sc.nextInt();
					if (userX < 1 || userX > minesArea[0].length + 1) {
						printUserScreen(minesArea, mask, mines, markedMines);
					}
				} while (userX < 1 || userX > minesArea[0].length);

				printUserScreen(minesArea, mask, mines, markedMines);
				do {
					System.out.println("Enter y (1-" + minesArea.length + "):");
					userY = sc.nextInt();
					if (userX < 1 || userY > minesArea.length + 1) {
						printUserScreen(minesArea, mask, mines, markedMines);
					}
				} while (userY < 1 || userY > minesArea.length);

				userX--;
				userY--;
				if (mask[userY][userX] == '') {
					if (markedMines < mines) {
						mask[userY][userX] = '?';
						markedMines++;
						clearedMines[0]--;
					}
				}
				// end marking--------------------------
			}

			if (boom) {
				break;
			}
			if (clearedMines[0] == 0 && markedMines == mines) {
				break;
			}
		}

		printFinalScreen(minesArea, boom);

		// System.out.println("One more game? (y/n)"); // TO DO

		sc.close();
	}

	static void clearScreen() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
	}

	static void createGameAreas(char[][] arrMines, char[][] mask, int mines) {
		Random rnd = new Random();
		int x, y;

		for (int i = 0; i < mines; i++) {
			do {
				x = rnd.nextInt(arrMines.length);
				y = rnd.nextInt(arrMines[0].length);
			} while (arrMines[x][y] == '*');
			arrMines[x][y] = '*';
		}
		createMinesNumbers(arrMines);

		for (int i = 0; i < mask.length; i++) {
			for (int j = 0; j < mask[i].length; j++) {
				mask[i][j] = '';
			}
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
		if (arr[i][j] == 0) {
			arr[i][j] = '1';
		} else {
			arr[i][j]++;
		}
	}

	static void printUserScreen(char[][] minesArea, char[][] mask, int mines, int markedMines) {
		clearScreen();
		System.out.println("     Have to mark " + (mines - markedMines) + " mines more!");
		System.out.print("	     ");
		for (int i = 0; i < mask[0].length; i++) {
			System.out.print((i + 1));
			if (i < 9) {
				System.out.print(" ");
			}
		}
		System.out.println("- x");

		System.out.print("	     ");
		for (int i = 0; i < mask[0].length - 1; i++) {
			System.out.print("__");
		}
		System.out.println();

		for (int i = 0; i < mask.length; i++) {
			System.out.print("	" + (i + 1) + "  ");
			if (i < 9) {
				System.out.print(" ");
			}
			System.out.print("|");
			for (int j = 0; j < mask[i].length; j++) {
				if (mask[i][j] == '' || mask[i][j] == '?') {
					System.out.print(mask[i][j]);
					if (j == mask[i].length - 1) {
						System.out.print("|");
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print(minesArea[i][j]);
					if (j < minesArea.length - 1) {
						System.out.print(" ");
					} else {
						System.out.print("|");
					}
				}
			}
			// System.out.print("\b|");
			System.out.println();
		}
		System.out.print("	y   ");
		for (int i = 0; i < mask[0].length; i++) {
			System.out.print("--");
		}
		System.out.println("-");
	}

	static void clearMask(char[][] minesArea, char[][] mask, int i, int j, int[] clearedMines) {
		if (minesArea[i][j] == 0 && mask[i][j] == '') {
			mask[i][j] = ' ';
			clearedMines[0]--;

			if ((i - 1) >= 0) {
				clearMask(minesArea, mask, i - 1, j, clearedMines);
			}
			if ((i + 1) < minesArea.length) {
				clearMask(minesArea, mask, i + 1, j, clearedMines);
			}
			if ((j - 1) >= 0) {
				clearMask(minesArea, mask, i, j - 1, clearedMines);
			}
			if ((j + 1) < minesArea[0].length) {
				clearMask(minesArea, mask, i, j + 1, clearedMines);
			}
		} else {
			if ((minesArea[i][j] == '1' || minesArea[i][j] == '2' || minesArea[i][j] == '3' || minesArea[i][j] == '4'
					|| minesArea[i][j] == '5' || minesArea[i][j] == '6' || minesArea[i][j] == '7'
					|| minesArea[i][j] == '8') && mask[i][j] == '') {
				mask[i][j] = ' ';
				clearedMines[0]--;
			}
		}
	}

	static void printFinalScreen(char[][] minesArea, boolean boom) {
		clearScreen();
		System.out.println("IT Talents - Season 8 - Java/Androd");
		System.out.println();

		if (boom) {
			System.out.println("     YOU ARE A LOOSER!");
		} else {
			System.out.println("     YOU ARE A WINNER!");
		}

		System.out.print("	     ");
		for (int i = 0; i < minesArea[0].length; i++) {
			System.out.print((i + 1));
			if (i < 9) {
				System.out.print(" ");
			}
		}
		System.out.println(" - x");

		System.out.print("	     ");
		for (int i = 0; i < minesArea[0].length; i++) {
			System.out.print("__");
		}
		System.out.println();

		for (int i = 0; i < minesArea.length; i++) {
			System.out.print("	" + (i + 1) + "  ");
			if (i < 9) {
				System.out.print(" ");
			}
			System.out.print("|");
			for (int j = 0; j < minesArea[i].length; j++) {

				System.out.print(minesArea[i][j]);
				if (j < minesArea[i].length - 1) {
					System.out.print(" ");
				} else {
					System.out.print("|");
				}

			}
			// System.out.print("\b|");
			System.out.println();
		}
		System.out.print("	    ");
		for (int i = 0; i < minesArea[0].length; i++) {
			System.out.print("--");
		}
		System.out.println();
	}

	static void helper(int[] clearedMines, int markedMines, int mines) {
		System.out.println("cleared mines=" + clearedMines[0]);
		System.out.println("marked mines=" + markedMines);
		System.out.println("mines=" + mines);
	}
}
