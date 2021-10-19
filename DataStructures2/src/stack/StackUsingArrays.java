package stack;

public class StackUsingArrays {
        int SIZE =6;
        int[] stack;
        int tos;
        
        StackUsingArrays(){
        	stack=new int[SIZE];
        	tos=-1;	
        }
        
        public boolean isEmpty() {
        	return tos<0;
        }
        
        public void push(int data) {
        	tos++;
        	if(tos==SIZE) {
        		System.out.println("Stack Overflow");
        		tos--;
        		return;
        	}
        	stack[tos]=data;
        }
        
        public void print(String message) {
        	System.out.println(message);
        	for(int i=tos;i>=0;i--) {
        		System.out.print("<--"+stack[i]);
        	}
        	System.out.println();
        }
        public int peek() {
        	if(tos==-1) {
        		System.out.println("Stack Underflow");
        		return -1;	
        	}
        	return stack[tos];
        	
        }
        
        public int pop() {
        	if(tos==-1) {
        		System.out.println("Stack Underflow");
        		return -1;
        	}
        	return stack[tos--];
        }
        
        public static void main(String[] args) {
        	StackUsingArrays k=new StackUsingArrays();
        	System.out.println("is Empty? "+ k.isEmpty());
        	System.out.println("peek value: "+ k.peek());
        	k.push(10);
        	k.push(20);
        	k.push(30);
        	k.push(40);
        	k.push(50);
        	k.push(60);
        	k.print("Original Stack");
			k.push(80);
			k.push(404);
			
		}
}
