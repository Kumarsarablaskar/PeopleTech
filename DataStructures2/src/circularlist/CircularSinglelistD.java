package circularlist;

public class CircularSinglelistD {
	Node head;
	
   public void insert(Node ins) {
	Node n = head;
	Node dev = head;
	if (dev == null) {
	head = ins;
	head.next = head;
	return;
	}
	while (dev.next != n) {
		dev = dev.next;
	}
	dev.next = ins;
	ins.next = head;
	}
    public void print(Node n) {
	Node devHead = n;
	Node dev = n;
	if (dev == null) {
	System.out.println(" Given CLL is empty");
	}
	do {
	System.out.print("->" + dev.data);
	dev = dev.next;
	} while (dev != devHead);
	System.out.println("->");
	}
	void delete(int pos) {
        int i = 1;
        Node h = head;
        Node dev = head;
        if(head == null) {
            System.out.println("list is empty");
        }
        else if(pos == 1){
            head = dev.next;
            while(dev.next != h) {
                dev =dev.next;
            }
            dev.next = head;
        }else{

            while(dev.next != h) {
                if(i == pos-1) {
                    dev.next = dev.next.next;
                    return;
                }
                dev = dev.next;
                i++;
            }
        }
    }
	public static void main(String[] args) {
		CircularSinglelistD csll = new CircularSinglelistD();
	   Node n1 = new Node(5);
	   csll.insert(n1);
	  Node n2 = new Node(8);
	  csll.insert(n2);
	  csll.print(csll.head);
      Node n3 = new Node(2);
	  csll.insert(n3);
	  Node n4 = new Node(15);
	  csll.insert(n4);
	  csll.print(csll.head);
	  csll.print(n3);
	  System.out.println("<--->");
	  csll.delete(3);
	  csll.print(csll.head);
   }
}


class Node {
	int data;
	Node next;
	Node(int data) {
	this.data = data;
	this.next = null;
	}
	}