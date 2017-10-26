package Linked_List;
import java.util.*;

public class isPalindrome extends LinkedList
{
	isPalindrome() {
		super();
	}
	
	isPalindrome(Object o) {
		super(o);
	}
	
	boolean isPal(Node curr, Deque d) {
		
		if(curr != null) {
			d.push(curr.data);
			isPal(curr.next, d);
			if(curr.data != d.removeLast()) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		isPalindrome list =  new isPalindrome('p');
		list.add('o');
		list.add('o');
		list.add('o');
		Deque d = new ArrayDeque<>();
		System.out.print(list.isPal(list.head, d));
	}

}
