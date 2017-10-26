package Linked_List;

public class ReverseList extends LinkedList
{

	ReverseList() {
		super();
	}
	
	ReverseList(Object k) {
		super(k);
	}
	
	void reverseList() {
		Node curr = head;
		Node pre = null;
		while(curr != null) {
			Node temp = curr.next;
			curr.next = pre;
			pre = curr;
			curr = temp;
		}
		head = pre;
	}
	
	public static void main(String args[]) {
		ReverseList list = new ReverseList(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.print();
		list.reverseList();
		list.print();
	}
	
	
}
