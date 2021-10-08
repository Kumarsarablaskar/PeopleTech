package single;

public class LinkedList {
    Node head;
    Node next; 
    public void add(int new_data){
      Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void insertAfter(Node prev_node, int new_data){
       if (prev_node == null){
         System.out.println("The given previous node cannot be null");
           return;
       }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
    public void printList() {
        Node tnode = head;
        while (tnode != null){
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
	public static void main(String[] args){
		
		LinkedList k = new LinkedList();
		k.head = new Node(1);
		k.head = new Node(2);
        
	}
}
class Node {
	int data;
	Node next;
	public Node(int data) {
		super();
		this.data = data;
	}
	 
}
