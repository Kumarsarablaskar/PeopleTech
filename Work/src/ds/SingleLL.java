package ds;

public class SingleLL {
	Node head;

	public void insert(int data) {
		Node new_node = new Node();
		new_node.data = data;
		new_node.next = null;

		if (head == null) {
			head = new_node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}

	}

	private void increaseByOne() {

		SingleLL list1 = new SingleLL();
		reverse();

		if (head.data < 9) {
			head.data = head.data + 1;
		} else {
			Node temp = head;
//            temp.data  = 0;
//            temp.next.data = temp.next.data  +1;
			while (temp.data >= 9) {
				temp.data = 0;
				temp.next.data = temp.next.data + 1;
				temp = temp.next;
			}
		}

	}

	private void reverse() {
		if (isEmpty()) {
			System.out.println("list is empty");
		} else {
			Node next = null;
			Node prev = null;
			Node temp = head;
			while (temp != null) {
				next = temp.next;
				temp.next = prev;
				prev = temp;
				temp = next;
			}
			head = prev;
			// return head;
		}
	}

	private boolean isEmpty() {

		return false;
	}

	public void insertAtStart(int data) {
		Node new_node = new Node();
		new_node.data = data;
		new_node.next = null;
		new_node.next = head;
		head = new_node;

	}

	public void insertAtIndex(int index, int data) {
		Node new_node = new Node();
		new_node.data = data;
		new_node.next = null;
		if (index == 0) {
			insertAtStart(data);
		}
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		new_node.next = temp.next;
		temp.next = new_node;
	}

	private void print() {
		Node new_node = head;
		while (new_node.next != null) {
			System.out.print(new_node.data + "-->");
			new_node = new_node.next;
		}
		System.out.println(new_node.data);

	}

	public static void main(String[] args) {
		SingleLL list = new SingleLL();
		list.insert(1);
		list.insert(9);
		list.insert(9);
		list.insert(9);
		list.print();
//		list.insert(222);
//		//list.insertAtStart(523);
//		list.insertAtIndex(0, 25);
		list.increaseByOne();
		list.reverse();
		list.print();
	}

}

class Node {
	int data;
	Node next;
}