package Linked_List;



//Base linked list class to use for all other algorithms
public class LinkedList {
	
	public class Node {
		public Object data;
		public Node next = null;
		
		Node(Object d) {
			data = d;
		}
	}
	
	public Node head = null;
	
	public LinkedList() {}
	
	public LinkedList(Object data) {
		if(head == null) {
			head = new Node(data);
		}
	}
	
	public boolean add(Object data) {
		if(head == null) {
			head = new Node(data);
			return true;
		}
		
		Node current = head;
		
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = new Node(data);
		return true;
	}
	
	public boolean delete(Object data) {
		Node n = head;
		if(data == n.data) {
			head = n.next;
		}
		while(n.next != null) {
			if(n.next.data == data) {
				n.next = n.next.next;
				return true;
			}
			n = n.next;
		}
		
		return false;
		
	}
	
	public void print() {
		
		Node current = head;
		
		while(current != null) {
			System.out.print(current.data + " | ");
			current = current.next;
		}
		System.out.println();
	}
	
	public void clear() {
		head = null;
	}
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList(1);
		list.add(2);
		list.add("yo");
		list.delete("yo");
		list.print();
	}
}
	
