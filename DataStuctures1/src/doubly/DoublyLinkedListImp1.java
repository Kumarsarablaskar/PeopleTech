package doubly;

public class DoublyLinkedListImp1 {

    Entity head;
    // Adding new Node to the beginning of list
    public void  push(int info)
    {
        Entity new_entity=new Entity(info);
        new_entity.next=head;
        new_entity.prev=null;
        if(head!=null)
        {
            head.prev=new_entity;
        }
        
        head=new_entity;
    }
    //Adding new Node after specified node in the list.
    public void insertAfter(Entity prev_entity, int info)
    {
        if(prev_entity==null)
        {
            System.out.println("The given previous Node cannot be  null");
            return;
        }
        Entity new_entity=new Entity(info);
        new_entity.next=prev_entity.next;
        prev_entity.next=new_entity;
        new_entity.prev=prev_entity;
            if(new_entity.next!=null)
                new_entity.next.prev=new_entity;
        
    }
    
    public void printList(Entity entity)
    {
        Entity last=null;
        System.out.println("Traversing in forward Direction......");
        while(entity!=null)
        {
            System.out.print(entity.info+ " <--> ");
            last=entity;
            entity=entity.next;
        }
        
        System.out.println("\nTraversing in reverse Direction......");
        while(last!=null)
        {
            System.out.print(last.info+ " <--> ");
            last=last.prev;
        }
    }
    public static void main(String[] args) {
        DoublyLinkedListImp1 list=new DoublyLinkedListImp1();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        
        list.insertAfter(list.head.next.next, 35);
        
        list.printList(list.head);
    }

 

}

 

class Entity
{
    int info;
    Entity next,prev;
    public Entity(int info) {
        this.info=info;
    }
    
}