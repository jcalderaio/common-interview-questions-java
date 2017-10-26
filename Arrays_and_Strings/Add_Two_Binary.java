package Arrays_and_Strings;
import java.util.*;

public class Add_Two_Binary
{
	
	//Takes two strings of binary numbers, adds them, and prints the result in binary (cannot use Math class
	public static void addBinary(String a, String b) {
		ArrayList<Character> c = new ArrayList<Character>();
		
		
		//Make sure you know which one is longer (a)
		if(b.length() > a.length()) {
			String temp = a;
			a = b;
			b = temp;
		}
		
		int carry = 0;  //Carry bit
		for(int i = b.length() - 1, j = a.length() -1;  j >=0; --i, --j) {
			
			int sum = 0;
			if(i < 0) {
				sum = carry + Character.getNumericValue(a.charAt(j));  //Finish the rest of A
			}
			else {
				sum = carry + Character.getNumericValue(a.charAt(j)) + Character.getNumericValue(b.charAt(i));  //Do the shorter string first
			}
			
			if(sum == 0) {
				c.add(0, '0');
				carry = 0;
			}
			else if(sum == 1) {
				c.add(0, '1');
				carry = 0;
			}
			else if(sum == 2) {
				c.add(0, '0');
				carry = 1;
			}
			else {
				c.add(0, '1');
				carry = 1;
			}
		}
		
		if(carry == 1) {
			c.add(0,'1');
		}
		
		for(int i = 0; i < c.size(); ++i) {
			System.out.print(c.get(i));
		}
	}
	
	public static void main(String args[]) {
		addBinary("11","1110");
	}

}
