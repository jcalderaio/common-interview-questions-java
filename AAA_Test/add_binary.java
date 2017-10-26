package AAA_Test;

public class add_binary
{
	public static String addBinary(String a) {
		
		String result = "";
		
		for(byte i : a.getBytes()) {
			System.out.print(i);
		}
		
		return result;
		
	}
	
	public static void main(String args[]) {
		
		addBinary("10");
		
	}

}
