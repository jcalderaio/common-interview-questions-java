package Java;

public class Stringbuffer
{

	
	
	//The problem with using regular strings and using "+" is that it copies a new copy over each time
	//With string buffer, you avoid this issue
	public static String joinWords(String []words) {
		
		StringBuffer sentence = new StringBuffer();
		
		for(String w : words) {
			sentence.append(w);
		}
		return sentence.toString();
	}
	
	public static void main (String args[]) {
		
		String [] w = new String[] {"yes", "no", "maybe", "so"};
		System.out.println(joinWords(w));
		
	}

}


