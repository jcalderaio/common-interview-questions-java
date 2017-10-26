package Arrays_and_Strings;

public class NxMzeroRow
{
	/*
	 * Write an algorithm such that if an element in an MxN matrix is 0, 
	 * its entire row and column are set to 0.
	 * 
	 * Solution: There's one problem with that solution though: when we come 
	 * across other cells in that row or column, we'll see the zeros and change 
	 * their row and column to zero. Pretty soon, our entire matrix will be set to zeros.
	 * Since we're going to set the entire row and column to zero, we don't need to track 
	 * that it was exactly cell[2] [4] (row 2,column 4). We only need to know that row 2 has 
	 * a zero somewhere, and column 4 has a zero some- where.
	 * 
	 */

	public static void zeroRow(int[][] matrix) {
		
		int height = matrix.length;
		int width = matrix[0].length;
		boolean [] column = new boolean [width];
		boolean [] row = new boolean [height];
		
		for(int i = 0; i < height; ++i) {
			for(int j = 0; j < width; ++j) {
				if(matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		for(int i = 0; i < height; ++i) {
			for(int j = 0; j < width; ++j) {
				if(row[i] || column[j]) {
					matrix[i][j] = 0;
				}
			}
		}
	}
	
	//*********___MAIN___********************	
		public static void main(String args[]) {
			
			int[][] matrix = {
					  { 5, 6, 7, 8, 3, 5, 7, 8 },
					  { 2, 0, 7, 8, 3, 5, 7, 8 },
					  { 2, 6, 7, 8, 3, 5, 7, 8 },
					  { 0, 6, 4, 8, 3, 5, 7, 8 },
					  { 2, 6, 7, 8, 3, 0, 7, 8 },
					  { 2, 6, 7, 8, 3, 5, 7, 8 },
					  { 2, 6, 7, 8, 3, 5, 7, 8 },
					  { 2, 6, 7, 8, 3, 5, 7, 0 },
					};
			
			int[][] matrix2 = {
					  { 5, 6, 0 },
					  { 3, 7, 3 },
					  { 0, 4, 7 }
					};
			
			zeroRow(matrix);
			zeroRow(matrix2);
			
			for (int i = 0; i < matrix.length; i++) {
			    for (int j = 0; j < matrix[0].length; j++) {
			        System.out.print(matrix[i][j] + " ");
			    }
			    System.out.print("\n");
			}	
			
			System.out.print("\n");
			
			for (int i = 0; i < matrix2.length; i++) {
			    for (int j = 0; j < matrix2[0].length; j++) {
			        System.out.print(matrix2[i][j] + " ");
			    }
			    System.out.print("\n");
			}
		}
}
