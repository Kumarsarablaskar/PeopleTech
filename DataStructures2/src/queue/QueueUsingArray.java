package queue;

public class QueueUsingArray {
  static int size=6;
  static int[] queue=new int[size];
  static int rear=-1,front=0;
  
  public static void initialize() {
	  rear=-1;
	  front=0;
  }
  
  public static boolean isEmpty() {
	  if(rear==-1 || front==size)
		  return true;
	  return false;
	  
  }
  
  public static boolean isFull() {
	 if(rear==size-1)
		 return true;
	 else {
		 return false;
	 }
	 
  }
  
  public static void enqueue(int val) {
	  if(isFull()) {
         System.out.println("Queue is Overflow");
         return;
	  }
	  rear++;
	  queue[rear]=val;
  }
  public static int dequeue() {
	  if(isEmpty()) {
		  System.out.println("Queue underflow");
		  return -1;  
	  }
	  int val=queue[front];
	  front++;
	  return val;
  }
  public void print(String message) {
  	System.out.println(message);
  	for(int i=front;i<=rear;i++) {
  		System.out.print("<--"+queue[i]);
  	}
  	System.out.println();
  }
  
  public static int peek() {
	  return queue[front];
  }
  
  	public static void main(String[] args) {
  		QueueUsingArray k=new QueueUsingArray();
  		System.out.println("is Empty? "+ k.isEmpty());
    	System.out.println("peek value: "+ k.peek());
    	k.enqueue(10);
    	k.enqueue(20);
    	k.enqueue(30);
    	k.enqueue(40);
    	k.enqueue(50);
    	k.enqueue(60);
    	k.print("Original Stack");
		
	}
}
