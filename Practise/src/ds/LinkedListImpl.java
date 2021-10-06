package ds;

public class LinkedListImpl {

    Entity2 head;
    public static LinkedListImpl insert(LinkedListImpl list,String data)
    {
        Entity2 new_node=new Entity2( data);
        
        
        if(list.head ==null)
            list.head=new_node;
        else
        {
            Entity2 trav=list.head;
            while(trav.next!=null)
            {
                trav=trav.next;
            }
            trav.next=new_node;
        }
        return list;        
    }
    public static void printList(LinkedListImpl list)
    {
        Entity2 curr=list.head;
        System.out.println("\nLinkedList: ");
        while(curr!=null)
        {
            System.out.print(curr.data+" --> ");
            curr=curr.next;
        }
    }
    
    public static LinkedListImpl insertInMiddle(LinkedListImpl list, String data , int index)
    {
        Entity2 new_node=new Entity2(data);
        new_node.next=null;
        Entity2 p1;
        int i=0;
        if(list.head!=null)
        {
            p1=list.head;
            while(p1.next!=null)
            {
                if(i==index)
                {
                	Entity2 temp=p1.next;
                    p1=new_node;
                    p1.next=temp;
                    break;
                }
                p1=p1.next;
                i++;
            }
        }
        else
            System.out.println("List is Empty...");
        return list;
    }
    public static LinkedListImpl remove(LinkedListImpl list, String data)
    {
        
        if(list.head==null)
            System.out.println("The List is Empty..");
        else
        {
            
            Entity2 curr=list.head;
            Entity2 curr2=curr.next;
            
            while(curr2.next!=null)
            {
                if(curr2.data==data)
                {
                    System.out.println(curr2.data+" == "+data);
                    Entity2 temp=curr2;
                    curr.next=curr2.next;
                    temp=null;
                    break;
                }
                curr=curr2;
                curr2=curr2.next;
            }
        }
        
        return list;
    }
    
    public static LinkedListImpl addFirst(LinkedListImpl list,String data)
    {
        Entity2 new_node=new Entity2(data);
        if(list.head==null)
        {
            list.head=new_node;
        }
        else
        {
            new_node.next=list.head;
            list.head=new_node;
        }
        return list;
    }
    
    public static void main(String[] args) {
        LinkedListImpl list=new LinkedListImpl();
        
        list.insert(list, "Kumar");
        list.insert(list, "Naresh");
        list.insert(list, "Shreyas");
        list.insert(list, "Raghu");
        list.insert(list, "Anil");
        list.insert(list, "Akhil");
        
        printList(list);
        
        list.insertInMiddle(list, "Preetham", 3);
        
        printList(list);
        
        list.insertInMiddle(list, "Avinash", 5);
        
        printList(list);
        
        list.remove(list, "Naresh");
        printList(list);
        
        list.addFirst(list, "Akhil");
        printList(list);
        
    }

 

}
class Entity2{
	String data;
	Entity2 next;
	public Entity2(String data) {
}
}
