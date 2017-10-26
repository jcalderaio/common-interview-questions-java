package Arrays_and_Strings;

public class needleHaystack
{
	public static int strStr(String haystack, String needle) {
		
		if(haystack == "" || needle == "" || needle.length() > haystack.length()){
            return -1;
        }
		
		int needleCount = needle.length();
		
		for(int i = 0; i < haystack.length(); ++i) {
			int j = 0;
			int index = i;
			if(haystack.charAt(i) == needle.charAt(j)) {
				while(haystack.charAt(i) == needle.charAt(j)) {
					++i;
					++j;
					if(j == needleCount) {
						return index;
					}
				}
				--i;
			}
		}
        
        return -1;
    }
	
	public static void main(String args[]) {
		System.out.print(strStr("", "a"));
	}

}
