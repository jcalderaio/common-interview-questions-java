package Linked_List;

//Recursively print a linked list in reverse order
public class recursivePrintReverse extends LinkedList
{
	recursivePrintReverse() {
		super();
	}
	
	recursivePrintReverse(Object o) {
		super(o);
	}
	
	void recPrintRev(Node curr) {
		//At the end of the stack call. Returns from here back to the last call
		if(curr == null) {
			return;
		}
		else {
			recPrintRev(curr.next); //I make the recursive call here because I want to go to the last node before I do anything
			System.out.print(curr.data + " | ");  //I do the printing here because it wont get called until the base case (curr == null)
		}
	}
	
	//OR
	
	void recPrintRev2(Node curr) {
		//At the end of the stack call. Returns from here back to the last call
		if(curr != null) {
			recPrintRev(curr.next); //I make the recursive call here because I want to go to the last node before I do anything
			System.out.print(curr.data + " | ");  //I do the printing here because it wont get called until the base case (curr == null)
		}
	}
	
	public static void main(String args[]) {
		recursivePrintReverse list =  new recursivePrintReverse(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.recPrintRev(list.head);
		
		System.out.println("\n");
		
		recursivePrintReverse list2 =  new recursivePrintReverse(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.recPrintRev(list.head);
	}
	

}
