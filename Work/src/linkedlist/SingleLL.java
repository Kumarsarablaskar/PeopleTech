package linkedlist;

public class SingleLL {
	static Node head;

	public void add(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void addAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;

	}

	public void addAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (index == 0) {
			addAtStart(data);

		} else {

			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}

			node.next = temp.next;
			temp.next = node;
		}
	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node temp = head;
			Node temp1 = null;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			temp1 = temp.next;
			temp.next = temp1.next;
			// System.out.println("temp1 "+temp1.data);
		}
	}

	public int length() {
		if (head == null) {
			return 0;
		}
		int count = 0;
		Node current = head;
		while (current != null) {
			count++;
			current = current.next;

		}
		return count;
	}

	public Node reverse(Node head) {
		if (head == null) {
			return null;
		}

		Node curr = head;
		Node prev = null;
		Node next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public boolean searchAnNode(int data) {
		if (head == null) {
			return false;
		}
		Node current = head;
		while (current != null) {
			if (current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

//	public static int getCount(Node head) {
//		if (head == null)
//			return 0;
//		else
//
//			return 1 + getCount(head.next);
//	}

	public static int countValuesInList(int search) {
		Node current = head;
		int count = 0;
		while (current != null) {
			if (current.data == search)
				count++;
			current = current.next;
		}
		return count;

	}

	public void print() {
		Node node = head;
		while (node.next != null) {
			System.out.print(node.data + "<-->");
			node = node.next;
		}
		System.out.println(node.data);
	}

	public static void main(String[] args) {
		SingleLL list = new SingleLL();
		System.out.println("Adding Elements");
		list.add(12);
		list.add(8);
		list.add(3);
		list.add(15);
		list.add(9);
		list.print();
		System.out.println("Inserting at first");
		list.addAtStart(15);
		list.print();
		System.out.println("Inserting at Index");
		list.addAt(0, 25);
		list.print();
		System.out.println("Delete at Index"); 
		list.deleteAt(2);
		list.print();
		System.out.println("length of the list is: " + list.length());
		System.out.println("searching of a node is: " + list.searchAnNode(5));
		System.out.println("searching of a node is: " + list.searchAnNode(9));
		head = list.reverse(head);
		System.out.println("reverse of a list");
		list.print();
//		System.out.println("count of nodes in list: " + list.getCount(head));
		System.out.println("count of nodes in list: " +list.countValuesInList(15));

	}

}

class Node {
	int data;
	Node next;
}