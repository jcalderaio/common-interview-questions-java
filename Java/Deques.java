package Java;
import java.util.*;

public class Deques
{
	
	public static void main(String args[]) {
		Deque d = new ArrayDeque<>();
		d.push('A');
		d.push('B');
		d.push('C');
		d.push('D');
		d.push('E');
		while(!d.isEmpty()) {
			System.out.println(d.removeLast());
		}
	}

}
