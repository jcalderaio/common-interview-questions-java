package Linked_List;

public class test extends LinkedList
{
	test() {
		super();
	}
	
	test(Object i) {
		super(i);
	}
	
	public void reverse(Node node) {
		
		if(node != null) {
			
			reverse(node.next);
			System.out.print(node.data);
		}
		
	}
	
	public static void main(String args[]) {
		test list = new test('o');
		list.add('l');
		list.add('l');
		list.add('e');
		list.add('h');
		
		list.reverse(list.head);
	}

}
