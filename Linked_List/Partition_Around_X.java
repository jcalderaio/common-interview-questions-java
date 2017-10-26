package Linked_List;
import java.util.*;

public class Partition_Around_X extends LinkedList
{
	Partition_Around_X() {
		super();
	}
	
	Partition_Around_X(int k) {
		super(k);
	}
	
	/*
	 * In this implementation, I add it to two ArrayLists and then copy it back over
	 */
	void partAroundX(int x) {
		
		ArrayList<Object> before = new ArrayList<Object>();
		ArrayList<Object> after = new ArrayList<Object>();
		Node curr = head;
		
		while(curr != null) {
			int i = (int) curr.data;   //I must cast Object as an int to see the object's value
			if(i < x) {
				before.add(curr.data);
			}
			else {
				after.add(curr.data);
			}
			curr = curr.next;
		}
		curr = head;
		for(Object o : before) {
			curr.data = o;
			curr = curr.next;
		}
		for(Object o : after) {
			curr.data = o;
			curr = curr.next;
		}
	}
	
	/*
	 * In this implementation I will use 2 linked lists then merge them
	 */
	
	Node partAroundX2(int x) {
		Node beforeHead = null;
		Node afterHead = null;
		Node curr = head;
		
		while(curr != null) {
			Node next = curr.next;
			if((int)curr.data < x) {
				curr.next = beforeHead;
				beforeHead = curr;
			}
			else {
				curr.next = afterHead;
				afterHead = curr;
			}
			curr = next;
		}
		
		Node newHead = beforeHead;
		while(beforeHead.next != null) {
			beforeHead = beforeHead.next;
		}
		beforeHead.next = afterHead;
		
		return newHead;
	}
	
	public static void main (String args[]) {
		Partition_Around_X list = new Partition_Around_X(6);
		list.add(3);
		list.add(9);
		list.add(5);
		list.add(6);
		list.add(1);
		list.partAroundX(5);
		list.print();
		
		
		Partition_Around_X list2 = new Partition_Around_X(6);
		list2.add(3);
		list2.add(9);
		list2.add(5);
		list2.add(6);
		list2.add(1);
		Node n = list2.partAroundX2(5);
		
		while(n != null) {
			System.out.print(n.data + " | ");
			n = n.next;
		}
		
	}
}
