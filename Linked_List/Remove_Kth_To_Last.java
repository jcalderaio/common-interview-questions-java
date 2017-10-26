package Linked_List;

public class Remove_Kth_To_Last extends LinkedList
{
	public static void main(String args[]) {
		
		Remove_Kth_To_Last list = new Remove_Kth_To_Last(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.remove_kth_to_last(2);
		list.print();
		
		
	}
	
	Remove_Kth_To_Last(int data) {
		super(data);
	}
	
	void remove_kth_to_last(int k) {
		
		Node current = head;
		int count = 0;
		
		while(current != null) {
			++count;
			current = current.next;
		}
		
		if(k>=count) {
			System.out.println("K is greater than size of list!");
			return;
		}
		
		current = head;
		for(int i = 0; i < (count-k-1); ++i) {
			current = current.next;
		}
		
		System.out.print(current.data);
		
	}

}
