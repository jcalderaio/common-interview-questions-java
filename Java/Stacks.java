package Java;
import java.util.*;

public class Stacks
{
	public static void main(String args[]) {
		Stack<Character> s = new Stack<Character>();
		s.push('A');
		s.push('B');
		s.push('C');
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
