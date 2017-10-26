package Arrays_and_Strings;

public class isRotation
{
	/*
	 * Assume you have a method isSubstring which checks if one word is a 
	 * substring of another. Given two strings, s1 and s2, write code to 
	 * check if s2 is a rotation of s1 using only one call to isSubstring 
	 * (e.g.,"waterbottle"is a rotation of "erbottlewat"
	 */
	public static boolean isRot(String s1, String s2) {
		if(s1.length() != s2.length() || s1.length() < 0) return false;
		StringBuffer str = new StringBuffer(s1);
		str.append(s1);
		return isSubstring.isSub(s2, str.toString());
		//or you can do...  return str.toString().contains(s2);
	}
	
	public static void main(String args[]) {
		System.out.print(isRot("waterbottle", "bottlewater"));
	}

}
