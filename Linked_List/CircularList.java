package Linked_List;

public class CircularList
{

	class Node {
		
		int data;
		Node next = null;
		
		Node (int d) {
			this.data = d;
		}
		
	}
	
	Node head = null;
	
	CircularList() {}
	
	CircularList (int data) {
		if(head == null) {
			head = new Node(data);
			head.next = head;
			return;
		}
	}
	
	void add(int data) {
		if(head == null) {
			head = new Node(data);
			head.next = head;
			return;
		}
		
		Node current = head;
		while(current.next != head) {
			current = current.next;
		}
		
		Node temp = new Node(data);
		current.next = temp;
		temp.next = head;
	}
	
	int size() {
		if(head == null) {
			return 0;
		}
		
		int s = 1;
		Node current = head;
		while(current.next != head) {
			current = current.next;
			++s;
		}
		return s;
	}
	
	void print() {
		if(head == null) {
			System.out.print("Nothing in list!");
			return;
		}
		
		Node current = head;
		
		while(current.next != head) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		
		System.out.print(current.data + " ");
	}
	
	public static void main (String args[]) {
		
		
		CircularList c = new CircularList(5);
		c.add(4);
		c.add(3);
		c.add(90);
		c.add(3);
		//c.add(5);
		//c.add(23);
		//c.add(1);
		c.print();
		
		
		
	}
}
