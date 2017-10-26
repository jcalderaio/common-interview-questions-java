package Arrays_and_Strings;

public class isSubstring {
	
	/*
	 * check if a given string (a) is a substring 
	 * of another string (ab)
	 * 
	 * You can also accomplish this by using Java's
	 * built in String. class and use "String".contains(a).
	 */
	public static boolean isSub(String a, String ab) {
		
		for(int i = 0; i < ab.length(); ++i) {
			
			if(ab.charAt(i) == a.charAt(0)) {
				++i;
				for(int j = 1; j < a.length(); ++j, ++i) {
					if(ab.charAt(i) != a.charAt(j)) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		System.out.println(isSub("asub", "Strasubing"));
	}

}
