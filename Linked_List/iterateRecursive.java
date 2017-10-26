package Linked_List;

//simply recursively prints the data in a linked list

public class iterateRecursive extends LinkedList
{
	iterateRecursive() {
		super();
	}
	
	iterateRecursive(Object o) {
		super(o);
	}
	
	void iterateRec(Node curr) {
		
		if(curr == null) {
			return;
		}
		else {
			System.out.print(curr.data + " | ");
			iterateRec(curr.next);
		}
	}
	
	public static void main(String args[]) {
		iterateRecursive list =  new iterateRecursive(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.iterateRec(list.head);
	}
	
	
	

}
