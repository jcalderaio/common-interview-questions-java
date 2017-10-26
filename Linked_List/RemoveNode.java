package Linked_List;


public class RemoveNode extends LinkedList
{
	
	public static void main(String args[]) {
		
		RemoveNode list = new RemoveNode(3);
		list.add(5);;
		list.add(1);
		list.add(3);
		list.add(9);
		list.remove(3);
		list.print();
		
	}
	
	RemoveNode(Object data)
	{
		super(data);
		// TODO Auto-generated constructor stub
	}

	boolean remove(Object data) {
		
		if(head.data == data) {
			Node temp = head.next;
			head.next = null;
			head = temp;
			return true;
		}
		
		Node current = head;
		
		while(current != null) {
			
			if(current.next.data == data) {
				current.next = current.next.next;
				return true;
			}
			current = current.next;
		}
		
		return false;
	}
	
	

}
