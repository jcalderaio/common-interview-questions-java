package Trees;

public class Tree {
	
	class Node {
		
		int data;
		Node left;
		Node right;
		
		Node(int d) {
			data = d;
			left = null;
			right = null;
		}
	}
	
	public Node root = null;
	
	Tree(int data) {
		if(root == null) {
			root = new Node (data);
		}
	}
	
	void add(int data) {
		if(root == null) {
			root = new Node (data);
		}
		
		Node current = root;
		Node last = null;
		
		while(current != null) {
			if(data > current.data) {
				last = current;
				current = current.right;
			}
			else {
				last = current;
				current = current.left;
			}
		}
		
		if(data > last.data) {
			last.right = new Node(data);
		}
		else {
			last.left = new Node(data);
		}
	}
	
	void print(Node root) { 
		if(root != null) {
			print(root.left);
			System.out.print(root.data + " | ");
			print(root.right);
		}
	}
	
	public static void main(String args[]) {
		
		Tree tree = new Tree(5);
		tree.add(1);
		tree.add(15);
		tree.add(3);
		tree.print(tree.root);
		
	}
	
}

