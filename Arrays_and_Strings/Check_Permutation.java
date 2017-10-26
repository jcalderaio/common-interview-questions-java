package Arrays_and_Strings;
import java.util.*;

public class Check_Permutation
{
	
	/*
	 * This casts the character as an int in ASCII and increases at that index for string a, then decreases at same index
	 * for string b. If there is anything but a zero at that index after, means different amount of characters in the strings.
	 * 
	 */
	
	public static boolean compare2(String a, String b) {
		
		if(a.length() != b.length()) {     //If lengths unequal return false
			return false;
		}
		
		int[] check = new int[256];	//There are 256 ASCII characters
		
		for(int i = 0; i < a.length(); ++i) {   //The character will hash to an int
			++check[a.charAt(i)];
		}
		
		for(int j = 0; j < b.length(); ++j) {
			--check[b.charAt(j)];
			if(check[b.charAt(j)] != 0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	/*
	 * This is the sorting method (kinda iffy because I dont know what kind of sorting algorithm is being used here
	 */
	
	public static String sort(String s) {
		char[] temp = s.toCharArray();
		java.util.Arrays.sort(temp);
		return new String(temp);
	}
	
	public static boolean compare(String a, String b) {
		
		if(a.length() != b.length()) { 
			return false;
		}
		
		return sort(a).equals(sort(b));
		
	}
	
	//MAIN
	
	public static void main(String args[]) {
		
		System.out.println( compare2("john", "nojh") );
		
		//completely separate
		ArrayList<String> h = new ArrayList<String>();
		h.add("asd");
		h.add("wht");
		h.add("whwcrh");
		h.add("sdsd");
		//copying ArrayList to array
		String[] a = h.toArray( new String[h.size()]);
		System.out.print(Arrays.toString(a));
		
	}

}
