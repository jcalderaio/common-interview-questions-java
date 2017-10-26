package Arrays_and_Strings;

/*
 *  Implement an algorithm to determine if a string has all unique characters
 * */


public class All_Unique
{
	
	//This casts the character as an int in ASCII and increases at that index. If more than one there, means duplicate
	//The time complexity for this code is 0(n),where n is the length of the string.
	//The space complexity is 0(1)
	
	public static boolean check_unique(String str) {
		
		if(str.length() > 256) return false;
		
		int[] check = new int[256];
		
		for(int i = 0; i < str.length(); ++i) {
			
			if(++check[str.charAt(i)] > 1) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String args[]) {
		
		System.out.println(check_unique("Johnny"));
		
	}

}
