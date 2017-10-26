package AAA_Test;

public class Permutation
{
	/*
	 * Example: Given a smaller string 5 and a bigger string b, design an algorithm to 
	 * find all permutations of the shorter string within the longer one. Print the 
	 * location of each permutation.
	 */

	public static void findPerm(String s, String b) {
		
		class Node {
			int[] count = new int[256];
			Node() {
				for(char c : s.toCharArray()) {
					++count[c];
				}
			}
		}
		
		loops:
		for(int i = 0; i < b.length(); ++i) {
			Node n = new Node();
			int begin = i;
			for(int j = 0; j < s.length(); ++j, ++i) {
				if(--n.count[b.charAt(i)] < 0) {
					continue loops;
				}
			}
			System.out.println("Array at " + begin + " length of " + s.length());
		}
		
	}
	
	public static void main(String args[]) {
		findPerm("abbc", "cbabadebbabbeabbcwefwefbbac");
	}
}
