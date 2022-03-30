/* Alex Walker
 * CS110
 * Lab 10 Problem 2
 */
public class TwoDArray {
	
	public static void sumRows(int[][] matrix) {
		
			for (int row = 0; row < matrix.length; row++) {
				
				int sum = 0;
			
				for (int col = 0; col < matrix[row].length; col++) {
				
					sum = sum + matrix[row][col];
			}
		
			System.out.println("The sum of row " + (row + 1) + " = " + sum);
		}
	}
	

	public static void printMatrix(int [][] matrix) {
		
		for (int row = 0; row < matrix.length; row++) {
			
			for (int col = 0; col < matrix[row].length; col++) {
				
				System.out.printf("%7d", matrix[row][col]);
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int [][] twoD =
			{
					{48, 21, 62, 27, 56}, {14, 6, 34, 97, 8}, {2, 0, 53, 16, 21}
			};

		printMatrix(twoD);
		
		sumRows(twoD);
		
	}

}
