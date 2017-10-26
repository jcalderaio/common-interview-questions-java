package Arrays_and_Strings;

public class rotateImage
{
	
	/*
	 * Given an image represented by an NxM matrix, where each pixel in the image is 4
	bytes, write a method to rotate the image by 90 degrees.
	 */
	//We CANNOT do this in place if we need to rotate an N by M matrix because we may 
	//need a new array because of differing dimensions
	public static char[][] rotate(char[][] matrix) {
		
		int height = matrix.length;
		int width = matrix[0].length;
		char[][] rotated = new char[width][height];
		
		for(int j = 0; j < width; ++j) {
			for(int i = height-1, k = 0; i >= 0; --i, ++k) {
				
				rotated[j][k] = matrix[i][j];
				
			}
		}
		return rotated;
	}
	
	/*
	 * This next algorithm is to rotate a N x N image in place, without using
	 * an extra matrix. So 0(N^2) running time and 0(1) space
	 */
	
	public static void rotateInPlace(char[][] matrix) {
		
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; ++i) {
				int offset = i - first;
				//save top
				char top = matrix[first][i];
				
				//left -> top
				matrix[first][i] = matrix[last-offset][first];
				
				//bottom -> left
				matrix[last-offset][first] = matrix[last][last-offset];
				
				//right -> bottom
				matrix[last][last-offset] = matrix[i][last];
				
				//top -> right
				matrix[i][last] = top;
			}
		}
			
	}	
			
	//*********___MAIN___********************	
	public static void main(String args[]) {
		
		char[][] matrix = {
				  { 'A', 'B' },
				  { 'C', 'D' },
				  { 'E', 'F' }
				};
		
		char[][] matrix2 = {
				  { 'A', 'B', 'C' },
				  { 'D', 'E', 'F'},
				  { 'G', 'H', 'I'}
				};
		
		matrix = rotate(matrix);
		rotateInPlace(matrix2);

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
