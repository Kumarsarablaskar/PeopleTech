package stack;

public class Stack1 {
	
	int stack[]=new int[5];
	int loc=0;
	
    public void push(int data) {
    	if(loc==5) {
    		System.out.println("Stack is full");
    	}
    	else {
    		stack[loc]=data;
        	loc++;
    	}
    	
    }
     
    public int pop() {
    	int data=0;
    	if(isEmpty()){
    		System.out.println("Stack is Empty");
    	}
    	else {
    		loc--;
        	data=stack[loc];
        	stack[loc]=0;	
    	}
    	return data;
    }
    public int peek() {
    	int data;
    	data=stack[loc-1];
    	return data;
    }
     	 	
    
    public void print() {
    	for(int n:stack) {
    		System.out.print(n+" ");
    	}
    	System.out.println();
    }
    
    public int size() {
    	return loc;
    }
    
    public boolean isEmpty() {
    	return loc<=0;
    }
    

    public static void main(String[] args) {
		Stack1 k=new Stack1();
		k.push(15);
		k.push(12);
		k.push(25);
		//System.out.println("Size is: "+k.size());
		//System.out.println(k.peek());
		k.push(85);
		k.push(89);
		k.push(155);
		k.print();
		//System.out.println("Size is: "+k.size());
		System.out.println(k.pop());
		System.out.println(k.pop());
		System.out.println(k.pop());
		System.out.println(k.pop());
		System.out.println(k.pop());
		System.out.println("Size of stack: "+k.size());
		System.out.println(k.pop());
		//System.out.println("Empty ="+k.isEmpty());
		
		
		
	}
}
