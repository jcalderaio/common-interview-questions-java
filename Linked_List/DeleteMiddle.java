package Linked_List;
import java.util.*;

public class DeleteMiddle extends LinkedList
{
	//
	DeleteMiddle() {
		super();
	}
	
	DeleteMiddle(Object k) {
		super(k);
	}
	
	DeleteMiddle delMed(Node n) {
		
		while(true) {
			n.data = n.next.data;
			if(n.next.next == null) {
				n.next = null;
				break;
			}
			n = n.next;
		}
		return this;
	}
	
	public static void main(String args[]) {
		
		DeleteMiddle list = new DeleteMiddle("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		Node curr = list.head;
		while(curr.data != "D") {
			curr = curr.next;
		}
		DeleteMiddle k = list.delMed(curr);
		k.print();
		
	}

}
