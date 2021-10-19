package stack;

public class DStack {
		int capacity=4;
		int stack[]=new int[capacity];
		int loc=0;
		
	    public void push(int data) {
	    	if(size()==capacity)
	    		expand();
	    
	    		stack[loc]=data;
	        	loc++;
	    	
	    	
	    }
	     
	    private void expand() {
			int length=size();
			int newStack[]=new int[capacity*2];
			System.arraycopy(stack, 0, newStack, 0, length);
			stack=newStack;
			capacity*=2;
			
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
	        	shrink();
	    	}
	    	return data;
	    }
	    private void shrink() {
			int length=size();
			if(length<=(capacity/2)/2)
			capacity=capacity/2;
			int newStack[]=new int[capacity];
			System.arraycopy(stack, 0, newStack, 0, length);
			stack=newStack;
			
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
			DStack k=new DStack();
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
			//System.out.println(k.pop());
			//System.out.println(k.pop());
			//System.out.println(k.pop());
			//System.out.println(k.pop());
			//System.out.println(k.pop());
			//System.out.println("Size of stack: "+k.size());
			k.pop();
			k.print();
			k.pop();
			k.print();
			k.pop();
			k.print();
			k.pop();
			k.print();
			k.pop();
			k.print();
			k.pop();
			k.print();
			//System.out.println("Empty ="+k.isEmpty());
			
			
			
		}
	}


