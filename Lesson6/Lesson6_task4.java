
public class Lesson6_task4 {

	public static void main(String[] args) {
		int[][] arr2d = {
				{ 1,2,3,4},
				{ 5,6,7,8 },
				{ 9,10,11,12 },
				{ 13,14,15,16 },
				{ 17, 18, 19, 20 },
				{ 21, 22, 23, 24 }
				};
		int[][] arr2dNew = new int[arr2d[0].length][arr2d.length];
		
		System.out.println("Масивът сега представлява:");
		for(int i = 0, r = arr2d.length-1; i< arr2d.length; i++, r--){
			for(int ii = 0; ii<arr2d[i].length; ii++){
			System.out.print(arr2d[i][ii]);
			System.out.print('\t');
			arr2dNew[ii][r] = arr2d[i][ii]; //rotate :)
			}
			System.out.println();
		}
		
		System.out.println("След обръщане на +90 градуса представлява следното:");
		
		for(int i = 0; i<arr2dNew.length; i++){
			for(int ii=0; ii<arr2dNew[i].length; ii++){
				System.out.print(arr2dNew[i][ii]);
				System.out.print('\t');
			}
			System.out.println();
		}
		
	}

}
