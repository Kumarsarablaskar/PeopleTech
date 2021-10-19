package cyclelinkedlist;

public class CycleLink {
	Entity head;

	public static void main(String[] args) {
		CycleLink list = new CycleLink();
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);

		list.print();
		list.head.next.next.next.next.next = list.head.next.next.next.next;
		System.out.println(list.hasCycle());

	}

	private boolean hasCycle() {
		Entity slow = head;
		Entity fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow)
				return true;
		}
		return false;

	}

	private void print() {
		Entity temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();

	}

	private void add(int data) {
		Entity newEntity = new Entity(data);
		if (head == null)
			head = newEntity;
		else {
			Entity temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newEntity;
		}
	}

}

class Entity {
	int data;
	Entity next;

	public Entity(int data) {
		super();
		this.data = data;
	}

}
