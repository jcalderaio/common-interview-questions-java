package Arrays_and_Strings;

/*
 * Implement a method to perform basic string compression using the counts of
 * repeated characters. For example, the string aabcccccaaa would become
 * a2blc5a3. If the "compressed" string would not become smaller than the original
 * string, your method should return the original string
 */

public class StringCompression
{

	public static void main(String[] args)
	{
		
		System.out.println(compression("aaa"));
		System.out.println(compression("awwllllpvvvvmnnnn"));

	}
	
	public static String compression(String str) {
		
		int count = 1;
		StringBuffer compactStr = new StringBuffer();
		char current = str.charAt(0);
		
		for(int i = 1; i < str.length(); ++i) {
			
			if(str.charAt(i) == current) {
				++count;
				continue;
			}
				
			compactStr.append(current);
			compactStr.append(count);
			count = 1;
			current = str.charAt(i);
			
		}
		
		compactStr.append(current);
		compactStr.append(count);
		
		return (compactStr.length() < str.length()) ? compactStr.toString() : str;
		
	}
	
	//This is almost the exact same algorithm
	public static String compression2(String s) {
		
		StringBuffer t = new StringBuffer();  //Use a StringBuffer as it is quicker
		
		
		for(int i = 0; i < s.length(); ) {   //Iterate throught the string
			
			int count = 0;
			char currChar = s.charAt(i);   
			
			while(s.charAt(i) == currChar) {   //Increase count if hit same letter multiple times
				
				++count;
				++i;
				if(i == s.length()) {   //
					break;
				}
			}
			
			t.append(currChar);
			t.append(count);
			
		}
		
		return (t.length() < s.length()) ? t.toString() : s;

	}

}
