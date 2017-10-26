package Arrays_and_Strings;
import java.util.*;

public class ParseString
{
	
	public static void parseMe(String a, ArrayList<Integer> b, ArrayList<Character> c) {
		
		for(char i : a.toCharArray()) {
			if(Character.isDigit(i)) {
				b.add(Character.getNumericValue(i));
			}
			else {
				c.add(i);
			}
		}
	}
	
	public static void main(String args[]) {
		
		String a = "a1b2c3d4e5f6";
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Character> c = new ArrayList<Character>();
		parseMe(a, b, c);
		
		System.out.println(b.toString());
		System.out.println(c.toString());
		
	}
}
