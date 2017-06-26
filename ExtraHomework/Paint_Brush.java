/*Write a method that represents the operation “paint brush” in Paint. The
method takes a matrix of pixels N*N and the coordinates of a single pixel of the matrix
as parameters. We know that the matrix contains areas, surrounded by black pixels
(cells that contain the letter 'b'). The method then paints the whole area around the
pixel that is surrounded by black pixels or that ends with the border of the matrix.
Painting the area means setting all pixels to red (the letter 'r').
*/
public class Paint_Brush {

	public static void main(String[] args) {
		char[][] paintArea = { 
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', },
				{ ' ', 'b', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', },
				{ ' ', 'b', 'b', ' ', ' ', ' ', ' ', ' ', ' ', ' ', },
				{ ' ', 'b', ' ', 'b', ' ', ' ', ' ', ' ', ' ', ' ', },
				{ ' ', 'b', ' ', ' ', 'b', ' ', ' ', ' ', ' ', ' ', },
				{ ' ', 'b', ' ', ' ', ' ', 'b', ' ', ' ', ' ', ' ', },
				{ ' ', 'b', ' ', ' ', ' ', ' ', 'b', ' ', ' ', ' ', },
				{ ' ', 'b', ' ', ' ', 'b', 'b', ' ', 'b', ' ', ' ', },
				{ ' ', 'b', ' ', ' ', 'b', 'b', ' ', 'b', 'b', ' ', },
				{ ' ', 'b', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'b', },
				{ ' ', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', } 
				};

		int x = 8, y = 3;

		paint(paintArea, x, y);

		for (int i = 0; i < paintArea.length; i++) {
			for (int j = 0; j < paintArea[j].length; j++) {
				System.out.print(paintArea[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void paint(char[][] arr, int x, int y) {
		if (arr[x][y] == ' ') {
			arr[x][y] = 'r';

			if ((x - 1) >= 0) {
				paint(arr, x - 1, y);
			}
			if ((x + 1) < arr.length) {
				paint(arr, x + 1, y);
			}
			if ((y - 1) >= 0) {
				paint(arr, x, y - 1);
			}
			if ((y + 1) < arr[0].length) {
				paint(arr, x, y + 1);
			}
		}
	}
}
