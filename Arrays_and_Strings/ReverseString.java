package Arrays_and_Strings;

/*
 * 	Implement a function which takes a string and reverses it
 */

public class ReverseString
{
	
	public static void main(String args[]) {
		
		
		System.out.println(reverse("fuck"));
		
		int a = 1;
		int b = 2;
		
		a = a*b;
		b = a/b;
		a = a/b;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		reverseFaster("PleaseWork!".toCharArray());
	
	}
	
	public static void reverseFaster(char[] str) {
		
		for(int i = 0; i < str.length/2; ++i) {
			char temp = str[i];
			str[i] = str[str.length-1-i];         //REMEMBER THIS PART!!!! SUBTRACT THE i!!!!
			str[str.length-1-i] = temp;
		}
		
		System.out.print(str);
	}
	
	public static String reverse(String str){
		
		int length = str.length();
		char[] temp = new char[length];
		
		for(int i = 0, b=length-1; i < length; ++i, --b) {
			
			temp[i] = str.charAt(b);
			
		}
		
		return new String(temp);
	}
	
	//Done in O(n) space and O(n) time complexity
	
}
