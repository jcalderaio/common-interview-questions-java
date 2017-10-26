package Linked_List;

/*
 * Forexample,supposeyouhadalinked lista1->a2->...->an->b1->b2->...->bn and you 
 * wanted to rearrange it into a1->b1->a2->b2->... ->an->bn.You do not know the 
 * length of the linked list (but you do know that the length is an even number).
Youcouldhaveonepointer pi(thefastpointer) moveeverytwo elementsforeveryone move 
that p2 makes. When pi hits the end of the linked list, p2 will be at the midpoint. 
Then, move pi back to the front and begin "weaving" the elements. On each iteration, 
p2 selects an element and inserts it after pi.
 */
public class runnerRearrange extends LinkedList
{
	
	runnerRearrange(Object data) {
		super(data);
	}
	
	void rearrange() {
		
		Node p1 = head.next;  //fast pointer (moves 2 for every 1 p2 move)
		Node p2 = head;       //slow pointer (moves 1 for every 2 p1 moves)
		
		while(p1.next != null) {
			p1 = p1.next.next;
			p2 = p2.next;
		}
		p1 = head;
		p2 = p2.next;
		while(p2.next != null) {
			Node temp = p2; //store the node to be moved
			p2 = p2.next;
			delete(temp.data);
			Node tempEarly = p1.next; //store p1's next node
			p1.next = temp;
			temp.next = tempEarly;
			p1 = p1.next.next;
		}
	}
	
	public static void main(String args[]) {
		
		runnerRearrange list = new runnerRearrange("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		list.add("a5");
		list.add("b1");
		list.add("b2");
		list.add("b3");
		list.add("b4");
		list.add("b5");
		list.rearrange();
		list.print();
	}
}
