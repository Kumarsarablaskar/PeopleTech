package doubly;

public class DoublyLinkedListImp2 {
	Node head;
	public void push(double data) {
		Node new_nodes=new Node(data);
		new_nodes.next=head;
		new_nodes.prev=null;
		if(head!=null) {
			head.prev=new_nodes;
		}
		head=new_nodes;
		
	}
	public void printList(Node nodes)
    {
        Node last=null;
        System.out.println("\nTraversing in forwrd Direction......");
        while(nodes!=null)
        {
            System.out.print(nodes.data+ " <--> ");
            last=nodes;
            nodes=nodes.next;
        }
        
        System.out.println("\nTraversing in revers Direction......");
        while(last!=null)
        {
            System.out.print(last.data+ " <--> ");
            last=last.prev;
        }
    }
	public void insertAt(int index,double data)
    {
        Node new_nodes=new Node(data);
        int idx=1;
        if(head==null || data<1)
            System.out.println("Can not insert at "+index);
        else
        {
            Node curr=head;
            while(curr.next!=null)
            {           
                if(idx==index-1)
                {
                    new_nodes.next=curr.next;
                    new_nodes.prev=curr;
                    curr.next.prev=new_nodes;
                    curr.next=new_nodes;
                    break;
                }
                idx++;
                curr=curr.next;
            }
           
        }
    }
    public static void main(String[] args) {
        DoublyLinkedListImp2 k=new DoublyLinkedListImp2();
        k.push(95.00);
        k.push(25.20);
        k.push(10.00);
        k.push(65.40);
        k.push(185.90);
        
        k.printList(k.head);
        
        k.insertAt(4, 105.00);
        
        k.printList(k.head);
    }

}
 class Node{
	 double data;
	 Node next,prev;
	public Node(double data) {
		this.data=data;
	}
	 
 }