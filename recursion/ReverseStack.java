package recursion;

import java.util.Stack;

//Reverse a stack
public class ReverseStack {

  public static void reverse(Stack<Integer> st) {
         
       //Base condition
       if(st.isEmpty())
         return;

       int temp = st.pop();
       reverse(st);

       insertAtLast(st, temp);
  }

   public static void insertAtLast(Stack<Integer> stack, int elem){
     //If stack is empty, push the element in a stack.
     if(stack.isEmpty()){
         stack.push(elem);                                                                                                                  
         return;
     }

     //Pop elements from stack and keep it in a function call
     int topElem = stack.pop();

     //Push element at last
     insertAtLast(stack, elem);

      //Push all the popped elements in a stack
      stack.push(topElem);
   }

   public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.add(4);
        st.add(3);
        st.add(2);
        st.add(1);
        st.add(5);
        System.out.println(st);

        reverse(st);

        System.out.println(st);

 }
}