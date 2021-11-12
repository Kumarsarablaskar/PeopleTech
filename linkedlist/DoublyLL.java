package linkedlist;

public class DoublyLL {
	Node1 head;
	int size;

	public boolean isEmpty() {
		return head == null;
	}

	public void addFront(int data) {
		if (head == null)
			head = new Node1(null, data, null);
		else {
			Node1 newNode = new Node1(null, data, head);
			head.prev = newNode;
			head = newNode;
		}
		size++;
	}

	public void addRear(int data) {
		if (head == null)
			head = new Node1(null, data, null);
		else {
			Node1 current = head;
			while (current.next != null) {
				current = current.next;
			}
			Node1 newNode = new Node1(current, data, null);
			current.next = newNode;
		}
		size++;

	}

	public void removeFront() {
		if (head == null)
			return;
		head = head.next;
		head.prev = null;
		size--;
	}

	public void removeRear() {
		if (head == null)
			return;
		if (head.next == null) {
			head = null;
			size--;
			return;
		}
		Node1 current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
		size--;
	}

	public void insertAt(int data, int index) {
		if (head == null)
			return;
		if (index < 1 || index > size)
			return;
		Node1 current = head;
		int i = 1;
		while (i < index) {
			current = current.next;
			i++;
		}
		if (current.prev == null) {
			Node1 newNode = new Node1(null, data, current);
			current.prev = newNode;
			head = newNode;
		} else {
			Node1 newNode = new Node1(current.prev, data, current);
			current.prev.next = newNode;
			current.prev = newNode;
		}
		size++;
	}
	public void removeAt(int index) {
		 if(head==null)
			 return;
		 if(index<1||index>size)
			 return;
		 Node1 current=head;
		 int i=1;
		 while(i<index) {
			 current=current.next;
			 i++;
		 }
		 if(current.next==null) {
			 current.prev.next=null;
		 }
		 else if(current.prev==null) {
			 current=current.next;
			 current.prev=null;
			 head=current;
		 }
		 else {
			 current.prev.next=current.next;
			 current.next.prev=current.prev;
		 }
		 size--;
	}
	public int size() {
		return size;
	}

	public void print() {
		Node1 current = head;
		while (current != null) {
			System.out.print(current.Data() + "<-->");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		DoublyLL dll = new DoublyLL();
		dll.addFront(25);
		dll.addFront(12);
		dll.addFront(5);
		dll.addFront(6);
		dll.addFront(8);
		dll.print();
		System.out.println();
		dll.addRear(85);
		dll.print();
		System.out.println();
		dll.removeFront();
		dll.print();
		System.out.println();
		dll.removeRear();
		dll.print();
		System.out.println();
		dll.insertAt(15, 1);
		dll.insertAt(965, 3);
		dll.print();
		System.out.println("\nSize: "+dll.size());
		dll.removeAt(3);
		dll.print();

	}
}

class Node1 {
	int data;
	Node1 prev;
	Node1 next;

	public Node1(int data) {

		this.data = data;
		prev = null;
		next = null;
	}

	public int Data() {
		return data;
	}

	public Node1(Node1 prev, int data, Node1 next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
}
