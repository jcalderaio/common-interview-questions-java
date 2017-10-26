package Arrays_and_Strings;

public class TwoStrings
{
	/*
	 * Example: Given a smaller string 5 and a bigger string b, design an algorithm to 
	 * find all permutations of the shorter string within the longer one. Print the 
	 * location of each permutation.
	 */

	public static void findPerm(String s, String b) {
		
		int[] count;
		
		loops:
		for(int i = 0; i < b.length(); ++i) {
			count = new int[256];
			for(char c : s.toCharArray()) {
				++count[c];
			}
			int begin = i;
			for(int j = 0; j < s.length(); ++j, ++i) {
				if(--count[b.charAt(i)] < 0) {
					continue loops;
				}
			}
			System.out.println("Array at " + begin + " length of " + s.length());
		}
		
	}
	
	public static void main(String args[]) {
		findPerm("ioo", "wooeqioowfoiowioefeooi");
	}
}

