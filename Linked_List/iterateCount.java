package Linked_List;

//simply recursively adds the number of Nodes

public class iterateCount extends LinkedList
{
	iterateCount() {
		super();
	}
	
	iterateCount(int o) {
		super(o);
	}
	
	//Counts the number of nodes in a linked list
	int iterCount(Node curr) {
		//The base case. Stops the recursive process if there is a null node
		if(curr == null) {
			return 0;
		}
		//The recursive process continues if there is another node
		else {
			return 1 + iterCount(curr.next);
		}
	}
	
	public static void main(String args[]) {
		iterateCount list = new iterateCount(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.print(list.iterCount(list.head));
	}

}
