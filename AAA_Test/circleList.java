package AAA_Test;

public class circleList
{
	class Node {
		Node next = null;
		Object data;
		
		Node(Object o) {
			data = o;
		}
	}
	
	Node head = null;
	
	public circleList(Object o) {
		if(head == null) {
			head = new Node(o);
			head.next =head;
		}
	}
	
	void add(Object o) {
		if(head == null) {
			head = new Node(o);
			head.next =head;
			return;
		}
		
		Node curr = head;
		while(curr.next != head) {
			curr = curr.next;
		}
		
		curr.next = new Node(o);
		curr.next.next = head;
	}
	
	void print() {
		Node curr = head;
		do {
			System.out.print(curr.data + " | ");
		}
		while(curr.next.next != head);
	}
	
	public static void main(String args[]) {
		circleList list = new circleList(1);
		list.add(2);
		//list.add(3);
		//list.add(4);
		//list.add(5);
		//list.add(6);
		list.print();
		

	}
}


