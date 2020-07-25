class LinkedList {
    class Node {
        private int data;
        Node next = null;
        Node(int data) {
            this.data = data;
        }
    }
    
    private Node head = null;
    private Node tail = null;
    
    LinkedList() {}
    
    LinkedList(int data) {
        head = new Node(data);
        tail = head;
    }
    
    public void push_tail(int data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
            return;
        }
        
        Node current = head;
        
        while (current.next != null) {
            current = current.next;
        }
        
        current.next = new Node(data);
        tail = current.next;
    }
    
    public void push_head(int data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
            return;
        }
        
        Node n = new Node(data);
        n.next = head;
        head = n;
    }
    
    public void pop_tail() {
        if (head == null) {
            return;
        } 
        
        if (head == tail) {
            System.out.println("Popped tail: " + head.data);
            head = null;
            tail = null;
            return;
        }
        
        Node current = head;
        Node previous = null;
        
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        
        System.out.println("Popped tail: " + tail.data);
        previous.next = null;
        tail = previous;
    }
    
    public void pop_head() {
        if (head == null) {
            return;
        } 
        
        if (head == tail) {
            System.out.println("Popped head: " + head.data);
            head = null;
            tail = null;
            return;
        }
        
        System.out.println("Popped head: " + head.data);
        head = head.next;
    }
    
    public void delete_node(int index) {
        if (head == null) {
            return;
        }
        
        if (index == 0) {
            this.pop_head();
            return;
        }
        
        Node current = head;
        Node previous = null;
        
        for (int i = 0; i < index; ++i) {
            if (current == null) {
                return;
            }
            
            previous = current;
            current = current.next;
        }
        
        if (current.next == null) { // index is tail
            this.pop_tail();
            return;
        }
        System.out.println("Deleted node at index: " + index);
        previous.next = previous.next.next;
        tail = previous;
    }
    
    public void print_list() {
        if (this.head == null) {
            System.out.println("List Empty");
            return;
        }
        
        Node current = head;
        System.out.print("List = ");
        
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.data);
            } 
            else {
                System.out.print(current.data + " | ");
            }
            
            current = current.next;
        }
        System.out.println();
    }
    
    public void print_ends() {
        if (head != null) {
            System.out.println("Head: " + head.data + ",  Tail: " + tail.data);
        }
    }
    
    public static void main(String[ ] args) {
        LinkedList list = new LinkedList(1);
        list.push_tail(2);
        list.push_tail(3);
        list.push_tail(4);
        list.push_head(0);
        //list.pop_tail();
        //list.pop_head();
        list.print_list();
        list.print_ends();
        list.delete_node(4);
        list.print_list();
        list.print_ends();
    }
}
