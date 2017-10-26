package Arrays_and_Strings;

public class smallestCommonMultiples
{

	/*
	 * find the smallest common multiple of two integers
	 */
	public static int mult(int a, int b) {
		
		//Check for outliers
		if(a == 0 || b == 0) {
			return 0;
		}
		//want the loop to go to bigger of the two numbers
		int biggest = a;
		if(b > a) {
			biggest = b;
		}
		//If the numbers aren't 0, 1 is the smallest multiple always
		int smallest = 1;
		//Start with 2
		for(int i = 2; i < biggest; ++i) {
			//If i is a multiple of both numbers
			if((a%i == 0) && (b%i == 0)) {
				//Check and see what the smallest of the 2 is
				if(i<smallest || smallest == 1){
					smallest = i;
					//The smallest number will appear first, so stop loop
					break;
				}
			}
		}
		//return the smallest integer
		return smallest;
	}
	
	public static void main(String args[]) {
		System.out.print(mult(95, 10));
	}
}
