package Java;
import java.util.*;

public class Hashmap
{

	
	public static void main(String args[]) {
		
		HashMap<Integer, String> body = new HashMap<Integer, String>();
		
		body.put(5, "Billy");
		body.put(2, "Bobby");
		body.put(1, "Jake");
		body.put(2, "Zack");
		
		
		
		System.out.println(  body.get(2));
		
		
	}
	
}
