package com.peopletech.lists;

public class LinkedListImp1 {

	     Entity head;
	    public static LinkedListImp1 insert(LinkedListImp1 list,String info)
	    {
	        Entity new_node=new Entity(info);
	        
	        
	        if(list.head ==null)
	            list.head=new_node;
	        else
	        {
	            Entity trav=list.head;
	            while(trav.next!=null)
	            {
	                trav=trav.next;
	            }
	            trav.next=new_node;
	        }
	        return list;        
	    }
   public static void printList(LinkedListImp1 list)
	    {
	        Entity curr=list.head;
	        System.out.println("LinkedList: ");
	        while(curr!=null)
	        {
	            System.out.print(curr.info+" --> ");
	            curr=curr.next;
	        }
	    }
   public static void main(String[] args) {
       LinkedListImp1 k=new LinkedListImp1();
       
       k.insert(k, "Kumar");
       k.insert(k, "Naresh");
       k.insert(k, "Shreyas");
       k.insert(k, "Raghu");
       k.insert(k, "Anil");
       k.insert(k, "Akhil");
    
       
       printList(k);
   }
}
class Entity{
           String info;
           Entity next;
		public Entity(String info) {
			this.info=info;
		}
}
