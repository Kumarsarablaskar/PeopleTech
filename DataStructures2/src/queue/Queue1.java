package queue;

public class Queue1 {
	int queue[] = new int[5];
	int size;
	int front;
	int rear;

	public void enQueue(int data) {
		if (!isFull()) {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size++;
		} else {
			System.out.println("Queue is full");
		}
	}

	public int deQueue() {

		int data = queue[front];
		if (!isEmpty()) {
			front = (front + 1) % 5;
			size--;

		}
		else
			System.out.println("Queue is empty");
		
		return data;

	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {

		return size == 0;
	}

	public boolean isFull() {
		return size == 5;
	}

	public void print() {
		System.out.print("Elements: ");
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front + i) % 5] + " ");
		}
	}

	public static void main(String[] args) {
		Queue1 k = new Queue1();
		k.deQueue();
		System.out.println(k.isEmpty());
		System.out.println(k.isFull());
		k.enQueue(25);
		k.enQueue(28);
		k.enQueue(45);
		k.enQueue(89);
		k.print();
		System.out.println();
		k.deQueue();
		k.print();
		System.out.println();
		k.enQueue(22);

		k.enQueue(2);
		// k.enQueue(15);
		k.print();
		System.out.println();
		System.out.println("Size is: " + k.getSize());
		System.out.println(k.isEmpty());
		System.out.println(k.isFull());
		k.enQueue(45);

	}
}
