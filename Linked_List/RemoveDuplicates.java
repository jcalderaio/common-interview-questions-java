package Linked_List;
import java.util.*;


/*
 * Write code to remove duplicates from an unsorted linked list.
 */
public class RemoveDuplicates extends LinkedList
{

	public static void main(String[] args)
	{
		//Adds each item to ArrayList. Checks if item in list, and if is it deletes duplicaite
		RemoveDuplicates list = new RemoveDuplicates(5);
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(3);
		list.add(9);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(10);
		list.print();
		list.removeDuplicatesHash();
		list.print();
		
		//Copies over to a set (which doesnt allow duplicates) and back
		RemoveDuplicates listSet = new RemoveDuplicates(5);
		listSet.add(5);
		listSet.add(1);
		listSet.add(3);
		listSet.add(3);
		listSet.add(9);
		listSet.add(7);
		listSet.add(7);
		listSet.add(7);
		listSet.add(10);
		System.out.println("\n");
		listSet.print();
		RemoveDuplicates listsetNew = listSet.removeDuplicatesSet();
		listsetNew.print();
		
		//Uses two pointers and loops to remove the duplicate
		RemoveDuplicates listNoBuff = new RemoveDuplicates(5);
		listNoBuff.add(5);
		listNoBuff.add(1);
		listNoBuff.add(3);
		listNoBuff.add(3);
		listNoBuff.add(9);
		listNoBuff.add(7);
		listNoBuff.add(7);
		listNoBuff.add(7);
		listNoBuff.add(10);
		System.out.println("\n");
		listNoBuff.print();
		listNoBuff.removeDuplicatesNoBuffer();
		listNoBuff.print();
		
	}
	//Just the default constructor needed to extend the class to add the method
	RemoveDuplicates() {
		super();
	}
	//Just a constructor to override the base class
	RemoveDuplicates(Object data) {
		super(data);
	}
	
	
	/*
	 * In the below solution, we simply iterate through the linked list, adding 
	 * each element to a hash map. When we discover a duplicate element, we remove 
	 * the element and continue iterating. We can do this all in one pass since we are 
	 * using a linked list.
	 */
	void removeDuplicatesHash() {
		ArrayList<Object> buffer = new ArrayList<>();
		Node curr = head;
		Node previous = null;
		
		while(curr != null) {
			if(buffer.contains(curr.data)) {
				previous.next = curr.next;
			}
			else {
				buffer.add(curr.data);
				previous = curr;
			}
			curr = curr.next;
		}
	}
	
	/*
	 * In the solution below, we simply add the LinkedList to a set, which does not allow duplicates and 
	 * keeps everything sorted. Then, we copy everything back to the linked list.
	 */
	RemoveDuplicates removeDuplicatesSet() {
		HashSet<Object> set = new HashSet<>();   //create a hash set. A hash set does NOT allow duplicates and keeps objects sorted
		Node curr = head;         //set "this" linked lists head as curr
		
		while(curr != null) {     
			set.add(curr.data);     //adds everything from the list to the set
			curr = curr.next;
		}
		
		clear();                  //clears the current lists were working on (because the method is IN linked list)
		for(Object s : set) {
			this.add(s);      //transfers set back to linked list
		}
		return this;     //returns this linked list
	}
	
	void removeDuplicatesNoBuffer() {
		Node curr = head;
		while(curr != null) {
			Node runner = curr.next;
			Node pre = curr;
			while(runner != null) {
				if(curr.data == runner.data) {
					pre.next = runner.next;
				}
				else {
					pre = runner;
				}
				runner = runner.next;
			}
			curr = curr.next;
		}
	}
	
	
}
